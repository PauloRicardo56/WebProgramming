package vehicle;


public class VehicleBeans {
	// Properties
	private String model;
	private int year;
	private String color;
	
	// Initializers
	public VehicleBeans(String model, int year) {
		setModel(model);
		setYear(year);
		setColor("white");
	}
	
	public VehicleBeans(String model, int year, String color) {
		this(model, year);
		setColor(color);
	}

	// Getters & Setters
	public String getModel() {
		return model;
	}

	private void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	private void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
