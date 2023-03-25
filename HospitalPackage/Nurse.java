package HospitalPackage;

public class Nurse extends HospitalEmployee{
	//Variables
	int numOfPatients;
	
	//Constructor
	public Nurse(String name, int number, int numOfPatients)
	{
		super(name,number);
		this.numOfPatients = numOfPatients;
	}

	//Methods
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + number + " has " + numOfPatients + " patients.";
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println (name + " works for the hospital. " + name + " is a nurse with " + numOfPatients + " patients.");
	}	
	
}
