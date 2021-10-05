class Vehicle {
	String purpose = "domestic";
	int tyres = 4;
	public Vehicle (String p,int t){
		tyres = t;
		
	purpose =p;
	}
	public Vehicle (int t){
		tyres = t;
		
	}
	public Vehicle () {
		
	
		}
	public void computeValue (String p,int t) {
		if(p == "commertial") {
			System.out.println("1000");
		
		}else {
			System.out.println("500");
		}
}
}
	public class Car extends Vehicle {
		String purpose;
		int a;
		public Car(String purpose,int a)
		{
			this.purpose=purpose;
			this.a=a;
			
		}
		public void computeValue(String p,int t) {
			if(p == "commertial") {
				System.out.println("2000");
			
			}else {
				System.out.println("1000");
			}
		}
		
		
	
	public static void main (String[] args) {
	
		 Vehicle v = new Vehicle();
		 System.out.println("Purpose before declaring: "+v.purpose);
		 v.purpose = "commertial";
		 Vehicle v1 = new Vehicle("domestic", 4);
		 v.tyres=2;
		 Vehicle v2 = new Vehicle(3);
		 System.out.println("Purpose after declaring: "+v.purpose);
		 System.out.println("Purpose of the class object v1: "+v1.purpose);
		 System.out.println("Tyres of the object v: "+v.tyres);
		 System.out.println("Tyres of object v1 : "+v1.tyres);
		 System.out.println("Purpose of object v2: "+v2.purpose);
		 System.out.println("Tyres of object v2: "+v2.tyres);
		 v2.computeValue(v2.purpose,v2.tyres);
		 v.computeValue(v.purpose,v.tyres);
		 v1.computeValue(v1.purpose,v1.tyres);		
		 Car c1 = new Car("commertial",4);
		 c1.computeValue(c1.purpose, c1.tyres);
	}

}

