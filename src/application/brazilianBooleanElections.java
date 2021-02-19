package application;
import java.util.Scanner;

public class brazilianBooleanElections {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		boolean mandatoryvote = age >=18 && age <65;
		boolean facultativevote = age >= 16 && age <18 || age>=65;
		
		System.out.println("Person allowed to mandatory vote: "+ mandatoryvote);
		System.out.println("Person allowed to facultative vote: "+facultativevote);

	}

}
