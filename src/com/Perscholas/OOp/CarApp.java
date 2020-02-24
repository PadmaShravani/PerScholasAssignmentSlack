package com.Perscholas.OOp;
/*
 */
public class CarApp {
	public static void main(String args[]) {
		Car c=new Car();
		c.setMake("Ford");
		c.setModel("Mustang");
		c.setYearBuilt(2017);
		System.out.println(c.getMake()+","+c.getModel()+","+c.getYearBuilt());
	}
}
