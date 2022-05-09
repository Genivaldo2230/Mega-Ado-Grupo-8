package org.example;

import java.util.Random;
import java.util.Scanner;

/**
 * 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
 *
 * @author Genivaldo Alves
 */
public class CreditosGrupo_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] alunos = new int[6];

        System.out.println("\n\n\nAPRESENTAÇÃO DO GRUPO 8 TURMA (B)\n"
                + "FORMADOS PELO INTEGRANTES\n\n");

        System.out.println("\tGenivaldo Alves Dos Anjos\n"
                + "Criação Menu de Crditos do Grupo 8 Turma B \n"
                + "Mostrar o nome completo de todos os integrantes do grupo (tela de créditos)\n");

        System.out.println("\tDebora Bazilio \n"
                + "Criador Codigos faz leitura \n"
                + "Dado a quantidade de kWh consumidos e o preço unitário por kWh\n"
                + "(Enel/SP), calcular a tarifa da conta de luz (desconsiderar impostos e\n"
                + "extras)\n");

        System.out.println("\tElvis Andrade\n"
                + "Criador do codigo Viagem ao Guaruja \n"
                + "Desenvolver programa baseado no fluxograma para decidir se podemos ir para o Guarujá no final de semana\n"
                + "Condições: previsão do tempo (temperatura maior que 25º, sem chuva e orçamento mínimo de R$ 2000 \n");

        System.out.println("\tAnderson Gagliardi \n"
                + "Criado do codigo Venda com Desconto 10% \n"
                + "Desenvolver programa baseado no fluxograma para calcular 10% de desconto no preço total de um produto ao\n"
                + "comprar 10 ou mais unidades ou o preço total cheio se tiver menos de 10 unidades \n");

        System.out.println("\tKarina da Silva Chaves \n "
                + "Criadora codigo Menu de leitura Dinamico\n");

        System.out.println("Danilo Maximiano \n"
                + "5.	Dado o volume consumido e as faixas de tarifas por m3 (Sabesp/SP),\n"
                + " calcular a tarifa de água e esgoto (desconsiderar impostos)");

        System.out.println("Grupo 8 trabalho no codigo IMC \n"
                + "3.	Calcular o IMC (Índice de massa corpórea) de uma determinada pessoa\n"
                + "•	Adotar os critérios abaixo:\n"
                + "1.	Magreza, quando o resultado é menor que 18,5 kg/m2;\n"
                + "2.	Normal, quando o resultado está entre 18,5 e 24,9 kg/m2;\n"
                + "3.	Sobrepeso, quando o resultado está entre 24,9 e 30 kg/m2;\n"
                + "4.	Obesidade, quando o resultado é maior que 30 kg/m2.");

        for (int i = 0; i < alunos.length; i++) {
            int random = new Random().nextInt(9);
            alunos[i] = random;
        }
        System.out.println("\tProjeto Integrador 1 Desenvolvimento de Lógica "
                + "\t\n\nApresentamos \t\n\nGrupo 8 Turma B \t"
                + "\nCurso Analise e Desenvolvimento de Sistema \t\nSENAC-SÂO PAULO");
    }
}
