package webforce3.poo.tele;

public class Television {
	/*
	 * la convention nous conseille de déclarer les variable en private Coder en
	 * anglais Commenter en anglais
	 */
	private int size;
	private String brand;
	private String serialNumber;
	User user;

	/*
	 * next step: create the constructor To initialize instance's attibutes
	 */

	
    
	public Television(int size, String brand, String serialNumber, User user) {
		this.size = size;
		this.brand = brand;
		this.serialNumber = serialNumber;
		this.user = user;

	}

	// create getters and setters

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerailNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
