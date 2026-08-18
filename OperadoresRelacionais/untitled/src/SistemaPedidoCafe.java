import java.util.Scanner;
public class SistemaPedidoCafe{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a Cafeteria do Will");
        System.out.println("Escolha o tamanho do seu café: (P) Pequeno, (M) Médio, (G) Grande");
        String tamanho = scanner.nextLine().toUpperCase();
        System.out.println("Escolha o tipo do café: (E) Expresso, (C) Capuccino, (L) Latte");
        String tipoCafe = scanner.nextLine().toUpperCase();

        double preco = 0;

        switch (tamanho){
            case "P":
                preco +=2.50;
                break;
            case "M":
                preco += 3.00;
                break;
            case "G":
                preco +=3.50;
                break;
            default:
                System.out.println("Opção de tamanho invalida!");
                return;

        }

        switch (tipoCafe){
            case "E":
                preco += 1.50;
                System.out.println("Café Expresso selecionando.");
                break;
            case "C":
                preco += 2.00;
                System.out.println("Café Cappuccino selecionando.");
                break;
            case "L":
                preco += 2.50;
                System.out.println("Café Latte selecionando.");
                break;
            default:
                System.out.println("Opção do café invalido!");
                return;
        }

        System.out.println("Seu pedido foi confirmado!");
        System.out.println("Total a pagar: R$" + preco);
    }
}