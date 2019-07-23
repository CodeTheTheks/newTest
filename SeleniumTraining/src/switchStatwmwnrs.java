
public class switchStatwmwnrs {
	public static void main(String[] args)
	{
		char grade ='X';
		
		switch (grade) {
		case 'A' :
			System.out.println("Excellent");
			break;
		case 'B' :
			System.out.println("Well done");
			break;
				
		case 'C' :
			System.out.println("Good");
			break;
		case 'D' :
			System.out.println("Pass");
			break;
		case 'F' :
			System.out.println("Fail");
			break;
		default :
			System.out.println("Invalid grade");
		}
	}

}
