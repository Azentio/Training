package demo;

public class Employee extends Person {

	long MobNo;
	
	public void persondetails() {
		System.out.println("Name : " +Name);
		System.out.println("Address : " +Address);
		System.out.println("Empid : " +Empid);
		System.out.println("MobNo : " +MobNo);
	}
	public void employeeDetails()
	{
		System.out.println(Name+" Employee ID is "+Empid);
		System.out.println(Name+" MobNo is "+MobNo);	
	}
	

}
