import java.util.Scanner;

public class ItemView {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Item item = null; //NÃO ENTENDI
        int op;
        do {
            System.out.println("Escolha uma opção: \n1-Cadastrar Item \n2-Exibir Item \n0-Sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite o nome do item: ");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite a descrição do item: ");
                    String descricao = sc.next() + sc.nextLine();
                    System.out.println("O item é raro? (true - Sim / false - Não");
                    boolean raro = sc.nextBoolean();
                    System.out.println("Digite o nivel de poder do item: ");
                    int nivelPoder = sc.nextInt();
                    item = new  Item(nome, descricao, raro, nivelPoder); //NÃO ENTENDI
                    break;
                case 2:
                    if (item != null) {
                        System.out.println("Nome: " + item.nome + " Descrição: " + item.descricao + " Raro: " + item.raro + " nivelPoder:" + item.nivelPoder);
                    } else {
                        System.out.println("Nenhum item cadastrado ainda.");
                    }
                    break;
                case 0:
                    System.out.println("Finalizando o programa.");
                    break;
                    default:
                            System.out.println("Opção Inválida");
                    }
            } while (op != 0);
            sc.close();
    }
}
