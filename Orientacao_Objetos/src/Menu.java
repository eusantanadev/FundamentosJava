import java.util.Scanner;

public class Menu {

    static void main() {
        Scanner sc = new Scanner(System.in);

        PersonagemMagico personagem = new PersonagemMagico();
        int op;
        do {
            System.out.println("Escolha uma opção: \n1-Cadastrar Personagem \n2-Exibir Personagem \n0-Sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite o nome do personagem: ");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite o poder do personagem: ");
                    String poder = sc.next() + sc.nextLine();
                    System.out.println("Digite o nivel de energia: ");
                    int energia = sc.nextInt();
                    personagem.nome = nome;
                    personagem.nivelEnergia = energia;
                    personagem.poderMagico = poder;


                    System.out.println("Digite o nome da habilidade especial: ");
                    String nomeHabilidade = sc.next() + sc.nextLine();
                    System.out.println("Digite o custo de energia para usar a habilidade especial: ");
                    int custoEnergia = sc.nextInt();
                    System.out.println("A habilidade esta ativada? true - sim / false - não");
                    boolean ativa = sc.nextBoolean();
                    //Criando o objeto  que representa a habilidade especial com valores informados pelo usuario
                    HabilidadeEspecial HabilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, custoEnergia, ativa);
                    //Atribuindo o objeto habilidade especial ao personagem
                    personagem.habilidade = HabilidadeEspecial;
                    break;
                case 2:
                    System.out.println("Nome: " + personagem.nome + " Poder: " + personagem.poderMagico + " Energia: " + personagem.nivelEnergia);
                    System.out.println("Habilidade: " + personagem.habilidade.nomeHabilidade + " Custo Energia: " + personagem.habilidade.custoEnergia + " Habilidade Ativa? " + personagem.habilidade.ativa);
                    break;
                case 0:
                    System.out.println("Finalizando o programa");
                default:
                    System.out.println("Opção inválida");
            }
        }while(op !=0);
        sc.close();
    }
}
