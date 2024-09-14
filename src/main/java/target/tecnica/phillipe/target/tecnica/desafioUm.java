package target.tecnica.phillipe.target.tecnica;

public class desafioUm {
    // array para gravar os numeros anteriores de fibonacci
    private static long[] memoriaDeFibonacci;

    // função para fazer fibonacci
    public static long fibonacci(int parametro) {

        // retorna se for 0 ou 1
        if (parametro <= 1) {
            return parametro;
        }

        if (memoriaDeFibonacci[parametro] != 0) {
            return memoriaDeFibonacci[parametro];
        }

        long numeroDefibonacciX = fibonacci(parametro - 1) + fibonacci(parametro - 2);
        memoriaDeFibonacci[parametro] = numeroDefibonacciX;
        return numeroDefibonacciX;
    }

    public static String verificadorDeFibonacci(int parametro){
        memoriaDeFibonacci = new long[parametro + 1];

        boolean flag = false;
        long numero = 0;

        for (int i = 0; numero < parametro; i++) {
            numero = fibonacci(i);
            if (numero == parametro) {
                flag = true;
            }
        }
        if(flag) {
            return "O número "+ parametro + " pertence à sequência de fibonacci";
        } else {
            return "O número " + parametro + " não pertence à sequência de fibonacci";
        }
    }
}
