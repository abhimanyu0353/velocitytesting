package addition.add;

public class D {
	A a=new A();
	B b= new B();
	C c= new C();
	public void m10() {
		a.m3();
		b.m4();
		c.m9();
	}
	public void m11() {
		a.m2();
		c.m7();
	}
	
	public static void main(String[] args) {
		D d=new D();
		d.m10();
		d.m11();
	}


}
