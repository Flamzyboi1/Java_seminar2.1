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
	//setters
	public void setUserCardNo(String inputUserCardNo) {
		if(inputUserCardNo != null && !inputUserCardNo.isEmpty()&& inputUserCardNo.matches("[A-Z{2}[0-9]{5}")) {
			userCardNo =inputUserCardNo;
		}
		else {
			userCardNo = "AB12345";
		}
		
	}
	public void setShoppingList(ArrayList<Vehicle> inputShoppingList) {
		if(inputShoppingList != null && !inputShoppingList.isEmpty()){
			shoppinglist =inputShoppingList;
		}
	
	else 
	{
		shoppinglist = new ArrayList<Vehicle>();
	}

    }
}
