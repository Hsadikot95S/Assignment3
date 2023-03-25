package HospitalPackage;

public class Doctor extends HospitalEmployee{
	//Variables
	String specialty;
		
	//Constructor
	public Doctor(String name, int number, String specialty)
	{
		super(name,number);
		this.specialty = specialty;
	}

	//Methods
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + number + " " + specialty;
	}	
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println (name + " works for the hospital. " + name + " is a (n) " + specialty + " doctor.");
	}	
}
