
public class Method2 {
	static void test(int i) {//i=10
		System.out.println("test:" + i++);
		System.out.println("test: " + i);
	}

	public static void main(String[] args) {
		int i=10;
		i++;
		test(i);//11
		System.out.println("main:" + i);

	}

}
