package arrays.arr;

public class Sortingdescending {
	
	public static void main(String[] args) {
		
		int a[]= {10,56,0,85,34,643};
		int var;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				//if condition to check for descending element thsat is firdst elemetn is smaller than second then 
				//only swap  otherwise continue looping
				if(a[i]<a[j]) {
					//swap element
					var=a[i];
					a[i]=a[j];
					a[j]=var;
				}
			}
		}
		
		//p[rintting arrayu elements usuing for reach loop
		for(int i:a) {
			System.out.println("array elemnts in descending"+i);
		}
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				//if condition to check for ascending element thsat is firdst elemetn is  greater than second then 
				//only swap  otherwise continue looping
				if(a[i]>a[j]) {
					//swap element
					var=a[i];
					a[i]=a[j];
					a[j]=var;
				}
			}
		}
		
		//p[rintting arrayu elements usuing for reach loop
		for(int i:a) {
			System.out.println("array elemnts in descending"+i);
		}
		
		
	}

}
