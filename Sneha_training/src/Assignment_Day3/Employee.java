package Assignment_Day3;

public class Employee extends Person {
	
	public void  empDetails(String name)
	{
		System.out.println("Employee " +name);
	}
	public static void main(String[] args)
	{
		
		Employee e = new Employee();
		 e.empDetails("Sneha Agrawal");
		 Person p = new Person();
		 p.empDetails("Joe");
	}
}
