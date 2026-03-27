package model;

public class Bus extends Vehicle{
	//1. variables
	private int numberofSeats;
	private  boolean hasBaggageDivision;
	//2. getters
	public int getnumberofSeats() {
		return numberofSeats;
	}
	public  boolean gethasBaggageDivision() {
	    return hasBaggageDivision;
	    }
	//3. setters
	public void setnumberofSeats(int inputnumberofSeats) {
		if(inputnumberofSeats >= 5 && (inputnumberofSeats <= 100)) {
			numberofSeats = inputnumberofSeats;
		    }
		    else
		    {
		    	numberofSeats = 5;
		    } 
		
	    }
	public void sethasBaggageDvision(boolean inputhasBaggageDivision) {
		hasBaggageDivision =inputhasBaggageDivision; 
		
	}
	//4. no arg constructors
	public Bus() {
	 super();// this will call vehicle() no args constructor
	 setTitle("Tesla");// i would like to change default vehicle name 
	 setVehicleCode();// need to call it because the title is changed
	
		setnumberofSeats(50);
		sethasBaggageDvision(true);
		
	}
	//5. args constructor
	public Bus(String inputTitle,float inputprice,EnergyType inputetype,int inputnumberofSeats, boolean inputhasBaggageDivision) {
		super(inputTitle,inputprice, inputetype);
		setnumberofSeats(inputnumberofSeats);
		sethasBaggageDvision(inputhasBaggageDivision);
	}
	//6. to string
	public String toString() {
		String result = super.toString() +" "+numberofSeats +" " + hasBaggageDivision;
		return result;
    	}
	}


