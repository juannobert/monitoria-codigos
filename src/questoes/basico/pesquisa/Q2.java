package questoes.basico.pesquisa;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[5];
		int num, cont = 0;
		
		for(int i =0; i < vetor.length;i++) {  
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Digite um número que você deseja busca no vetor");
		num = sc.nextInt();
		
		for(int i =0; i < vetor.length;i++) {  
			if(vetor[i] == num) {
				cont++;
			}
		}
		
		System.out.println("O número " + num + " aparece " + cont + " vez(es) no vetor");
		
		
		
	}
}
