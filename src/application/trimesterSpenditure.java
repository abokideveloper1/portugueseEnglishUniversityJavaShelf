package application;
import java.util.Scanner;

public class trimesterSpenditure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter total amount of money spent during January: ");
		float january = input.nextFloat();
		System.out.print("Enter total amount of money spent during February: ");
		float february = input.nextFloat();
		System.out.print("Enter total amount of money spent during March: ");
		float march = input.nextFloat();
		
		float trimester = january + february + march;
		
		System.out.println(" ");
		System.out.println("TRIMESTER TOTAL EXPENDITURE: "+trimester);

	}

}
