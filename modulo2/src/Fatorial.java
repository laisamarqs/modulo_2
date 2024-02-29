public class Fatorial {
    public static void main(String[] args) {
        int numero = 7;
        long resultado = calcularFatorial(numero);
        System.out.println("Fatorial de " + numero + " = " + resultado);
    }

    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
}


//Quanto à questão de calcular o fatorial de um número acima de 100 com uma solução recursiva, é importante notar que soluções recursivas têm limites práticos devido ao uso da pilha de chamadas recursivas. O Java tem um limite para a profundidade máxima da pilha de chamadas (tamanho da pilha de chamadas), e calcular o fatorial de um número muito grande pode exceder esse limite e causar um estouro de pilha (StackOverflowError).

//Portanto, para números muito grandes, é preferível usar uma abordagem iterativa ou uma biblioteca que suporte números de precisão arbitrária para evitar estouro de pilha.
