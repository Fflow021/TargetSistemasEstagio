package target.tecnica.phillipe.target.tecnica;

public class desafioCinco {

    public static void interruptores(){

        System.out.println("DESAFIO 5:\n" +
                "Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas " +
                "diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os " +
                "interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. " +
                "Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual " +
                "interruptor controla cada lâmpada?\n");
        System.out.println("\nRESPOSTA:\nPrimeiramente, eu ligo uma lâmpada por volta de 10 minutos e depois a desligo. " +
                "Em seguida, ligo a segunda lâmpada e me dirijo a uma das salas. Então, tenho 3 possíveis casos a observar:\n" +
                "\n" +
                "1. A lâmpada está acesa.\n" +
                "2. A lâmpada está apagada.\n" +
                "3. A lâmpada está apagada e quente.\n" +
                "\n" +
                "Verifico qual é o caso da lâmpada na primeira sala que visito e, imediatamente, sei qual interruptor " +
                "eu usei ou deixei de usar. Depois, vou a uma das duas salas restantes e verifico a situação da lâmpada " +
                "nessa sala. Com base nisso, identifico qual lâmpada pertence ao segundo interruptor e, por eliminação, " +
                "descubro a qual interruptor pertence a última lâmpada.");
        System.out.println("\n\nCASO DE EXEMPLO:\n\n" +
                "\n" +
                "Existem os interruptores 1, 2 e 3 e as salas A, B e C. Eu liguei o interruptor 1 por 10 minutos e, " +
                "em seguida, o apaguei. Depois, liguei o interruptor 2 e não toquei no interruptor 3. " +
                "Fui à sala A e a lâmpada estava acesa, então o interruptor 2 pertence à sala A. Em seguida, " +
                "fui para a sala B e a lâmpada estava apagada, mas quente. Portanto, o interruptor 1 pertence à sala B. " +
                "Com isso, deduz-se que o interruptor 3 pertence à sala C. \nA2 - 1B - 3C.");

    }
}
