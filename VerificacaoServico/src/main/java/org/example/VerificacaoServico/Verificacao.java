package org.example.VerificacaoServico;
import java.util.Scanner;

public class Verificacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0].trim();  // Nome do cliente
        boolean contratado = false;

        // Verificando se o serviço está na lista de serviços contratados
        for (int i = 1; i < partes.length; i++) {
            if (partes[i].trim().equals(servico)) {
                contratado = true;
                break;
            }
        }

        // Exibindo o resultado
        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }

        scanner.close();
    }
}
