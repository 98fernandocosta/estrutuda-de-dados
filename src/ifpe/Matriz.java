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
public class Matriz {

    public static int[] exercicio1(int[] array) {
	// Metodo que recebe um array de inteiros, filtra e retorna um array que
	// contenha somente os valores positivos
	String str = "";
	int count = 0;
	for (int i : array) {
	    if (i >= 0) {
		count++;
	    }
	}
	int[] novo = new int[count];
	for (int i = 0, j = 0; i < array.length; i++) {
	    if (array[i] >= 0) {
		novo[j] = array[i];
		j++;
	    }
	}

	return novo;

    }

    public static char[] exercicio2(char[] array) {
	// Metodo que recebe um array de char e retorna um array contendo apenas
	// a metade do array de entrada
	char[] novo = new char[array.length / 2];
	for (int i = 0; i < array.length / 2; i++) {
	    novo[i] = array[i];
	}
	return array;
    }

    public static int exercicio3(int[] array) {
	// Metodo que recebe um array de inteiros e conta quantas vezes acontece
	// de ter numero pares adjacentes
	int count = 0;
	for (int i = 1; i < array.length - 1; i++) {
	    if (array[i] % 2 == 0 && array[i + 1] % 2 == 0) {
		count++;
	    }
	}
	return count;

    }

    public static int[] exericicio4(int[] array) {
	// Metodo que recebe um array de inteiros e retorna um array de
	// inteiros contendo os valores pares que estavam nos indices impares de
	// entrada
	int count = 0;
	for (int i = 1; i < array.length; i += 2) {
	    if (array[i] % 2 == 0) {
		count++;
	    }
	}
	int[] novo = new int[count];
	for (int i = 1, j = 0; i < array.length; i += 2) {
	    if (array[i] % 2 == 0) {
		novo[j] = array[i];
		j++;
	    }
	}
	return novo;

    }

    public static char[] exercicio5CM(char[] array) {
	char[] novo = new char[array.length];
	for (int i = 0; i < array.length; i++) {
	    if (Character.isLetter(array[i])) {
		if (Character.isLowerCase(array[i])) {
		    novo[i] = (char) Character.toUpperCase(array[i]);
		} else if (Character.isUpperCase(array[i])) {
		    novo[i] = (char) Character.toLowerCase(array[i]);
		}
	    } else {
		novo[i] = ' ';
	    }

	}
	return novo;

    }

    public static char[] exercicio5SM(char[] array) {
	char[] novo = new char[array.length];
	for (int i = 0; i < array.length; i++) {
	    if (array[i] >= 'A' && array[i] <= 'Z') {
		novo[i] = (char) (array[i] + ('a' - 'A'));
	    } else if (array[i] >= 'a' && array[i] <= 'a') {
		novo[i] = (char) (array[i] - ('a' - 'A'));
	    } else {
		novo[i] = ' ';
	    }
	}
	return novo;
    }

    public static void main(String[] args) {
	int[] array = {1, 2, 3, 4, 5, 7};
	char a = 65;
	char[] arrayC = {'s', 'd', 's', 'S', 'S', 'A', '1', 12};
	System.out.println(exercicio3(array));

    }
}
