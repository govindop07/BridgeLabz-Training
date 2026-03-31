package collections.oceanFleet;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		VesselUtil util = new VesselUtil();

		System.out.println("Enter the number of vessels you want to enter: ");
		int n = Integer.parseInt(sc.nextLine());

		System.out.println("Enter vessel details in the formate - vesselId:vesselName:averageSpeed:vesselType");
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			String details[] = line.split(":");

			Vessel vessel = new Vessel(details[0], details[1], Double.parseDouble(details[2]), details[3]);
			util.addVesselPerformance(vessel);

		}

		System.out.println("Enter the vesselId to check speed: ");
		String searchId = sc.nextLine();
		Vessel vessel = util.getVesselBytID(searchId);

		if (vessel != null) {
			System.out.println(vessel.getVesselID() + " | " + vessel.getVesselName() + " | " + vessel.getVesselType()
					+ " | " + vessel.getVesselSpeed() + " knots");
		} else {
			System.out.println("Vessel Id " + searchId + " not found");
		}

		System.out.println("High performance vessels are");

		List<Vessel> highPerf = util.getHighPerformanceVessels();
		highPerf.forEach(v -> System.out.println(v.getVesselID() + " | " + v.getVesselName() + " | " + v.getVesselType()
				+ " | " + v.getVesselSpeed() + " knots"));

		sc.close();
	}
}
