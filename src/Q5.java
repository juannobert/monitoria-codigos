import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		
		for(int i = 1; i<= 10;i++) {
			int num = sc.nextInt();
			soma = soma + num;
		}
		
		System.out.println("A soma dos valores é: " + soma);

	}

}
