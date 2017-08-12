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
public class Lista3 {

    public static int[] exercicio1(int[] a, int[] b) {

	int count = 0;
	int[] c = new int[a.length + b.length];
	for (int i = 0; i < a.length; i++, count++) {
	    c[count] = a[i];
	}
	for (int i = 0; i < b.length; i++, count++) {
	    c[count] += b[i];
	}
	return c;

    }

    public static int[] exercicio2(int[] a) {
	int[] b = new int[a.length];
	for (int i = 0; i < a.length; i++) {
	    b[i] = a[a.length - 1 - i];
	}
	return b;

    }

    public static int[] exercicio3(int[] a, int[] b) {
	int count = 0;
	int[] c = new int[a.length + b.length];
	for (int i = 0; i < a.length; i++, count++) {
	    c[count] = a[i];
	}
	for (int i = b.length - 1; i >= 0; i--, count++) {
	    c[count] = b[i];
	}
	return c;
    }

    public static int exercicio4(char[] a) {
	int count = 0;
	for (char i : a) {
	    if ((i < 'a' || i > 'z') && (i < 'A' || i > 'Z')) {
		count++;
	    }

	}
	return count;
    }

    public static int exercicio5(String[] a) {
	/*
		 * int count = 0; char[] c = new char[a.length()]; for (int i = 0; i <
		 * c.length; i++) { c[i] = a.charAt(i); } for (int i = 0; i < c.length;
		 * i++) { if ((c[i] == 'i') && (c[i + 1] == 'f') && (c[i + 2] == 'p') &&
		 * (c[i + 3] == 'e')) { count++; } }
		 *
		 * return count;
	 */
	int count = 0;
	for (String str : a) {
	    if (str.equals("ifpe")) {
		count++;
	    }
	}
	return count;
    }

    public static int exercicio6(int[] a) {
	int count = 0;
	for (int i : a) {
	    if (i % 2 == 1) {
		count += i;
	    }
	}
	return count;
    }

    public static boolean exercicio7(byte[] a, byte[] b) {

	if (a.length != b.length) {
	    return false;
	}

	for (int i = 0; i < a.length; i++) {
	    if (a[i] != b[i]) {
		return false;
	    }
	}

	return true;
    }

    public static void main(String[] args) {
	int[] a = {1, 2, 3}, b = {4, 5, 6};
	char[] c = {'z', 's', 'h', '2', ',', '1', 'ç', '2', 'W'};
	byte[] d = {1, 2, 3, 4}, e = {1, 2, 3, 4, 5};
	// System.out.println(exercicio4(c));
	String[] str = {"ifpe", "kkkk", "ifpe", "aaaaaa"};
	System.out.println(exercicio7(d, e));
    }
}
