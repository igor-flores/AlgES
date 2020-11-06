package problema.p4;

public class Exercicio4 {
    public static void main(String[] args){
        int v1[] = {12, 11, 10, 9, 1, 2, 3, 4, 8, 7, 6, 5},
            v2[] = {0, 0, 0, 0},
            v3[] = {0, 0, 0, 0},
            v4[] = {0, 0, 0, 0};
        int i, j;

        for(i = 3, j = 0; i >= 0; i--, j++){
            v4[j] = v1[i];
        }

        for(i = 11, j = 0; i > 7; i--, j++){
            v3[j] = v1[i];
        }

        for(i = 4, j = 0; j < 4; i++, j++){
            v2[j] = v1[i];
        }

        System.out.print("v2 = ");

        for(i = 0; i < 4; i++){
            if(i != 3){
                System.out.print(v2[i] + ", ");
            }else{
                System.out.print(v2[i] + ".");
            }
        }

        System.out.println(" ");
        System.out.print("v3 = ");

        for (i = 0; i < 4; i++){
            if(i != 3){
                System.out.print(v3[i] + ", ");
            }else{
                System.out.print(v3[i] + ".");
            }
        }

        System.out.println(" ");
        System.out.print("v4 = ");

        for (i = 0; i < 4; i++){
            if(i != 3){
                System.out.print(v4[i] + ", ");
            }else{
                System.out.print(v4[i] + ".");
            }
        }
    }
}
