package target.tecnica.phillipe.target.tecnica;

import java.util.Scanner;

public class desafioDois {

    public static void ExercicioDoisTarget(){

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Por favor digite uma frase: ");
//        String inputDoUser = scanner.nextLine();
//
        String casoTeste = "Desafio Da Target";

        // Inteiro para contar a quantidade de vezes que um A foi detectado
        int contador = 0;
        // For para navegar na String digitada que, foi transformada em um array de char
            for(char ocorrencia:casoTeste.toCharArray()){
            // condicional para detectar as ocorrencias de A
            if (ocorrencia == 'a' || ocorrencia == 'A') {
                contador++;
            }
        }

        // condicional pra verificar se teve A na frase e o print dos casos
            if(contador >0){
                System.out.println("A frase foi: " + casoTeste);
                System.out.println("Ocorrências da letra A: " + contador);
            } else{
                System.out.println("A frase foi: " + casoTeste);
                System.out.println("A frase digitada não contém uma ocorrência da letra 'A'.");
            }
    }
}
