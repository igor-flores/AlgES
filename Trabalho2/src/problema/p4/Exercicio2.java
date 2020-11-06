package problema.p4;

public class Exercicio2 {
    public static void main(String[] args){
        for(int i = 2; i < 12; i++){ // i de 0 a 11
            for(int j = 0; j < 11; j++){ // j de 0 a 10
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println(" ");
        }
    }
}
