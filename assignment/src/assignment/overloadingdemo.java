package assignment;

public class overloadingdemo {
public void sum(int a,int b) {
	System.out.println("sum of"+a+"and"+b+"is:"+(a+b));
}
public int sum(int a,int b,int c)
{
	int area=a+b+c;
	System.out.println("sum of"+a+"and"+b+"b"+c+"is:"+ area);
	return area;
}
public static void main(String[] args)
{
	overloadingdemo odm=new overloadingdemo();
	odm.sum(10, 10);
	odm.sum(4, 7, 7);
}
}
