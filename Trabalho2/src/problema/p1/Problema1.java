package problema.p1;

import java.util.Scanner;
import java.math.*;

public class Problema1 {
    public static void main(String[] args){
        float qtdAlunos, capacidadeTelef;
        int totalViagens;
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a capacidade do Teleférico: ");
        capacidadeTelef = input.nextInt();

        System.out.print("Informe a quantidade de Alunos: ");
        qtdAlunos = input.nextInt();

        // CapacidadeTelef - 1 pois "desconta" o monitor
        // Divide o resultado pela quantidade de alunos, resultará em um float
        // A função ceil arredonda um número para cima, considerando sempre o maior valor
        // (int) para converter o tipo de dado
        totalViagens = (int) Math.ceil(qtdAlunos / (capacidadeTelef - 1));

        System.out.println("Minímo de viagens necessárias: " + totalViagens);
    }
}
