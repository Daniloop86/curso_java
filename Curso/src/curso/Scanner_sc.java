package curso;

import java.util.Locale;
import java.util.Scanner;

public class Scanner_sc {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
//		String sentence = sc.nextLine();
//		String x, y, z;
//		
//		x = sc.next();
//		y = sc.next();
//		z = sc.next();
//		
//		System.out.println(sentence);
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		
//		System.out.println("-------------------------------------------------");
		
		//33
		//int n1 = sc.nextInt();  			
		// Linha em Branco
		//sc.nextLine();  					
		// Nome
		//String name = sc.nextLine(); 		
		// M
		//char gender = sc.next().charAt(0); 
		//b5
		//String s = sc.next();
		//char letter = s.charAt(0);
		//int digit = Integer.parseInt(s.substring(1));
		//4.32
		//double n2 = sc.nextDouble();
		// Danilo M 33 1.86
		String name2 = sc.next();
		char gender2 = sc.next().charAt(0);
		int age = sc.nextInt();
		double grana = sc.nextDouble();
		
		
		System.out.printf("%s - %c - %d - %.2f %n", name2, gender2, age, grana);
		
		System.out.println(name2);
		System.out.println(gender2);
		System.out.println(age);
		System.out.println(grana);
		//System.out.println(n1);
		//System.out.println(name);
		//System.out.println(gender);
		//System.out.println(letter);
		//System.out.println(digit);
		//System.out.println(n2);
		
				
		sc.close();
		
			
	}
}
