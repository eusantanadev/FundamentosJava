import java.util.Scanner;
public class SistemaPedidoCafe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a Cafeteria do Will");
        double valorTotal = 0;
        int quantidadeCafes = 0;
        boolean continuarPedido = true;
        while (continuarPedido) {
        System.out.println("Escolha o tamanho do seu café: (P) Pequeno, (M) Médio, (G) Grande: ");
        String tamanho = scanner.nextLine().toUpperCase();
        if (tamanho.equals("F")) {
            continuarPedido = false;
        } else {
            System.out.println("Escolha o tipo do café: (E) Expresso, (C) Capuccino, (L) Latte: ");
            String tipoCafe = scanner.nextLine().toUpperCase();
            double preco = 0;
            switch (tamanho) {
                case "P":
                    preco += 2.50;
                    break;
                case "M":
                    preco += 3.00;
                    break;
                case "G":
                    preco += 3.50;
                    break;
                default:
                    System.out.println("Opção de tamanho invalida!");
                    continue;
            }
            switch (tipoCafe) {
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
                    continue;
                }
                valorTotal += preco;
                quantidadeCafes++;
                System.out.println("Café adicionado ao pedido!");
            }
        }
        System.out.println("Seu pedido foi finalizado. Total a pagar: R$" + valorTotal);
        System.out.println("Quantidade de cafés pedidos: " + quantidadeCafes);
        scanner.close();
    }

}