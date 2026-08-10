public class OperadoresAritmeticosExemplo {
    public static void main(String[] args){
        int a = 10;
        int b = 3;

        int soma = a + b; // 10 + 3 = 13
        int subtracao = a - b; // 10 - 3 = 7
        int multiplicacao =  a * b; // 10 * 3 = 30
        int divisao = a / b; // 10 / 3 (a divisão de inteiros descarta as casas decimais)
        int modulo = a % b; // 10 % 3 = 1 (resto da divisão)

        System.out.println("soma: " + soma);
        System.out.println("subtracao: " + subtracao);
        System.out.println("multiplicacao: " + multiplicacao);
        System.out.println("divisao: " + divisao);
        System.out.println("modulo: " + modulo);
    }
}
