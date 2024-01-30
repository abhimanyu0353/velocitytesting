package addition.add;

public class add {
	
	int eno;
	String name;
	
	add(int eno,String name){
		this.eno=eno;
		this.name=name;
	}
	
	void display() {
		System.out.println("roll number"+this.eno+"name"+this.name);
	}
	
	public static void main(String[] args) {
		add e=new add(1,"ad");
		e.display();
		System.out.println(e.toString());
	}
	
}
