package curso;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite seu Nome:");
		String name = sc.next();
		System.out.println("Quantos quartos tem na sua casa ?");
		int banheiro = sc.nextInt();
		System.out.println("Digite o valor de qualquer produto do mercado -500.50");
		double preco = sc.nextDouble();
		
		
		System.out.println("Digite seu último nome, idade e altura -sem dar ENTER-");
		
		String sobrenome = sc.next();
		int idade = sc.nextInt();
		double altura = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(banheiro);
		System.out.printf("%.2f %n", preco);
		System.out.println(sobrenome);
		System.out.println(idade);
		System.out.println(altura);
		sc.close();
	}

}
