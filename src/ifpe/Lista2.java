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
public class Lista2 {

    public static void exercicio1(int[] array) {
	String str = "";
	for (int i = 0; i < array.length; i++) {
	    str += array[i];
	    if (i < array.length - 1) {
		str += ", ";
	    }
	}
	System.out.println("[" + str + "]");
    }

    public static void exercicio2(int[] array) {
	String str = "";
	for (int i = array.length - 1; i >= 0; i--) {
	    str += array[i];
	    if (i > 0) {
		str += ", ";
	    }
	}
	System.out.println("[" + str + "]");
    }

    public static void exercicio3(int[] array) {
	int a;
	if (array.length % 2 == 0) {
	    a = 1;
	} else {
	    a = 2;
	}
	String str = "";
	for (int i = 0; i < array.length; i++) {
	    if (i % 2 == 0) {
		str += array[i];
		if (i < array.length - a) {
		    str += ", ";
		}
	    }
	}
	System.out.println("[" + str + "]");
    }

    public static void exercicio4(int[] array) {
	System.out.println("Questão 4");
	for (int i = 0; i < array.length; i++) {
	    if (array[i] % 2 == 1) {
		System.out.println(array[i]);
	    }
	}

    }

    public static void exercicio5(int[] array) {
	String str = "";
	for (int i = 0; i < array.length; i++) {
	    str += array[array.length - 1 - i];
	    if (i < array.length - 1) {
		str += ", ";
	    }
	}
	System.out.println("[" + str + "]");
    }

    public static void main(String[] args) {
	int[] array = {1, 2, 3, 4, 5};
	exercicio1(array);
	exercicio2(array);
	exercicio3(array);
	exercicio4(array);
	exercicio5(array);
    }
}
