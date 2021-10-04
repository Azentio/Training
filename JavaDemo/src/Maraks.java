
public class Maraks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int marks[] = new int[6];
	        int i;
	        float total=60, avg;
	        
	        for(i=0; i<6; i++) { 
	        
	           marks[i] = marks.length;
	           total = total + marks[i];
	        }
	       
	        //Calculating average here
	        avg = total/6;
	        System.out.println("The student Grade is: ");
	        if(avg>=80)
	        {
	            System.out.println("A");
	        }
	        else if(avg>=60 && avg<80)
	        {
	           System.out.println("B");
	        } 
	        else if(avg>=40 && avg<60)
	        {
	            System.out.println("C");
	        }
	        else
	        {
	            System.out.println("D");
	        }
	}

}
