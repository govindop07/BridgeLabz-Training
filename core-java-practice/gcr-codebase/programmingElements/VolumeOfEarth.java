package programmingElements;

public class VolumeOfEarth {
	public static void main(String[] args) {
		int radiusOfEarthInKM = 6378;
		double radiusOfEarthInMiles = radiusOfEarthInKM * 0.6;
		
				
		double volumeInKM = (4.0/3.0) * Math.PI * Math.pow(radiusOfEarthInKM, 3);
		double volumeInMiles = (4.0/3.0) * Math.PI * Math.pow(radiusOfEarthInMiles, 3);
		
		System.out.println("The volume of Earth in cubic kilometers is " + volumeInKM + " and in cubic miles is " + volumeInMiles);
	}
}
