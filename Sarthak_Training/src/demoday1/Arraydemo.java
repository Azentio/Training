//Object[] a = {9,"S",true,3.21,"A"}
//ArrayList is Dynamic array

package demoday1;

public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] a = new int[4];
	
		int[] a = {9,10,8,7,8};
//		int sum = 1;
//		a[0] = 9;
//		a[1] = 10;
//		a[2] = 8;
//		a[3] = 0;
		int summ = a[0] + a[1];
		
		System.out.println(a[3]);
		System.out.println(a[1]);
		System.out.println(a.length);
		System.out.println("sum of two arrays = "+ summ);
		System.out.println("*********");
			
		//for
		for (int i = 0;i<a.length;i++) {
		System.out.println(a[i]);
	}
		System.out.println("*********");
		//for each (PREFERRED FOR ARRAYS)
		for(int i:a) {
			
			if(i==8) {
				break;
			}
			
			System.out.println(i);
		}
	}
}