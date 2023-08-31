import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		
		for(int i = 1; i<= 20;i++) {
			System.out.println("Digite sua idade");
			int num = sc.nextInt();
			soma = soma + num;
		}
		
		int media = soma / 20;
		System.out.println("A média das idades é: " + media);
		

	}

}
