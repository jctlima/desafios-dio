package org.example.ServicosContratados;
import java.util.Scanner;

public class Main {

    public static String verificarComboCompleto(String[] servicosContratados) {
        // Declara variáveis booleanas para acompanhar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // Itera sobre cada serviço contratado
        for (String servico : servicosContratados) {
            // Compara o serviço atual com cada um dos três possíveis
            if (servico.equals("movel")) {
                // Marca como true se o serviço móvel foi contratado
                movelContratado = true;
            } else if (servico.equals("banda larga")) {
                // Marca como true se o serviço de banda larga foi contratado
                bandaLargaContratada = true;
            } else if (servico.equals("tv")) {
                // Marca como true se o serviço de TV foi contratado
                tvContratada = true;
            }
        }

        // Verifica se todos os serviços foram contratados e retorna o resultado
        return movelContratado && bandaLargaContratada && tvContratada ? "Combo Completo" : "Combo Incompleto";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a lista de serviços contratados do usuário
        String input = scanner.nextLine();

        // Separa os serviços em um array de strings
        String[] servicosContratados = input.split(",");

        // Chama a função para verificar o combo e armazena o resultado
        String resultado = verificarComboCompleto(servicosContratados);

        // Imprime o resultado na tela
        System.out.println(resultado);

        // Fecha o scanner
        scanner.close();
    }
}