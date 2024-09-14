package target.tecnica.phillipe.target.tecnica;

public class desafioTres {

    public static void soma() {
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        //O valor da variavel será 77
        System.out.println(SOMA);
    }
}
