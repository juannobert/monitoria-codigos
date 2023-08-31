package questoes.basico;

import java.util.Scanner;

/*
 Crie um programa que solicite ao usuário que insira 5 números e, em seguida, imprima esses números.
*/

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[5];
		
		for(int i =0; i < 4;i++) {  
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		for(int i =0; i < 4;i++) {  
			System.out.println("O número da posição " + i + " é " + vetor[i]);
		}
		
		sc.close();
	}
}
