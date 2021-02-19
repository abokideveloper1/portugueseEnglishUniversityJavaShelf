package application;

import java.util.Scanner;

public class gastoTrimestre {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Insira os gastos de Janeiro: ");
		float janeiro = input.nextFloat();
		System.out.print("Insira os gastos de Fevereiro: ");
		float fevereiro = input.nextFloat();
		System.out.print("Insira os gastos de Março: ");
		float marco = input.nextFloat();
		
		float trimestre = janeiro + fevereiro + marco;
		System.out.println(" ");
		System.out.println("O gasto total do trimestre foi: " +trimestre);

	}

}
