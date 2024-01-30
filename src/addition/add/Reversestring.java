package addition.add;

public class Reversestring {
	public static void main(String[] args) {
		String s="is this hello world";
		String[] arr=s.split(" ");
		System.out.println(arr.length);
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
