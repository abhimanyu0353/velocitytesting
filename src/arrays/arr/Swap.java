package arrays.arr;

public class Swap {
	
 public static void main(String[] args)
 {
	int a[]= {10,20,0,82,97};
	int min=a[0];
	int max=a[0];
	int maxpos=0,minpos=0;
	//maximum
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
			maxpos=i;
		}
	}
	System.out.println("maximum no"+max+"found at"+ maxpos);
	//minimum
	for(int i=0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
			minpos=i;
		}
	}
	System.out.println("minimum no"+min+"found at"+minpos);
	
	//swapping
	int tmp;
	tmp=a[maxpos];
	a[maxpos]=a[minpos];
	a[minpos]=tmp;
//aftger swapping array elements	
	System.out.println("array elements after swappoing");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
 }
}
