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
public class Lista4 {

    public static double exercicio1(int[] array) {
	// Metodo que recebe um array de numero decimais e retorna o maior
	// valor.

	int maior = array[0];
	for (int i : array) {
	    maior = i > maior ? i : maior;
	}
	return maior;

    }

    public static int exercicio2(int[] array) {
	// Metodo que recebe um array de inteiros e retorna o segundo maior
	int maior = array[0];
	int secMaior = array[1];
	if (secMaior > maior) {
	    int temp = secMaior;
	    secMaior = maior;
	    maior = temp;
	}
	for (int i : array) {
	    if (i > maior) {
		secMaior = maior;
		maior = i;
	    } else if (i >= secMaior) {
		secMaior = i;
	    }

	}

	return secMaior;
    }

    public static String exercicio3(String[] array) {

	// Metodo que recebe um array de String e retorna a String de menor
	// comprimento (quantidade de caracteres)
	int menor = array[0].length(), posicao = 0;
	for (int i = 0; i < array.length; i++) {
	    if (array[i].length() < menor) {
		menor = array[i].length();
		posicao = i;
	    }
	}
	return array[posicao];
    }

    public static boolean exercicio4(String str) {
	// Método que recebe uma String e verifica se é um palíndromo (mesma
	// palavra de trás pra frente)
	int count = 0;
	for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
	    if (str.charAt(i) != str.charAt(j)) {
		return false;

	    }
	}
	return true;

    }

    public static boolean exercicio5(int[] array) {
	// Método que recebe um array de inteiros e vereifica se está ordenado
	// de maneira crescente
	int a = array[0];
	for (int i = 1; i < array.length; i++) {
	    if (a > array[i]) {
		return false;
	    }
	    a = array[i];
	}
	return true;
    }

    public static int exercicio6(int[] array) {
	// Metodo que recebe um array de inteiros, verifica sua ordenacao e
	// retorna +1 se esta ordenado de maneira crescente, -1 se esta ordenado
	// de maneira decrescente e 0 se não estiver ordenado
	int a = array[0];
	for (int i = 1, cresc = 0, decresc = 0; i < array.length; i++) {
	    if (a <= array[i]) {
		cresc++;
		if (cresc == array.length - 1) {
		    return 1;
		}
	    }
	    if (a >= array[i]) {
		decresc++;
		if (decresc == array.length - 1) {
		    return -1;
		}
	    }
	    a = array[i];
	}

	return 0;
    }

    public static void main(String[] args) {

	double[] array = {12, 13, 13, 9.0, 1, 2.0, 3.4, 9.0, 10.1, 10.1, 12};
	int[] array1 = {1, 2, 3, 3, 4, 5, 6};
	int[] array2 = {6, 5, 4, 3, 3};
	String[] arrayStr = {"alalalal", "menor", "aosijdaosdi", "dasoidasd"};
	String str = "arara";
	System.out.println(exercicio6(array1));
    }
}
