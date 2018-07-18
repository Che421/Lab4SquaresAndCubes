import java.util.Formatter;
import java.util.Scanner;

public class SquaresAndCubes {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Formatter fmt;
		
		//System.out.println("Enter an integer: ");
		
		String userChoice;
		
		do {		
		System.out.println("Enter an integer: ");
		int userNum = input.nextInt();
		int i = 1;
		
		fmt = new Formatter();
		
		fmt.format("%10s %10s %10s", "Number", "Squared", "Cubed");
		System.out.println(fmt);
		
		for(i = 1; i <= userNum; i++)  {
			fmt = new Formatter();
			
			
			fmt.format("%10d %10d %10d", i, i * i, i * i * i);
			System.out.println(fmt);		
			
		}
		
		
		System.out.println("Continue Yes or No");
		userChoice = input.next();
		
		}while(userChoice.equalsIgnoreCase("Yes"));
		
		System.out.println("Good Bye");
		
			
		input.close();
		
	}

}
