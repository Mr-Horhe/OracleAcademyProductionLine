package productionline;

import java.util.Date;

public abstract class Product implements Item, Comparable<Product>{
	private String name;
	private int serialNumber;
	private Date manufacturedOn = new Date();
	private String manufacturer = MANUFACTURER;
	static private Integer currentProductionNumber = 1;
	
	public Product(String name) {
		this.name = name;
		serialNumber = currentProductionNumber;
		currentProductionNumber++;
	}
	
	@Override
	public void setProductionNumber(int val) {
		this.currentProductionNumber = val;
	}

	@Override
	public void setName(String name) {
		this.name=name;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public Date getManufactureDate() {
		// TODO Auto-generated method stub
		return manufacturedOn;
	}

	@Override
	public int getSerialNumber() {
		// TODO Auto-generated method stub
		return serialNumber;
	}
	
	@Override
	public String toString() {
		return "Manufacturer: " + manufacturer + "\nSerial Number: " + serialNumber + "\nDate: "
				+ manufacturedOn.toString() + "\nName: " + name;
	}
	
	@Override
	public int compareTo(Product prod) {
		if (name.compareTo(prod.name)< 0) {
			return -1;
		}
		else if(name.compareTo(prod.name) == 0) {
			return 0;
		}
		else {
			return 1;
		}
	}
}
