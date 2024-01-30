package arrays.arr;

public class Evenindexelement {
	int eno;
	String name;
	Evenindexelement(int eno,String ename){
		this.eno=eno;
		this.name=ename;
	}
	
	public static void main(String[] args) {
		Evenindexelement d=new Evenindexelement(1,"ad");
		System.out.println(d.toString());
	}
	
	/*

	public static void main(String[] args) {
		int a[]= {1,2,3,5,6,7};
		
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println("elements at evven indesx"+a[i]);
			}
		}
	}
	*/
}
