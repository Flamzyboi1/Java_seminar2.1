package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

import service.mainService;

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
		if(inputUserCardNo != null && !inputUserCardNo.isEmpty()&& inputUserCardNo.matches("[A-Z]{2}[0-9]{5}")) {
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
	//no set function for datetime it will be added automatically
	//4. constructors
	public Purchase() {
		setUserCardNo("AB12345");
		//we dont need to call set function for shoppinglist because it is initialized
		//we ddont need to call set function for date time it is also initialized in variable declaration
		
	}
	public Purchase(String inputUserCardNo) {
		setUserCardNo(inputUserCardNo);
		//we dont need to call set function for shoppinglist because it is initialized
				//we ddont need to call set function for date time it is also initialized in variable declaration
	}
	//5. to string
	public String toString() {
		String result = userCardNo + ": " + shoppinglist + "["+ datetime + "]";
		return result;
	}
	//6. additional functions
	public void addVehicleToShoppingListByVehicleCode(String inputVehicleCode,int quantity) {
		//TODO check input parameters
		int howManyvecFindInStore = 0;
		for(int i = 0; i < mainService.allVehiclesInStore.size(); i++) {
			Vehicle tempV = mainService.allVehiclesInStore.get(i);
			if(tempV.getVehicleCode().equals(inputVehicleCode)) {
				mainService.allVehiclesInStore.remove(tempV);
				shoppinglist.add(tempV);
				howManyvecFindInStore++;
			}
		}
		if(quantity>howManyvecFindInStore) {
			System.out.println("There is no "+quantity + "Vechiles with code" +inputVehicleCode);
		}
		else {
			System.out.println("Vehicles are stored in the shopping list");
		}
	}
}
