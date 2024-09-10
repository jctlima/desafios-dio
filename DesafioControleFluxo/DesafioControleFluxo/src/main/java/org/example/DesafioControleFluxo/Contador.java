package org.example.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();

            try {
                // Chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);

            } catch (ParametrosInvalidosException exception) {
                // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(exception.getMessage());

                // Perguntar se o usuário deseja inverter a ordem dos parâmetros
                System.out.println("Deseja inverter os parâmetros e tentar novamente? (sim/não)");
                String resposta = terminal.next();

                if (resposta.equalsIgnoreCase("sim")) {
                    try {
                        contar(parametroDois, parametroUm); // Inverter os parâmetros
                    } catch (ParametrosInvalidosException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    continuar = false; // Encerra o loop se o usuário não quiser inverter
                }
            }

            if (continuar) {
                // Pergunta se o usuário quer repetir ou encerrar
                System.out.println("Deseja realizar outra contagem? (sim/não)");
                String repetir = terminal.next();
                if (!repetir.equalsIgnoreCase("sim")) {
                    continuar = false; // Sai do loop se a resposta não for "sim"
                }
            }
        }

        System.out.println("Aplicação encerrada.");
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
