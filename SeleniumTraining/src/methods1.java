
public class methods1 {
	static void test1() {
		System.out.println("test1");
	}
	static void test2() {
		System.out.println("test2 Begins");
        test1();
		System.out.println("test2 Ends");
	}

	public static void main(String[] args) {
System.out.println("main method begins");
test2();
System.out.println("main method Ends");

	}

}
