package model;

public class Vehicle {
// 1.variable
	private int Id;
	private String Title;
	private String VehicleCode;
	private float Price;
	private EnergyType eType;
	
	private static int counter = 0;
	
	//2. Getters
	public int getId() {
		return Id;
	}
	public String getTitle() {
		return Title;
	}
	public String getVehicleCode() {
		return VehicleCode;
	}
	public float getPrice() {
		return Price;
	}
	public EnergyType geteType() {
		return eType;
	}
	//3.setters
	public void setId() {
    	Id = counter;
    	counter++;
    }
	public void setTitle(String inputTitle) {
		if((inputTitle != null) && (!inputTitle.isEmpty())
				&& (inputTitle.matches("[A-Za-z ]{3,100}"))) {
			Title = inputTitle;
		}
		else
		{
			Title = "Unknown";
		}
	}
			public void setVehicleCode(String inputVehicleCode) {
				if((inputVehicleCode!= null) && (!inputVehicleCode.isEmpty())
						&& (inputVehicleCode.matches("[A-Za-z ]{3,100}"))) {
					VehicleCode = inputVehicleCode;
				}
				else
				{
					VehicleCode = "Unknown";
				}
			VehicleCode = "Unknown";
		}
			  public void setPrice(float inputPrice) {
			    	if(inputPrice > 0 && inputPrice <=10000) {
			    		Price = inputPrice;
			    	}
			    	else {
			    		Price = 1;
			    	}
				}

				public void seteType (EnergyType inputeType) {
					if(inputeType!= null) {
						eType = inputeType;
					}
					else
					{
						eType = EnergyType.not_specified;
						}
					}
				//4. no - arg constructor
				public Vehicle() {
						setId();
						setTitle("Tesla");
						setVehicleCode("FO 256");
						setPrice(45.700f);
						seteType(EnergyType.electric);
					
					
					}
				//5. arg constructor
				
				
	}


