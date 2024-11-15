package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Main_Kaprekar {
    public static void main(String[] args) {
    }

    public static int kaprekarOp(int num) {
        String numString = String.valueOf(num);
        char[] digitos = numString.toCharArray();

        Arrays.sort(digitos);
        String ordenadosMenorMayor = new String(digitos);

        Character[] digitosObj = new Character[digitos.length];
        for (int i = 0; i < digitos.length; i++) {
            digitosObj[i] = digitos[i];
        }

        Arrays.sort(digitosObj, Collections.reverseOrder());

        StringBuilder ordenadosMayorMenor = new StringBuilder();
        for (Character c : digitosObj) {
            ordenadosMayorMenor.append(c);
        }

        int menorMayor = Integer.parseInt(ordenadosMenorMayor);
        int mayorMenor = Integer.parseInt(ordenadosMayorMenor.toString());

        return mayorMenor - menorMayor;
    }

    public static int itKaprekar(int num) {
        return 0;
    }

}