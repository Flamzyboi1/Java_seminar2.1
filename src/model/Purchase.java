package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Purchase {
	//1.variable
	private String userCardNo;
	private ArrayList<Vehicle> shoppinglist = new ArrayList<Vehicle>();
	private LocalDateTime datetime = LocalDateTime.now();
	
	//getters
	public String getuserCardNo() {
		return userCardNo;
	}
	public ArrayList<Vehicle> getshoppingList(){
		return shoppinglist;
		
	}
	

}
