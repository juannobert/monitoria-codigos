package questoes.basico.pesquisa;

import java.util.Scanner;
// Escreva um programa que verifique se um número fornecido pelo usuário está presente em um vetor.
public class Q1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[5];
		int num;
		boolean existe = false;
		
		for(int i =0; i < vetor.length;i++) {  
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Digite um número que você deseja busca no vetor");
		num = sc.nextInt();
		
		for(int i =0; i < vetor.length;i++) {  
			if(vetor[i] == num) {
				existe = true;
				break;
			}
		}
		
		if(existe == true) {
			System.out.println("O número " + num + " existe no vetor");
		}else {
			System.out.println("O número " + num + " não existe no vetor");
		}
		
		sc.close();
		
		
		
		
		
	}

}
