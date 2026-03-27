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
		if(inputnumberofSeats >= 0 && (inputnumberofSeats <= 2000)) {
			numberofSeats = inputnumberofSeats;
		    }
		    else
		    {
		    	numberofSeats = 1;
		    } 
		
	    }
	public void sethasBaggageDvision() {
		
	}
	}


