import java.util.Scanner;

public class Menu {

    static void main() {
        Scanner sc = new Scanner(System.in);

        PersonagemMagico personagem = new PersonagemMagico();
        int op;
        do {
            System.out.println("Escolha uma opção: \n1-Cadastrar Personagem \n2-Exibir Personagem \n3-Realizar ataque \n4-Aumentar energia \n5-Ativar Habilidade Especial \n0-Sair");
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
                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, custoEnergia, ativa);
                    //Atribuindo o objeto habilidade especial ao personagem
                    personagem.habilidade = habilidadeEspecial;
                    break;
                case 2:
                    System.out.println("Nome: " + personagem.nome + " Poder: " + personagem.poderMagico + " Energia: " + personagem.nivelEnergia);
                    System.out.println("Habilidade: " + personagem.habilidade.nomeHabilidade + " Custo Energia: " + personagem.habilidade.custoEnergia + " Habilidade Ativa? " + personagem.habilidade.ativa);
                    break;
                case 3:
                    System.out.println("Digite o nome do ataque: ");
                    String ataque = sc.next() + sc.nextLine();
                    personagem.atacar(ataque);
                    break;
                case 4:
                    System.out.println("Digite a quantidade energia: ");
                    int qtd = sc.nextInt();
                    int nivelAtual = personagem.aumentarEnergia(qtd);
                    System.out.println("Nivel atual de energia: " + nivelAtual);
                    break;
                case 5:
                    personagem.ativarHabilidadeEspecial();
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
