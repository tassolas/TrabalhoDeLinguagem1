package Ex6.Package;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a, b, c;

        a = lerValorPositivo(s1, "Digite o valor de a: ");
        b = lerValorPositivo(s1, "Digite o valor de b: ");
        c = lerValorPositivo(s1, "Digite o valor de c: ");

        int menorValor = Math.min(Math.min(a, b), c);
        int maiorValor = Math.max(Math.max(a, b), c);

        int Multiplicacao = menorValor * maiorValor;
        double Divisao = (double) maiorValor / menorValor;

        System.out.println("O menor valor multiplicado pelo maior valor é: " + Multiplicacao);
        System.out.println("O maior valor dividido pelo menor é: " + Divisao);
    }

    public static int lerValorPositivo(Scanner scanner, String mensagem) {
        int valor;
        do {
            System.out.print(mensagem);
            valor = scanner.nextInt();
        } while (valor <= 0);
        return valor;
	}
}

