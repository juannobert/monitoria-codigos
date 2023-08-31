package questoes.basico;

import java.util.Scanner;

/*
 * Escreva um programa que encontre o maior e o menor número em um vetor de números inteiros.
 */
public class Q2 {
	
	public static void main(String[] args) {
		int maior, menor;
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[5];
		
		for(int i =0; i < 4;i++) {  
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		menor = vetor[0];
		maior = vetor[0];
		
		for(int i =0; i < 4;i++) {  
			if(vetor[i] > maior) 
				maior = vetor[i];
			if(vetor[i] < menor) 
				menor = vetor[i];
		}
		System.out.println("O maior número é: " + maior );
		System.out.println("O menor número é: " + menor);
	}
}
