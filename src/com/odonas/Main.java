package com.odonas;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int numero = 2147483647;
        System.out.println("numero = " + numero);
        numero = numero + 1;
        System.out.println("numero = " + numero);

        numero = -2147483648;
        System.out.println("numero = " + numero);
        numero = numero - 1;
        System.out.println("numero = " + numero);
        
    }
}
