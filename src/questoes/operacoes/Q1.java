package questoes.operacoes;

import java.util.Scanner;
//Implemente um programa que calcule a soma dos elementos em um vetor de números.
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[5];
		int soma = 0;
		
	
		
		for(int i =0; i < vetor.length;i++) {  
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		

		for(int i =0; i < vetor.length;i++) {  
			soma += vetor[i];
		}
		
		System.out.println("A soma do vetor é: " + soma);
		
		sc.close();
	}
}
