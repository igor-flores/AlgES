package problema.p4;

public class Exercicio3 {
    public static void main(String[] args){
        int v1[] = {12, 1, 11, 2, 10, 3},
            v2[] = {6, 7, 5, 8, 4, 9},
            v3[] = new int [12];
        int i, j;

        for(i = 0, j = 11; i < 6; i +=2, j--){ //v1 do inicio ao fim pulando em 2
            v3[j] = v1[i];                     //v3 do fim ao inicio incrementando a cada posição
        }

        for(i = 1, j = 0; i < 6; i +=2, j++){ //v1[1] ao fim pulando em 2
            v3[j] = v1[i];                    //v3 do inicio ao fim incrementando a cada posição
        }

        for(i = 4, j = 3; i >= 0; i -=2, j++){ //v2[4] ao inicio pulando em 2
            v3[j] = v2[i];                     //v3[3] ao fim incrementando a cada posição
        }

        for(i = 5, j = 8; i >= 0; i -=2, j--){ //v2[5] ao inicio pulando em 2
            v3[j] = v2[i];                     //v3[8] ao inicio incrementando a cada posição
        }

        System.out.print("v3 = ");
        for (i = 0; i < 12; i++){
            if(i != 11){ //perfumaria
                System.out.print(v3[i] + ", ");
            }else{
                System.out.print(v3[i] + ".");
            }
        }
    }
}
