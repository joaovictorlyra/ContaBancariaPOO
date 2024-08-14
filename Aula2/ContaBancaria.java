package Aula2;

import java.util.Scanner;

public class ContaBancaria {
    String nome;
    String tipoConta;
    double saldo;

    Scanner sc = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }


    public void consultaSaldo(ContaBancaria conta) {
        System.out.println("\n" + conta.getNome() + " seu saldo é de R$" + conta.getSaldo() + "\n");
    }

    public void fazPix(ContaBancaria conta) {
        System.out.println("Qual valor deseja transferir?");
        double valorTransferido = sc.nextDouble();
        if (valorTransferido <= conta.getSaldo()) {
            conta.saldo -= valorTransferido;
            System.out.println("\nSeu saldo atual é de R$" + conta.getSaldo() + "\n");
        } else {
            System.out.println("\nValor insuficiente para realizar a transferência. Liso!!\n");
        }
    }

    public void recebePix(ContaBancaria conta) {
        System.out.println("Qual valor deseja receber?");
        double valorRecebido = sc.nextDouble();
        conta.saldo += valorRecebido;
        System.out.println("\nSeu saldo atual é de R$" + conta.getSaldo() + "\n");
    }

    public void sair() {
        System.out.println("Saindo....");
    }
}
