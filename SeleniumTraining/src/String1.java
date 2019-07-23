
public class String1 {
	public static void main(String args[]) {
	
		String s1 ="java";
		
		char ch[] = {'s','t','i','n','g','s'};
		
		String s2 = new String (ch);
		
		String s3 = new String ("example");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1 + " " + s3);
	}

}
