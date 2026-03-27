package service;

import model.Bus;
import model.EnergyType;
import model.Vehicle;

public class mainService {
	
	public static void main(String[] args) {
		Vehicle v1 = new  Vehicle();
		System.out.println(v1);
		Vehicle v2 = new Vehicle("Bicycle", 1509.66f,EnergyType.electric);
		System.out.println(v2);
		Bus b1 = new Bus();
		System.out.println(b1);
		Bus b2 = new Bus("Toyota",(float) 5500.00,EnergyType.gas, 48,true);
		System.out.println(b2);
		Tractor T1 = new Tractor();
		System.out.println(T1);
		Tractor T2 = new Tractor("Robot Tractor",6754.66f,EnergyType.hybrid, "manual",false);
		System.out.println(T2);
		
		}
	

}
