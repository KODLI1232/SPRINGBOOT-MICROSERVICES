package Com.self.Spring.Request;

public class CarInfo {

	
	private String modelName;
	private int modelYear;
	private String fuelType;
	private int price;
	
	public CarInfo() {
	
	}

	public CarInfo(String modelName, int modelYear, String fuelType, int price) {
		
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.fuelType = fuelType;
		this.price = price;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "CarInfo [modelName=" + modelName + ", modelYear=" + modelYear + ", fuelType=" + fuelType + ", price="
				+ price + "]";
	}
}
