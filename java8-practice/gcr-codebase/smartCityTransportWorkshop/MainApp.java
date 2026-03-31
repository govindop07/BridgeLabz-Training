import interfaces.*;
import services.*;
import model.PassengerTrip;

import java.util.*;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {

        List<TransportService> services = Arrays.asList(
                new BusService("A-B", 30, 540),
                new MetroService("A-C", 50, 510),
                new TaxiService("A-D", 120, 500)
        );

        // Lambda: Filter & Sort by earliest departure
        services.stream()
                .filter(s -> s.getFare() <= 100)
                .sorted(Comparator.comparingInt(TransportService::getDepartureTime))
                .forEach(TransportService::printServiceDetails);

        System.out.println("\n Dashboard Live Services: ");

        // Method Reference + forEach
        services.forEach(TransportService::printServiceDetails);

        // Functional Interface with Lambda
        FareCalculator taxiFare = distance -> distance * 15;
        System.out.println("\nTaxi Fare for 10km: $" + taxiFare.calculateFare(10));

        // Passenger Data Analysis with Collectors
        List<PassengerTrip> trips = Arrays.asList(
                new PassengerTrip("A-B", 30, true),
                new PassengerTrip("A-B", 30, false),
                new PassengerTrip("A-C", 50, true),
                new PassengerTrip("A-D", 120, true)
        );

        // groupingBy
        Map<String, List<PassengerTrip>> tripsByRoute = trips.stream().collect(Collectors.groupingBy(PassengerTrip::getRoute));

        // partitioningBy
        Map<Boolean, List<PassengerTrip>> peakTrips = trips.stream().collect(Collectors.partitioningBy(PassengerTrip::isPeakHour));

        // summarizingDouble
        DoubleSummaryStatistics revenueStats = trips.stream().collect(Collectors.summarizingDouble(PassengerTrip::getFare));

        System.out.println("\nTrips by Route: " + tripsByRoute.keySet());
        System.out.println("Peak Trips Count: " + peakTrips.get(true).size());
        System.out.println("Total Revenue: $" + revenueStats.getSum());
        System.out.println("Average Fare: $" + revenueStats.getAverage());
    }
}
