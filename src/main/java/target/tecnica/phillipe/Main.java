package target.tecnica.phillipe;

import target.tecnica.phillipe.target.tecnica.*;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean condicaoDeParada = true;
        while(condicaoDeParada) {
            int option = 0;
            try {
                System.out.println("\nEscolha o desafio para ver:" +
                        "\n1 - Sequência de Fibonacci" +
                        "\n2 - String 'A'" +
                        "\n3 - Descobrir o valor de SOMA" +
                        "\n4 - Lógica dos números" +
                        "\n5 - Três Interruptores" +
                        "\n6 - FINALIZA O PROGRAMA\n");
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Escolha uma das opções!");
                scanner.next();
            }

            switch (option) {
                case 1:
                    desafioUm casoUm = new desafioUm();
                    int escolha = 2584;
                    System.out.println(desafioUm.verificadorDeFibonacci(escolha));
                    break;
                case 2:
                    desafioDois casoDois = new desafioDois();
                    desafioDois.ExercicioDoisTarget();
                    break;
                case 3:
                    desafioTres casoTres = new desafioTres();
                    desafioTres.soma();
                    break;
                case 4:
                    desafioQuatro casoQuatro = new desafioQuatro();
                    desafioQuatro.proximoElemento();
                    break;
                case 5:
                    desafioCinco casoCinco = new desafioCinco();
                    desafioCinco.interruptores();
                    break;
                case 6:
                    condicaoDeParada = false;
                    break;

            }
        }
    }
}