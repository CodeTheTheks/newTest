
public class ReverseNumber {
	public static void main(String[] args) {
		int n = 12345;
		 int t,r = 0;
		 System.out.println("The Original number is " + n);
		 do{
		 t = n % 10;
		 r = r * 10 + t;
		 n = n / 10;
		 }while (n > 0);
		 System.out.println("The reverse Number is"+ r);
	}

}
