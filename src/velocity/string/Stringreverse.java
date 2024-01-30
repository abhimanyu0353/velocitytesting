package velocity.string;

public class Stringreverse {
	public static void main(String[] args) {
		String s="hello world this is";
		//int i=s.length();
		String[] sp=s.split(" ");
	//	int l=split.length;
		//System.out.println(l);
		for(int m=sp.length;m>=1;m-- ) {
			System.out.println(sp[m-1]);
		
		}
	}

}
