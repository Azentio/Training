package assignment;

 class person {
	 public void eat()
	   {
	      System.out.println("person is eating");
	   }
	}
	public class employee extends person{
	   public void eat(){
	      System.out.println("employee is eating");
	   }
	   public static void main( String args[]) {
		   employee obj = new employee();
	      obj.eat();
	   }
	}

