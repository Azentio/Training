
public class Gradesystem {

	public static void main(String[] args) {
		int mark=49;
		if(mark==100)
		{
			System.out.println("Outstanding");
		}
		else if(mark>=90 && mark<=99)
		{
			System.out.println("Grade A");
		}
		else if(mark>=80 && mark<=89)
		{
			System.out.println("Grade B");
		}
		else if(mark>=50 && mark<=79)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Sorry you are fail");
		}


	}

}
