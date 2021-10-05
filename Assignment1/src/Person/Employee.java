package Person;

public class Employee extends Person {
	int emp_ID; // own variable of Employee class
	double salary;// own variable of Employee class
	// same method name in parent class of Employee
	public void details()
    {
    	System.out.println("name :"+name);
    	System.out.println("Address :"+address);
    	System.out.println("Phone number :"+phone_number);
    	System.out.println(name+" employee ID is"+emp_ID);
    }
	//own method of Employee class
	public void employeeDetails()
	{
		System.out.println(name+" employee ID is"+emp_ID);
		System.out.println(name+" Salary is"+salary);	
	}
}
