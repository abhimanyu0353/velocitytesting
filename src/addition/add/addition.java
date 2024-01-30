package addition.add;

public class addition {
	

	static String s = "60fdf5ffrf80frfr4fr5";

	public static void main(String[] args) {
		String number = "";
		int temp = 0;
		int flag = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {

				number = number + s.charAt(i);
				flag=1;

				if (i != (s.length() - 1))
					continue;

			}
			
			if (flag==1)
			{
				int num=Integer.parseInt(number);
				number="";
				temp=num+temp;
				flag=0;
		}
			}

		System.out.println(temp);

		

}}
