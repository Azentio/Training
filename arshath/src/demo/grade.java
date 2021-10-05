package demo;


public class grade {

	public static void main(String[] args) {
		int grade=90;
		
		if(grade == 100)
		{
			System.out.println("outstanding");
		}
		
		else if(grade >= 90)
		{
			System.out.println("Grade A");
		}
		
		else if(grade >= 80)
		{
			System.out.println("Grade B");
		}
		
		else if(grade >= 50)
		{
			System.out.println("Grade C");
		}
		
		else if(grade <= 50) {
			//System.out.println("Fail");
		}

	}

}