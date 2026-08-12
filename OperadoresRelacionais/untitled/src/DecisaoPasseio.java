import java.util.Scanner;

public class DecisaoPasseio {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        boolean ensolarado, finalSemana;
        // Receber informações do usuario sobre as condições
        System.out.print("Esta ensolarado? (true para sim / false para não: ");
        ensolarado = scanner.nextBoolean();
        System.out.print("É final de semana? (true para sim / false para não: ");
        finalSemana = scanner.nextBoolean();
        // Verificar as condições para definir o destino do passeio
        if (ensolarado && finalSemana) { // "&&" Representa o operador AND em Java
            System.out.println("Vamos  á praia para aproveitar o sol!");
        }
    }
}
