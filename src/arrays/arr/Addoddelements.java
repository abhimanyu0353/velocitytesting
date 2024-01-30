package arrays.arr;

public class Addoddelements {
	public static void main(String[] args) {
		int a[]= {1,2,3,5,6,7};
		int sum=0;
		for(int i=0;i<a.length;i++) {
		//condition to check for odd index
			if(i%2!=0) {
				sum=sum+a[i];
				System.out.println("elements at odd indesx"+a[i]);
			}
			
		}
		System.out.println("sum of odd indexed eelements"+sum);
	}

}
