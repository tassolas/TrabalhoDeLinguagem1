package Ex7.Package;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Entre com um número:");
		int numeroDigitado = s1.nextInt();

		int f = 1;
		int c = numeroDigitado;
		String s = "";
		
		while(c > 1) {
		    f *= c;
			s += c + " X " ;
			c--;
		}
		
		s += c;
		
		 System.out.println(s + " = " + Integer.toString(f));
		 
		 s1.close();

	}
}
