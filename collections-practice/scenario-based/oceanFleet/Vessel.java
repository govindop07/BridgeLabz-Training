package collections.oceanFleet;

public class Vessel {
	String vesselID;
	String vesselName;
	double vesselSpeed;
	String vesselType;

	public String getVesselID() {
		return vesselID;
	}

	public void setVesselID(String vesselID) {
		this.vesselID = vesselID;
	}

	public String getVesselName() {
		return vesselName;
	}

	public void setVesselName(String vesselName) {
		this.vesselName = vesselName;
	}

	public String getVesselType() {
		return vesselType;
	}

	public void setVesselType(String vesselType) {
		this.vesselType = vesselType;
	}

	public double getVesselSpeed() {
		return vesselSpeed;
	}

	public void setVesselSpeed(double vesselSpeed) {
		this.vesselSpeed = vesselSpeed;
	}

	public Vessel(String vesselID, String vesselName, double vesselSpeed, String vesselType) {
		this.vesselID = vesselID;
		this.vesselName = vesselName;
		this.vesselSpeed = vesselSpeed;
		this.vesselType = vesselType;
	}

}
