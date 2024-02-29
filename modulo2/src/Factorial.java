import java.util.HashMap;

public class Factorial {

    private static HashMap<Integer, Long> memo = new HashMap<>();

    public static long factorialTopDown(int n) {
        if (n < 0)
            throw new IllegalArgumentException("O fatorial não é definido para números negativos.");
        if (n == 0 || n == 1)
            return 1;

        if (memo.containsKey(n))
            return memo.get(n);

        long result = n * factorialTopDown(n - 1);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(factorialTopDown(n));
    }
}

// Abordagem Bottom-up
//Nesta abordagem, resolvemos o problema iterativamente, começando com os casos base e construindo a solução para instâncias maiores do problema. Aqui está uma implementação Java

public class Factorial {

    public static long factorialBottomUp(int n) {
        if (n < 0)
            throw new IllegalArgumentException("O fatorial não é definido para números negativos.");
        if (n == 0 || n == 1)
            return 1;

        long[] dp = new long[n + 1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = i * dp[i - 1];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(factorialBottomUp(n));
    }
}
// Quanto à questão de calcular o fatorial de um número acima de 100 com uma solução recursiva, não é uma abordagem prática. Isso ocorre porque a pilha de chamadas recursivas cresce muito rapidamente para valores grandes de entrada, levando a um estouro de pilha (stack overflow). Portanto, para calcular fatoriais de números grandes, a programação dinâmica é uma escolha muito mais adequada.