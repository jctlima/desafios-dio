package org.example.VerificacaoServico;

import java.util.Scanner;

public class VerificacaoScan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o serviço a ser verificado
        System.out.print("Digite o serviço que deseja verificar: ");
        String servico = scanner.nextLine().trim();

        // Solicita ao usuário o nome do cliente e os serviços contratados
        System.out.print("Digite o nome do cliente seguido pelos serviços contratados (ex: Alice,movel,fixa): ");
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0].trim();  // Nome do cliente
        boolean contratado = false;

        // Verificando se o serviço está na lista de serviços contratados
        for (int i = 1; i < partes.length; i++) {
            if (partes[i].trim().equalsIgnoreCase(servico)) {
                contratado = true;
                break;
            }
        }

        // Exibindo o resultado
        if (contratado) {
            System.out.println("Sim, o cliente " + nomeCliente + " contratou o serviço " + servico + ".");
        } else {
            System.out.println("Não, o cliente " + nomeCliente + " não contratou o serviço " + servico + ".");
        }

        scanner.close();
    }
}
