package curso;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_pdf1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int i =1;

		/*
		while (i<=3 ) {
			
				
		// EXERC�CIO 1
		System.out.printf("%d. Digite primeiro N�mero: ", i);
		int num1 = sc.nextInt();
		System.out.printf("%d. Digite segundo n�mero: ", i);
		int num2 = sc.nextInt();
		
		int a = num1 + num2;
		
		System.out.printf("A soma � de: %d %n%n", a);
		
		// EXERC�CIO 2
		double pii = 3.14159;
			

		System.out.printf("%d. Digite o raio do c�rculo: ", i);
		double raio = sc.nextDouble();

		double result = pii * raio * raio;

		 System.out.printf("Resultado: %.4f %n%n", result);

			i++;	 
		} */		   
			
		/*
		// EXERC�CIO 3
		while (i<=2) {	
		//int a, b, c, d;
			int a = sc.nextInt();
			int b = sc.nextInt(); 
			int c = sc.nextInt(); 
			int d = sc.nextInt(); 
			int result = (a * b) - (c * d);
			System.out.println(result);
			i++;
		} 
		*/
		/*
		 // EXERC�CIO 4
		while (i<=3) {
			
			
			System.out.printf("%d. Digite o C�digo do Funcion�rio: ", i);
			int id = sc.nextInt();
			System.out.printf("%d. Digite as horas trabalhadas: ", i);
			int hour = sc.nextInt();
			double salario = nextDouble();
			
			if(i==1) {
				double salario = hour * 5.50;
			} else if (i==2){
				double salario = hour * 20.50;
			} else if(i==3){
				double salario = hour * 15.55;
			}
			
			System.out.printf("Funcion�rio %d %nSal�rio: R$ %.2f %n%n", id, salario);
		i++;
		}
		*/
		
		/*
		// EXERC�CIO 5
		
		while (i<=3) {
		System.out.printf("%d. C�digo da Pe�a: ", i);
		int peca = sc.nextInt();
		System.out.printf("%d. Digite a quantidade: ", i);
		int quantidade = sc.nextInt();
		double total = quantidade * 5.30;
				
		System.out.printf("%d. C�digo da Pe�a: ", i);
		int peca2 = sc.nextInt();
		System.out.printf("%d. Digite a quantidade: ", i);
		int quantidade2 = sc.nextInt();
		double total2 = quantidade2 * 5.10;
		
		double total3 = total + total2;
		
		System.out.printf("%d O Valor total � de: %.2f %n%n", i, total3);
		i++;
		}
		*/
		
		//EXERC�CIO 6
		while (i<=2) {
double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		i++;
		}
		sc.close();
	}
	


}
