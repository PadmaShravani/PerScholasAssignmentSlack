package com.Perscholas.OOp;
/*Methods to add: driveForward( ) increases miles by 10 and driveReverse( ) decreases miles by 10.
Print the miles, drive forward two times and then print the miles again - the output should be 0 and 20
Now drive reverse one time and then print the miles again - you should end up with 10 miles
 */
public class Car {
	private String make,model;
	private int yearBuilt;
	private int miles=10;
	
	public void driveForward() {
		System.out.println("increased miles by "+miles);
	}
	public void driveRiverse() {
		System.out.println("Decreased miles by ");
	}
	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYearBuilt() {
		return yearBuilt;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	
	
}
