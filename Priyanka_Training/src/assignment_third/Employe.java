package assignment_third;

public class Employe extends Person
{
	public void  empDetails(String name, int age)
	{
		System.out.println("Employee " +name+ " age "+age);
	}
	
	public static void main(String[] args)
	{
		
		Employe e = new Employe();
		 e.empDetails("priyanka", 24);
		 
		 
		 Person p = new Person();
		 p.empDetails("Riya",25);
	}

}
