package HospitalPackage;

public class Surgeon extends Doctor{
	//Variables
	Boolean operating;
			
	//Constructor
	public Surgeon(String name, int number, String specialty, Boolean operating)
	{
		super(name,number,specialty);
		this.operating = operating;
	}

	//Methods
	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return name + " " + number + " " + specialty + " Operating: " + operating;
	}	
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		String strTime = "";
		if(operating == true) 
			strTime = "now";
		System.out.println (name + " works for the hospital. " + name + " is operating " + strTime + ".");
	}
}
