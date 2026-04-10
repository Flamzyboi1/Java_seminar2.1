package service;

import java.util.ArrayList;
import java.util.Arrays;

import model.Bus;
import model.EnergyType;
import model.Purchase;
import model.Vehicle;

public class mainService {
	public static ArrayList<Vehicle> allVehiclesInStore = new ArrayList<Vehicle>();
	
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
		
		allVehiclesInStore.addAll(Arrays.asList(b1,b2,T1,T2));
		
		Purchase pur1 = new Purchase();
		System.out.println(pur1);
		Purchase pur2 = new Purchase("XX98765");
		pur2.addVehicleToShoppingListByVehicleCode("2 Tesla", 1);
		pur2.addVehicleToShoppingListByVehicleCode("3 Toyota", 1);
		System.out.println(pur2);
		
		
		System.out.println("------ALL VECHICLES IN THE STORE------");
		System.out.println(allVehiclesInStore);
		

		System.out.println("-------ALL VEHICLES IN THE STORE AFTER BUYING---------");
		System.out.println(allVehiclesInStore);

		pur2.removeVehicleFromShoppingListByVehicleCode("2 Tesla", 1);
		System.out.println(pur2);
		System.out.println(pur2.calculateShoppingListValue() + " EUR");

		System.out.println("-------ALL VEHICLES IN THE STORE AFTER BUYING BUT RETURNING 2 Tesla---------");
		System.out.println(allVehiclesInStore);
		
		System.out.println("------ALL VECHICLES IN THE STORE less than 10k------");
		try
		{
		ArrayList<Vehicle> vechiceleLess10k 
		= showVehicleIfPriceLessThan10000();
		System.out.println(vechiceleLess10k);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
		
		
	public static ArrayList<Vehicle> showVehicleIfPriceLessThan10000()
			throws Exception{
		ArrayList<Vehicle> result = new ArrayList<Vehicle>();
		for (Vehicle tempV: allVehiclesInStore) {
			if(tempV.getPrice()<10000) {
				result.add(tempV);
			}
		}
		if(result.isEmpty()) {
			throw new Exception("There is no vehicle in the store"+
		"which price is less than 10000Eur");
		}
		return result;
	}
	
	

}
