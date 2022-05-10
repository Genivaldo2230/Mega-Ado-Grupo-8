package com.senac.sp.log.algorit.grupo_8_mega_ado;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author karinaSilva
 */
public class AdoTsudaCompleto {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Ecolha uma opção a seguir:");

        System.out.println("(1)- Viagem ao Guaruja");
        System.out.println("(2)- Calculo Desconto");
        System.out.println("(3) Calcular o IMC");
        System.out.println("(4) Calculo da tarifa da conta de luz");
        System.out.println("(5) Calculo da tarifa de água e esgoto");
        System.out.println("(6) Créditos aos desenvolvedores do programa");
        System.out.println("(7) Sair do Programa");
        int MenuOpcao = input.nextInt();

        switch (MenuOpcao) {
            case 1: {
                int disponibilidade, orcamento, clima = 0, transporte = 0, condicao = 0;
                System.out.println("Tenho disponibilidade? Digite 1 para SIM e 2 para NÃO.");
                disponibilidade = input.nextInt();

                if (disponibilidade == 1) {
                    System.out.println("Tenho orçamento para esta viagem?");
                    orcamento = input.nextInt();
                    if (orcamento == 1) {
                        System.out.println("Como estão as condições climaticas? Digite 1 para SIM e 2 para NÂO.");
                        clima = input.nextInt();
                        if (clima == 1) {
                            System.out.println("A viagem será de Carro ou de Onibus? Digite 1 para CARRO PRÒPRIO e 2 para CARRO ALUGADO.");
                            transporte = input.nextInt();
                            if (transporte == 1) {
                                System.out.println("Verificar condições do carro e abastecer");
                                System.out.println("Boa viagem, aproveite bem o seu final de semana!!!");
                            } else {
                                System.out.println("Verificar a disponibilidade e alugar um carro para ir viajar.");
                                System.out.println("Boa viagem, aproveite bem o seu final de semana!!!");

                            }

                        }
                    }
                } else {
                    System.out.println("Viagem cancelada!!!");
                    break;
                }
            }
            case 2: {
                double desconto;
                int produtos;
                double valor;
                double valorTotal;

                System.out.println("Digite a quantidade de produtos:");
                produtos = input.nextInt();
                System.out.println("Digite o valor unitário:");
                valor = input.nextDouble();

                if (produtos >= 10) {
                    desconto = ((valor * produtos) * (10) / 100);
                    valorTotal = (valor * produtos) - desconto;
                    System.out.println("Desconto de 10%: R$" + String.format("%.2f", desconto));

                } else {
                    valorTotal = (valor * produtos);

                }
                System.out.println("Valor Total: R$" + String.format("%.2f", valorTotal));
                break;

            }

            case 3: {
                float altura, peso, massa;

                System.out.println("Digite o seu peso : ");
                peso = input.nextFloat();

                System.out.println("Digite sua altura : ");
                altura = input.nextFloat();

                massa = peso / (altura * altura);

                if (massa < 18.50) {
                    System.out.println("Você apresenta estar com Magreza e o resultado do seu IMC é : " + massa);
                } else if (massa > 18.50 && massa < 24.90) {
                    System.out.println("Você apresenta estar Normal e o resultado do seu IMC é : " + massa);
                } else if (massa > 24.90 && massa < 30.00) {
                    System.out.println("Você apresenta estar com Magreza e o resultado do seu IMC é : " + massa);
                } else {
                    System.out.println("Você apresenta estar com Magreza e o resultado do seu IMC é : " + massa);
                    break;
                }

            }
            case 4: {
                int kWh;
                float total;

                System.out.println("Digite o consumo em kWh gasto : ");
                kWh = input.nextInt();

                if (kWh < 150) {
                    total = (float) (kWh * 0.20);
                } else if (kWh >= 150 && kWh < 500) {
                    total = (float) (kWh * 0.25);
                } else {
                    total = (float) (kWh * 0.30);
                }
                if (total <= 11.90) {
                    total = (float) 11.90;
                }
                System.out.println("O valor total de sua conta é R$ : " + total);
                break;
            }
            case 5: {
                float valorConta, valorConta2, valorConta3, consumoConta1, esgoto = 0, total;

                System.out.println("Digite o consumo : ");
                consumoConta1 = input.nextFloat();

                if (consumoConta1 > 0 && consumoConta1 <= 10) {
                    valorConta = (float) (consumoConta1 * 2.90);
                    esgoto = valorConta;
                    total = valorConta + esgoto;
                    System.out.println("O valor de sua conta é : R$ " + valorConta + " e o valor de esgoto é : R$ " + esgoto);
                    System.out.println("O valor total de sua conta é R$ " + total);

                } else if (consumoConta1 > 10) {
                    valorConta = (float) (consumoConta1 * 2.90) / 2;
                    valorConta2 = consumoConta1 - 10;
                    valorConta3 = (float) (valorConta2 * 4.54);
                    total = valorConta + valorConta3;
                    System.out.println("O valor de sua conta é : R$ " + total + " e o valor de esgoto é : R$ " + total);
                    total = total + total;
                    System.out.println("O valor total de sua conta é R$ " + total);
                    break;
                }
            }
            case 6: {
                System.out.println("\n\n\nAPRESENTAÇÃO DO GRUPO 8 TURMA (B)\n"
                        + "FORMADOS PELO INTEGRANTES\n\n");

                System.out.println("\tGenivaldo Alves Dos Anjos\n"
                        + "Criação Menu de Crditos do Grupo 8 Turma B \n"
                        + "Mostrar o nome completo de todos os integrantes do grupo (tela de créditos)\n");

                System.out.println("\tDebora Bazilio\n"
                        + "Criador Codigos faz leitura \n"
                        + "Dado a quantidade de kWh consumidos e o preço unitário por kWh\n"
                        + "(Enel/SP), calcular a tarifa da conta de luz (desconsiderar impostos e\n"
                        + "extras)\n");

                System.out.println("\tElvis Andrade \n"
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
                    int[] alunos = null;
                    alunos[i] = random;
                }
                System.out.println("\tProjeto Integrador 1 Desenvolvimento de Lógica "
                        + "\t\n\nApresentamos \t\n\nGrupo 8 Turma B \t"
                        + "\nCurso Analise e Desenvolvimento de Sistema \t\nSENAC-SÂO PAULO");
                break;
            }
            case 7: {
                System.out.println("Você saiu do programa");
                break;
            }
        }
    }

    private static class alunos {

        private static int length;

        public alunos() {
        }
    }

}
