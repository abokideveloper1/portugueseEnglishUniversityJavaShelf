package application;

import java.util.Scanner;

public class eleicao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.print("Insira a idade: ");
		int idade = input.nextInt();
		
		boolean voto = idade >=18 && idade< 65;
		boolean votoFacultativo = idade >=16 && idade < 18 || idade>=65;
	
		System.out.println("Voto obrigatório?: "+voto);
		System.out.println("Voto facultativo?: "+votoFacultativo);

	}

}
