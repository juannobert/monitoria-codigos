package questoes.operacoes;

import java.util.Scanner;

//Crie um programa que multiplique cada elemento de um vetor por um valor escalar fornecido pelo usuário. 
public class Q2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[5];
		int soma = 0;
		double media;
		
		for(int i = 0; i < vetor.length;i++) {  
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		

		for(int i =0; i < vetor.length;i++) {  
			soma += vetor[i];
		}
		
		media =  soma / vetor.length;
		
		System.out.println("A média dos números do vetor é igual a: " + media);
		
		sc.close();
		
	}

}
