package AanchalB_Traning;

public class MinMax {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		   
		        int []a =new int[]{11,22,33,11,10,20,30};  

 
		        int min=a[0], max=a[0];  
		       
		        for (int i = 0; i< a.length; i++) 
		        {  
		            
		           if(a[i]<min)  
		               min=a[i];  
		        }  
		        System.out.println("Minimum element present in given array: " + min);  
		       
		        for (int i = 0; i < a.length; i++) 
		        {  
		            
		           if(a[i]>max)  
		               max=a[i];  
		        }  
		        System.out.println("Maximum element present in given array: " + max); 
		    }  
		


	}


