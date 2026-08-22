import java.util.Scanner;

public class MediaClasse {
    public static void main(String[] args){
        System.out.println("Bem vindo ao sistema de notas!");
        Scanner scanner = new Scanner(System.in);
        int totalAlunos = 10;
        double somaNotas = 0;
        for (int i = 1; i <= totalAlunos; i++) {
            System.out.print("Nota aluno " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }
        double mediaSala = somaNotas / totalAlunos;
        System.out.println("A média das notas da sala é: " + mediaSala);
        scanner.close();
    }
}
