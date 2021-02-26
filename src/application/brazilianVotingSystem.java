package application;
import java.util.Scanner;
public class brazilianVotingSystem {

	public static void main(String[] args) {
		int bolsonaro = 0;
		int haddad = 0;
		int ciro = 0;
		int daciolo = 0;
		int nulo = 0;
		int branco = 0;
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite o número do seu candidato: ");
		int voto = leitura.nextInt();
		
		while(voto !=7) {
			System.out.println("Digite o numero do seu candidato: ");
			voto = leitura.nextInt();
			if(voto == 1) {
				System.out.println("Você votou em Jair Bolsonaro");
				bolsonaro++;
			}
			else if(voto == 2 ) {
				System.out.println("Você votou em Fernando Haddad");
				haddad++;
			}
			else if(voto == 3) {
				System.out.println("Você votou em Ciro Gomes");
				ciro++;
			}
			else if(voto == 4) {
				System.out.println("Você votou em Cabo Daciolo");
				daciolo++;
			}
			else if(voto == 5) {
				System.out.println("Você votou em branco");
				branco++;
			}
			else if(voto == 6) {
				System.out.println("Você votou nulo");
				nulo++;
			}
			else if(voto == 7) {
				System.out.println("Você entrou no sistema");
			}
			else {
				System.out.println("Voto invalido");
			}
			
		}
			
		
		System.out.println("RESULTADOS DA ELEIÇÃO");
		System.out.println(" ");
		System.out.println("Jair Bolsonaro: "+bolsonaro);
		System.out.println("Fernando Haddad: "+haddad);
		System.out.println("Ciro Gomes: "+ciro);
		System.out.println("Cabo Daciolo: "+daciolo);
		System.out.println("Votos em branco: "+branco);
		System.out.println("Votos nulo: "+nulo);
		System.out.println(" ");
		if(bolsonaro>haddad && bolsonaro>ciro && bolsonaro>daciolo) {
			System.out.println("Jair Bolsonaro foi o vencedor dessas eleições");
		}
		else if(haddad>bolsonaro && haddad>ciro && haddad>daciolo) {
			System.out.println("Fernando Haddad foi o vencedor dessas eleições");
		}
		else if(ciro>bolsonaro && ciro>haddad && ciro>daciolo) {
			System.out.println("Ciro Gomes foi o vencedor dessas eleições");
		}
		else if(daciolo>bolsonaro && daciolo>haddad && daciolo>ciro) {
			System.out.println("Cabo Daciolo foi o vencedor dessas eleições");
			}

		

	}
}


