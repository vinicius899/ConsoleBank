package edu.vinicius.banco.app;

import java.util.Scanner;

public class BancoTerminal {
    int accountNumber;
    String agency;
    String clientName; 
    double balance;

    public static void main(String[] args) {
        BancoTerminal bank = new BancoTerminal();
        Scanner scanner = new Scanner(System.in);

        bank.inputData(scanner);
        bank.greet();
    }

    /**
     * Lê dados do cliente pelo terminal.
     * @param s Objeto Scanner padrão do Java para leitura de dados.
     */
    private void inputData(Scanner s) {
        System.out.print("Num. da Conta: ");
        this.accountNumber = s.nextInt();
        System.out.print("Ag.: ");
        this.agency = s.next();
        System.out.print("Nome: ");
        this.clientName = s.next();
        System.out.print("Saldo: ");
        this.balance = s.nextDouble();
    }

    /**
     * Sauda o cliente, exibindo nome, agência, número da conta e saldo.
     */
    private void greet() {
        System.out.println("Olá " + this.clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agency + ", conta " + this.accountNumber + "; e seu saldo " + this.balance + " já está disponível para saque.");
    }
}
