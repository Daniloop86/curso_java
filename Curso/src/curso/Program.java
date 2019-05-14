package curso;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		
		boolean completed = false;
		char gender = 'M';
		int x = 33;
		String name ="Danilo de Oliveira Pinto";
		Object obj1 =4.5f;
		double grana = 4.500;
		
		System.out.println(completed);
		System.out.println(gender);
		System.out.println(x);
		System.out.println(name);
		System.out.println(obj1);
		System.out.println(grana);
		Locale.setDefault(Locale.US);
		System.out.println("-------------------------------");
		System.out.printf("%n %s tem %d anos %c e tem %.3f de grana.", name, x, gender, obj1);
	}

}
