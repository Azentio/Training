
public class Overloadingdemo {
public void sum(int a,int b) {
	
	System.out.println("Sum of "+a+" And"+b+" is :"+(a+b));
}
public int sum(int a,int b,int c)
{
	int area=a+b+c;
	System.out.println("Sum of"+a+" and "+b+" b "+c+" is :"+area  );
	return area;
}
	
	public static void main(String[] args)
	{
	Overloadingdemo odm=new Overloadingdemo();
	odm.sum(10, 10);
	odm.sum(4, 7, 7);
	}
}
