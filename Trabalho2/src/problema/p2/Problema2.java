package problema.p2;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args){
        String boca;
        int numero = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Selecione um N para o N de boca: ");
        boca = input.next();

        // Somar todos os algarismos do numero inserido
        for(int i = 0; i < boca.length(); i++){
            // cada numero presente na String boca é incrementado em numero
            numero += (boca.charAt(i));
        }

        // Pega o modulo de uma divisão por 3, já que são 3 algarismos possiveis (0, 1, 2)
        System.out.println("Valor inicial: " + (numero % 3));
    }
}
