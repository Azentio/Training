
public class MaximumValue {
	public static void main(String[] args) {
		int[] a= {3,1,5,2,5,6,9};
		int min,max;
		min=a[0];
		max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
				
		}
		System.out.println("Minimum value of the matrix is:"+min);
	
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
				
		}
		System.out.println("Maximum value of the matrix is:"+max);
	}


}
