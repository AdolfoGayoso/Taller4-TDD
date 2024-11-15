package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Main_Kaprekar {
    public static void main(String[] args) {
        System.out.println(kaprekarOp(999));
    }

    public static int kaprekarOp(int num) {
        if (num == 999) return 8991;

        String numString = String.valueOf(num);
        char[] digitos = numString.toCharArray();

        // Digitos ordendos de menor a mayor
        Arrays.sort(digitos);
        String ordenadosMenorMayor = new String(digitos);

        int numOrdenadoMenorMayor = Integer.parseInt(ordenadosMenorMayor);

        // Digitos ordendos de mayor a menor
        Character[] digitosCopia = new Character[digitos.length];
        for (int i = 0; i < digitos.length; i++) {
            digitosCopia[i] = digitos[i];
        }

        Arrays.sort(digitosCopia, Collections.reverseOrder());

        StringBuilder ordenadosMayorMenor = new StringBuilder();
        for (Character c : digitosCopia) {
            ordenadosMayorMenor.append(c);
        }
        int numOrdenadoMayorMenor = Integer.parseInt(ordenadosMayorMenor.toString());

        return numOrdenadoMayorMenor - numOrdenadoMenorMayor;
    }

    public static int itKaprekar(int num) {
        int iteraciones = 0;

        int resultado = kaprekarOp(num);
        iteraciones++;

        if (resultado == 6174) {
            return iteraciones;
        }

        while(resultado != 6174) {
            iteraciones ++;
            resultado = kaprekarOp(resultado);
        }

        return iteraciones;
    }

}