package service;

import model.EnergyType;
import model.Vehicle;

public class Tractor extends Vehicle{
	//1. variable
	private String additionalTechniques;
	private boolean isOnlyLargeTires;
	//2. getters
	public String additionalTechniques() {
		return additionalTechniques;
	}
	public  boolean getisOnlyLargeTires() {
	    return isOnlyLargeTires;
	    }
	//3.setters
	
	public void setadditionalTechniques(String inputadditionalTechniques) {
		if(inputadditionalTechniques != null){
			additionalTechniques = inputadditionalTechniques;
		}
		else
		{
			additionalTechniques = "No additional techniques";
			}
		
	}
	
	
	public void setisOnlyLargeTires(boolean inputisOnlyLargeTires) {
		isOnlyLargeTires =inputisOnlyLargeTires; 
		
	}
	//4. no args constructor
		public Tractor() {
		 super();// this will call vehicle() no args constructor
		 setTitle("Honda Tractor");// i would like to change default vehicle name 
		 setVehicleCode();// need to call it because the title is changed
		
			setadditionalTechniques("AI-driven");
			setisOnlyLargeTires(true);
			
		}
		//5. args constructor
		public Tractor(String inputTitle,float inputprice,EnergyType inputetype,String inputadditionalTechniques, boolean inputisOnlyLargeTires) {
			super(inputTitle,inputprice, inputetype);
			setadditionalTechniques(inputadditionalTechniques);
			setisOnlyLargeTires(inputisOnlyLargeTires);
		}
		//6. to string
		public String toString() {
			String result = super.toString() +" "+additionalTechniques +" " + isOnlyLargeTires;
			return result;
	    	}
		
}
