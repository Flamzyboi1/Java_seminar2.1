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
				&& (inputTitle.matches("[A-Za-z ]{3,20}"))) {
			Title = inputTitle;
		}
		else
		{
			Title = "Unknown";
		}
	}
			public void setVehicleCode() {
				VehicleCode = Id + " "+ Title;
				}
			  public void setPrice(float inputPrice) {
			    	if(inputPrice > 0 && inputPrice <=1000000) {
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
						setVehicleCode();
						setPrice(45500.700f);
						seteType(EnergyType.electric);
					
					
					}
				//5. arg constructor
				public Vehicle(String inputTitle,float inputPrice,EnergyType inputeType){
					setId();
				    setTitle(inputTitle);
				    setVehicleCode();
				    setPrice(inputPrice);
				    seteType(inputeType);
				 
				 }
				//6. to string
				public String toString() {
					String result = Id + ": " + Title+ " " + "("+ VehicleCode +")"  + " " + Price + " EUR, " +"(" + eType + ")" ;
					return result;
				}
				
				
	}


