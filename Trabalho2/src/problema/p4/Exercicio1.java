package problema.p4;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        int a, b, soma = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Insira a: ");
        a = input.nextInt();
        System.out.print("Insira b: ");
        b = input.nextInt();

        System.out.print(a + " * " + b + " = "); // perfumaria
        for(int i = 0; i < b; i++){
            soma += a; // incrementar na soma b vezes o valor de a
            if(i < (b-1)){ // perfumaria
                System.out.print(a + " + ");
            }else{
                System.out.print(a);
            }
        }
        System.out.print(" = " + soma); // ecoa o valor total incrementado
    }
}
