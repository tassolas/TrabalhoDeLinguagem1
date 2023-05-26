package Ex22.Package;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Qual é o tamanho da base?: ");
		double base = s1.nextDouble();
		System.out.print("Qual é o tamanho da altura?: ");
		double altura = s1.nextDouble();
		
		System.out.println("Sua hipotenusa é: " + hipotenusa(base,altura));
		
		s1.close();
	}
	
	public static double hipotenusa(double Base,double Altura){
		double hipotenusa = (Base*Base) + (Altura*Altura);
		hipotenusa = Math.sqrt(hipotenusa);
		return hipotenusa;
	}

}
