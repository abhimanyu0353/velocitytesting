package arrays.arr;

public class Swapindex {
	public static void main(String[] args) {
		int [] a= {8,52,75,65,89,13};
		for(int i=0;i<a.length-1;i++) {
			if(i%2==0) {
				
				//logic of swapping first store first variable value in temp variable
				// then assign 2nd variable value to 1st 
				//and then assign first variables value which is stored in tgemp to 2nd variable
				int tmp=a[i];
				a[i]=a[i+1];
				a[i+1]=tmp;
			}
		}
		
		for(int j=0;j<=a.length-1;j++) {
			System.out.print(a[j]+" ");
		}
	}

}
