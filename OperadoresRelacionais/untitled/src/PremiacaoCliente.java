import java.util.Scanner;

public class PremiacaoCliente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorCompras;
        int frequencia;

        // Solicitando informações ao cliente
        System.out.print("Informe o valor total das suas compras este ano: ");
        valorCompras = scanner.nextDouble();

        System.out.print("Quantas vezes você realizou compras na loja este ano? ");
        frequencia = scanner.nextInt();

        // Verificação para premiação dos clientes

        if (valorCompras >=2000 && frequencia >=10){
            System.out.println("Parabéns! Você esta na categoria VIP e ganhou um voucher de desconto.");
        }

        else if  (valorCompras <=1000){
            System.out.println("Você esta na categoria ouro e ganhou pontos extras no programa de fidelidade");
        }
        else if (valorCompras >=500 || frequencia >=5) {
            System.out.println("Você esta na categoria Prata e ganhou um brinde especial.");
        }

        else {
            System.out.println("Você esta na categoria bronze e não recebeu premiação especial");
        }
    }
}

