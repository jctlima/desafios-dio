package org.example.ContaBanco;
import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Implementando o objeto scanner para capturar inserções via terminal
        Scanner scanner = new Scanner(System.in);

        //Declaração de Variávaveis do projeto
        int numeroConta;
        String agencia;
        String nomeCliente;
        BigDecimal saldo=null;

        //Solicitações ao usuário
        System.out.println("Por favor, digite o número da agência:");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta:");
        numeroConta = scanner.nextInt();
        scanner.nextLine();//consome a quebra de linha após o número
        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = scanner.nextLine();
        // Loop para garantir que o usuário insira um valor válido para o saldo
        while (saldo == null) {
            System.out.println("Por favor, digite o saldo da conta (use vírgula ou ponto para separador decimal):");
            String saldoInput = scanner.nextLine().replace(",", ".");  // Substitui vírgula por ponto

            try {
                saldo = new BigDecimal(saldoInput);  // Tenta converter para BigDecimal
            } catch (NumberFormatException e) {
                System.out.println("Erro: O saldo inserido não é um número válido. Por favor, tente novamente.");
            }
        }
        //Exibir os dados da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta número " + numeroConta + " e " +
                "seu saldo " + saldo + " já está disponível para saque.");

        //finalizando o scanner
        scanner.close();
    }
}