/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe;

/**
 *
 * @author Fernando
 */
public class Recursividade {

    static int somatorioR(int n) {

	if (n == 1) {
	    return 1;
	}

	return n + somatorioR(n - 1);
    }

    static int multiplicacaoPorSomaR(int n1, int n2) {

	if (n2 == 1) {
	    return n1;
	}

	return n1 + multiplicacaoPorSomaR(n1, n2 - 1);
    }

    static int potenciacaoPorSomaR(int a, int b) {

	if (b == 0) {
	    return 1;
	} else if (b == 1) {
	    return a;
	}

	return a * potenciacaoPorSomaR(a, b - 1);
    }

    static int fibonacciR(int n) {
	if (n == 0) {
	    return 0;
	} else if (n == 1) {
	    return 1;
	}

	return fibonacciR(n - 1) + fibonacciR(n - 2);

    }

    public static void main(String[] args) {

	// int n1 = 5;
	// int n2 = somatorioR(n1);
	// System.out.printf("O somatório de %d é: %d", n1 , n2);
	// int n1 = 3;
	// int n2 = 5;
	// int n3 = multiplicacaoPorSomaR(n1, n2);
	// System.out.printf("A multiplicação de %d por %d é: %d",n1,n2,n3);
	// int n1 = 3;
	// int n2 = 4;
	// int n3 = potenciacaoPorSomaR(n1, n2);
	// System.out.printf("%d elevado a %d é: %d",n1,n2,n3);
	int n1 = 20;
	int n2 = fibonacciR(n1);
	System.out.printf("O %dº número da sequência de Fibonacci é: %d", n1, n2);
    }
}
