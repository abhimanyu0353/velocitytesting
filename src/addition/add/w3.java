package addition.add;


public class w3 {
	
	int eno;
	String name;
	
	w3(int eno,String name){
		this.eno=eno;
		this.name=name;
		
	}
	void display() {
		System.out.println(eno+""+name);
	}
	
	public static void main(String[] args) {
		w3 e=new w3(3, "ra");
		e.display();
	}

	
}
