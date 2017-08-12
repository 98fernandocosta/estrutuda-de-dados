/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe;

import java.util.Arrays;

/**
 *
 * @author Fernando
 */
public class QuestoesArray {

    public static int questao1(int[][] m) {
	// Um método que recebe uma matriz de inteiros e retorna o maior valor
	// contido na matriz

	int maior = m[0][0];
	for (int[] i : m) {
	    for (int j : i) {
		if (j >= maior) {
		    maior = j;
		}
	    }
	}
	return maior;
    }

    public static int[] questao2(int[][] m) {
	// Um método que recebe uma matriz de inteiros e retorna um array
	// contendo respectivamente a linha e coluna
	// onde está o menor valor.

	int[] indice = new int[2];
	int maior = m[0][0];
	for (int i = 0; i < m.length; i++) {
	    for (int j = 0; j < m[i].length; j++) {
		int k = m[i][j];
		if (k > maior) {
		    maior = k;
		}
		indice[0] = i;
		indice[1] = j;
	    }
	}
	return indice;
    }

    public static boolean questao3(int[][] m1, int[][] m2) {
	// Um método que recebe duas matrizes de inteiros e retorna true se são
	// iguais.
	/*
		 * if (m1.length != m2.length || m1[0].length != m2[0].length) return
		 * false;
	 */

	for (int i = 0; i < m1.length; i++) {
	    for (int j = 0; j < m1[i].length; j++) {
		if ((m1[i][j] != m2[i][j])) {
		    return false;
		}
	    }
	}
	return true;

    }

    public static int[][] questao4(int[][] m1, int[][] m2) {
	// Um método que recebe uma matriz de inteiros e retorna a soma de todos
	// os valores.

	int[][] nova = new int[m1.length][m1[0].length];
	if (m1.length != m2.length || m1[0].length != m2[0].length) {
	    return nova;
	} else {
	    for (int i = 0; i < m1.length; i++) {
		for (int j = 0; j < m1[i].length; j++) {
		    nova[i][j] = m1[i][j] + m2[i][j];
		}
	    }
	}
	return nova;
    }

    public static int questao5(int[][] m1, int[][] m2) {
	// Um método que recebe duas matrizes de inteiros e retorna a soma das
	// matrizes.

	int count = 0;
	for (int[] i : m1) {
	    for (int j : i) {
		count += j;
	    }
	}
	for (int[] i : m2) {
	    for (int j : i) {
		count += j;
	    }
	}
	return count;
    }

    public static int[][] questao6(int[][] m) {
	// Um método que recebe uma matriz de inteiros e retorna a matriz
	// transposta.

	int[][] nova = new int[m[0].length][m.length];

	for (int i = 0; i < m.length; i++) {
	    for (int j = 0; j < m[i].length; j++) {
		nova[i][j] = m[j][i];
	    }
	}
	// 0 | 0==>0 | 0
	// 0 | 1==>1 | 0

	// 1 | 0==>0 | 1
	// 1 | 1==>1 | 1
	return nova;
    }

    public static boolean questao7(int[][] m1, int[][] m2) {
	// Um método que recebe uma matriz de inteiros e retorna true se é uma
	// matriz simétrica.

	for (int i = 0; i < m1.length; i++) {
	    for (int j = 0; j < m1[i].length; j++) {
		if ((m1.length != m2.length || m1[i].length != m2[i].length) || (m1[i][j] != m2[i][j])) {
		    return false;

		}

	    }
	}

	return true;
    }

    public static int[] questao8(int[][] m) {
	// Um método que recebe uma matriz de inteiros e retorna um array
	// contendo a soma das linhas. Em que no índice 0
	// do array vai ter a soma dos valores da linha 0 da matriz e assim por
	// diante.

	int[] novo = new int[m.length];
	for (int i = 0; i < m.length; i++) {
	    int count = 0;
	    for (int j = 0; j < m[i].length; j++) {
		count += m[i][j];
	    }
	    novo[i] = count;
	}
	return novo;

    }

    public static int[] questao9(int[][] m) {
	int maior = m[0].length;
	for (int i = 0; i < m.length; i++) {
	    if (m[i].length > maior) {
		maior = m[i].length;
	    }
	}
	int[] novo = new int[maior];

	for (int i = 0; i < m.length; i++) {
	    int count = 0;
	    for (int j = 0; j < 1;) {
		count = m[i][j];
	    }
	    novo[i] = count;
	}
	return novo;

    }

    public static void main(String[] args) {
	int[][] m1 = {{1, 2, 3}, {2, 3, 4}};
	int[][] m2 = {{1, 2, 3}, {2, 3, 4}, {4, 4, 4}};
	int[] matriz = {1, 2, 3, 4};
	/*
		 * int[][] mat = questao6(m1); for (int[] i : mat) {
		 * System.out.println(Arrays.toString(i)); }
	 */
	System.out.println(Arrays.toString(questao9(m1)));

    }
}
