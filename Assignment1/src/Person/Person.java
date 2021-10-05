package Person;

public class Person {
	String name;
    long phone_number;
    String address;
    
    
    public void details()
    {
    	System.out.println("name :"+name);
    	System.out.println("Address :"+address);
    	System.out.println("Phone number :"+phone_number);
    }
    public void hoby()
    {
    	System.out.println(name+" Hobby is reading books");
    }


}
