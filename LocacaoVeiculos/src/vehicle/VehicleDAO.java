package vehicle;
import java.util.ArrayList;


public class VehicleDAO {
	// Properties
	private ArrayList<VehicleBeans> vehicles = new ArrayList<VehicleBeans>();
	
	// Initializers
	public VehicleDAO() {
		setVehicle(new VehicleBeans("Fiat Siena", 2008));
		setVehicle(new VehicleBeans("Chevrolet Onix", 2010, "black"));
		setVehicle(new VehicleBeans("Ford Ka", 2012, "silver"));
		setVehicle(new VehicleBeans("Volkswagen Gol", 2014));
		setVehicle(new VehicleBeans("Jeep Renegade", 2016, "blue"));
	}

	// Getters & Setters
	public VehicleBeans getVehicle(int index) {
		return vehicles.get(index);
	}

	public ArrayList<VehicleBeans> getVehicles() {
		return vehicles;
	}

	public void setVehicle(VehicleBeans vehicle) {
		this.vehicles.add(vehicle);
	}
}
