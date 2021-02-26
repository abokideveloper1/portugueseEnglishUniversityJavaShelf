package application;
import java.util.Scanner;
public class indianVotingSystem {

	public static void main(String[] args) {
		int narendra = 0;
		int rahul = 0;
		int nitish = 0;
		int mamta = 0;
		int nullvote = 0;
		int whitevote = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for your candidate: ");
		int vote = input.nextInt();
		while(vote !=7) {
			System.out.println("Emter a number for your candidate:");
			vote = input.nextInt();
			if(vote == 1) {
				System.out.println("Vote for Narendra Modi has been counted");
				narendra++;
			}
			else if(vote == 2) {
				System.out.println("Vote for Rahul Gandhi has been counted");
				rahul++;
			}
			else if(vote == 3) {
				System.out.println("Vote for Nitish Patel has been counted");
				nitish++;
			}
			else if(vote == 4) {
				System.out.println("Vote for Mamta Banaerjee has been counted");
				mamta++;
			}
			else if(vote == 5) {
				System.out.println("White vote has been counted");
				whitevote++;
			}
			else if(vote == 6) {
				System.out.println("Null vote has been counted");
				nullvote++;
			}
			else if(vote == 7) {
				System.out.println("Voting has been finished");
			}
			else {
				System.out.println("Invalid vote");
			}
			
		}
		System.out.println("VOTING RESULTS");
		System.out.println("Narendra Modi: "+narendra);
		System.out.println("Rahul Gandhi: "+rahul);
		System.out.println("Nitish Patel: "+nitish);
		System.out.println("Mamta Banaerjee: "+mamta);
		System.out.println("White votes: "+whitevote);
		System.out.println("Null votes: "+nullvote);
		if(narendra>rahul && narendra>nitish && narendra>mamta) {
			System.out.println("Narendra Modi won this elections");
		}
		else if(rahul>narendra && rahul>nitish && rahul>mamta) {
			System.out.println("Rahul Gandhi won this elections");
		}
		else if(nitish>narendra && nitish>=rahul && nitish>mamta) {
			System.out.println("Nitish Patel won this elections");
		}
		else if(mamta>narendra && mamta>rahul && mamta>nitish) {
			System.out.println("Mamta Banaerjee won this elections");
		}
		
	}

}
