package arrays.arr;

public class dd {
	int eno;
	String name;
	dd(int eno,String ename){
		this.eno=eno;
		this.name=ename;
	}
	
	public static void main(String[] args) {
		dd d=new dd(1,"ad");
		System.out.println(d.toString());
	}
	/*
	int eno;
	String name;
	
	 dd(int eno,String name){
		this.eno=eno;
		this.name=name;
	}
	
	void display() {
		System.out.println("roll number"+this.eno+"name"+this.name);
	}
	
	public static void main(String[] args) {
		dd e=new dd(1,"ad");
		e.display();
	//	System.out.println(e.toString());
	}

*/
	}
