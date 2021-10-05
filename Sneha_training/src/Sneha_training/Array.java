package Sneha_training;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	a[]= {11,32,24,55,87,90,53,69};
		int i=0;
		int max=a[i],min=a[i];
		
		for(i=0;i<8;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("largest no is= "+max);
		System.out.println("largest no is= "+min);
		
	}

}
