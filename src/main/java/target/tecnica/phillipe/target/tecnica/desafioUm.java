package target.tecnica.phillipe.target.tecnica;

public class desafioUm {

    // Array para gravar os numeros anteriores de fibonacci, memoization
    private static long[] memoriaDeFibonacci;

    public static long fibonacci(int parametro) {

        // Caso geral, previne stackOverflowError
        if (parametro <= 1) {
            return parametro;
        }

        // Checa se tem algo na memória do array, se tiver ja fizemos a primeira iteração
        // Então começa a preencher o array com resultados
        // Retorna o valor quando precisarmos dele
        if (memoriaDeFibonacci[parametro] != 0) {
            return memoriaDeFibonacci[parametro];
        }

        // Caso recursivo de fibonacci
        long numeroDefibonacciX = fibonacci(parametro - 1) + fibonacci(parametro - 2);
        // Salva o resultado do caso recursivo dentro do array, para caso precisemos mais tarde
        memoriaDeFibonacci[parametro] = numeroDefibonacciX;
        return numeroDefibonacciX;
    }

    public static String verificadorDeFibonacci(int parametro){
        // Paramêtro +1 porque para fazer uma ultima interação de fibonacci() precisa ter 1 espaço a mais no array
        // Exemplo SEM +1: Achar o 3-ésimo número da sequencia de fibonacci:
        // [0 1 1] 2 <- o 2 ficaria DE FORA, consequentemente não achariamos o 3-ésimo número
        //
        // Exemplo COM +1:
        // [0 1 1 2] <- o 2 fica DENTRO, então achariamos o 3-ésimo número da sequencia, 3
        memoriaDeFibonacci = new long[parametro + 1];


        // Daqui para baixo é só lógica para devolver se o número passado pertence ou não
        // À sequência de Fibonacci
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
