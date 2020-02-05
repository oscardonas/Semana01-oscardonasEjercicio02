package com.odonas;

public class Ejercicio02ManejoStrings {

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

        /*
        RESULTADO

        numero = 2147483647
        numero = -2147483648
        numero = -2147483648
        numero = 2147483647

        Este comportamiento se debe a que el máximo valor que puede tomar un int es 2147483647; cuando se le suma uno,
        vuelve a iniciar en el valor más bajo qu es -2147483647; lo mismo ocurre cuando al valor más bajo se le resta
        uno

         */
    }
}
