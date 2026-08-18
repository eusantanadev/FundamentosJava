import java.util.Scanner;
import java.util.Random;


public class JogoAdivinhação {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(20) + 1; //Gera um numero aleatorio entre 1 e 20
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 20.");
        int tentativas = 0;
        boolean adivinhou = false;
        while (!adivinhou) {
            System.out.println("Digite sua tentativa: ");
            int tentativa = scanner.nextInt();
            tentativas++;
            if (tentativa == numeroSecreto){
                System.out.println("Parabéns você acertou o numero  em " + tentativas + " tentativas!");
                adivinhou = true;
            } else if (tentativa < numeroSecreto){
                System.out.println("Tente um numero maior.");
            } else {
                System.out.println("Tente um numero menor.");
            }
        }
        scanner.close();
    }
}
