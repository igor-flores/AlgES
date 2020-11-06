package problema.p3;

import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args){
        String resposta;
        int menu = 0;
        Scanner input = new Scanner(System.in);
        boolean paciente[][] = new boolean[5][6];

        // Parametros considerados no exercicio
        String parametro[] = {
            "Portador de doenças crônicas",
            "Fumante",
            "Acima de 60 anos",
            "Abaixo de 5 anos",
            "Gestante",
            "Puérpera (fase pós-parto)"
        };

        System.out.println("Insira [S / N] para cada tópico abaixo");

        for(int i = 0;  i < 5; i++){

            System.out.println("Paciente " + (i+1)); // Identificação do Paciente
            for(int j = 0; j < 6; j++){

                System.out.print((j+1) + ". " + parametro[j] + ": "); // No. parametro: [S/N]
                resposta = input.next();
                paciente[i][j] = resposta.equals("S") ? true : false; // Se a resposta for S true, senão false
            }

            do{ // Enquanto não receber 0 como entrada continuará pedindo um item para ser alterado
                System.out.println(" ");
                System.out.println("Você deseja alterar algum dos dados inseridos? Para sair insira 0.");
                System.out.print("Insira o número do item desejado: ");
                menu = input.nextInt();
                if((menu > 0) && (menu < 7)){ // Se for um valor condizente
                    System.out.print((menu) + ". " + parametro[menu-1] + ": ");
                    resposta = input.next();

                    paciente[i][menu-1] = resposta.equals("S") ? true : false;
                }
            }while(menu > 0);
            System.out.println("--------------------------------------------------------------------");
            System.out.println(" "); // Perfumaria
        }
        for(int i = 0;  i < 5; i++){ //Analisando Paciente
            System.out.print("Paciente " + (i+1) + ": ");
            resposta = "Não está no grupo de risco."; // Por default o paciente não é do grupo de risco
            for(int j = 0; j < 6; j++){ //Analisando parametros
                if(paciente[i][j] == true){ // Se em algum momento um parametro for true ele está no grupo de risco
                    resposta = "Está no grupo de risco.";
                }
            }
            System.out.println(resposta); // Ecoa a resposta
        }
    }
}
