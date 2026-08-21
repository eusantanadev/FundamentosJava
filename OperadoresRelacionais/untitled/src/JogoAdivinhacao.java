import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Jogo de Adivinhação!!!");
        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;
        int tentativas = 0;
        int palpite;
        System.out.println("Tente adivinhar o numero secreto entre 1 e 10.");
        do {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;
            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto! " + numeroSecreto);
            } else {
                System.out.println("Ops! Tente novamente.");
                }
            } while (palpite != numeroSecreto);
            System.out.println("Você acertou em " + tentativas + " tentativas");
            scanner.close();
    }
}
