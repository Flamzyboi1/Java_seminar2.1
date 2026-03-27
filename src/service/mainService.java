package service;

import model.EnergyType;
import model.Vehicle;

public class mainService {
	
	public static void main(String[] args) {
		Vehicle v1 = new  Vehicle();
		System.out.println(v1);
		Vehicle v2 = new Vehicle("Bicycle", 1509.66f,EnergyType.electric);
		System.out.println(v2);
	}

}
