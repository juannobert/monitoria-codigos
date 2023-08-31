package vetores;

public class Vetores {

	public static void main(String[] args) {
		//Criando um vetor de inteiros com tamanho 5:
		int [] v1 = new int[5];
		
		//Criando um vetor de Strings com tamanho 5:
		String [] v2 = new String[5];
		
		//Criando um vetor com elementos:
		int[] v3 = {1 ,2, 4};
		
		String[] nomes = {"Julia", "Luis"};
		
		String nome = nomes[1];
				  //0 //1 //3   
		int valor1 = v3[0]; //Colocando primeiro elemento do vetor em uma variável
		System.out.println("O primeiro elemento do vetor é: " + valor1);
		
		int tamanhoVetor = nomes.length; //Exibe o tamanho do vetor
		System.out.println("O tamnho do vetor é: " + tamanhoVetor);
		
		//Percorrendo todos os valores de um vetor:
		
		for(int i = 0; i < v3.length;i++) { //Enquanto a variável i for menor que o tamanho do vetor ela continuará sendo incrementada
			System.out.println("A valor na posição " + i + " é = " + v3[i]);
			
		}
		

	}

}
