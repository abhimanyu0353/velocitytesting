package addition.add;

public class fd {
	int eno;
	String name;
	
	 public fd(int eno,String name){
		this.eno=eno;
		this.name=name;
	}
	
	void display() {
		System.out.println("roll number"+this.eno+"name"+this.name);
	}
	
	public static void main(String[] args) {
		fd e=new fd(1,"ad");
		e.display();
		System.out.println(e.toString());
	}


}
