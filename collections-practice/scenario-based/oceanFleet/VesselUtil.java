package collections.oceanFleet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class VesselUtil {
	private List<Vessel> vesselList = new ArrayList<>();

	public List<Vessel> getVesselList() {
		return vesselList;
	}

	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
		System.out.println("Vessel added.");
	}

	public Vessel getVesselBytID(String id) {
		Optional<Vessel> vessel = vesselList.stream().filter(v -> v.getVesselID().equals(id)).findFirst();

		System.out.println("The vessel with id " + id + " is not found.");
		return vessel.orElse(null);
	}

	public List<Vessel> getHighPerformanceVessels() {
		double maxSpeed = vesselList.stream().mapToDouble(v -> v.getVesselSpeed()).max().orElse(0.0);

		return vesselList.stream().filter(v -> v.getVesselSpeed() == maxSpeed).collect(Collectors.toList());
	}

}