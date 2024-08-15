package Aula2;

import java.util.Scanner;


public class Aula2 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        conta.nome = sc.nextLine();
        System.out.println("Qual o tipo da conta? ");
        conta.tipoConta = sc.nextLine();
        System.out.println("Qual o seu saldo? ");
        conta.saldo = sc.nextDouble();


        System.out.println("********************************");
        System.out.println("   DADOS INICIAIS DO CLIENTE:   ");
        System.out.println("Nome:                " + conta.nome);
        System.out.println("Tipo conta:            " + conta.tipoConta);
        System.out.println("Saldo inicial:       R$" + conta.saldo);
        System.out.println("********************************");

        int operacao;
        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo;
                2 - Fazer PIX;
                3 - Receber PIX;
                4 - Sair.

                """;


        do {
            System.out.println(menu);
            operacao = sc.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println(conta.consultaSaldo(conta));
                    break;
                case 2:
                    conta.fazPix(conta);
                    break;
                case 3:
                    conta.recebePix(conta);
                    break;
                case 4:
                    conta.sair();
                    break;
                default:
                    System.out.println("\nOpção inválida. Por favor insira uma opção válida.\n");
            }
        } while (operacao != 4);
    }
}
