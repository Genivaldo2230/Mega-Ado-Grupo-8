package com.senac.sp.log.algorit.grupo_8_mega_ado;

import java.util.Scanner;

public class ViagemGuaruja2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Viagem para o Guarujá!!!");
        int disponibilidade, orcamento, clima = 0, transporte = 0, condicao = 0;
        System.out.println("Tenho disponibilidade? Digite 1 para SIM e 2 para NÃO.");
        disponibilidade = sc.nextInt();

        if (disponibilidade == 1) {
            System.out.println("Tenho orçamento para esta viagem? \nDigite o valor do seu orçamento.");
            orcamento = sc.nextInt();
            if (orcamento >= 2000) {
                System.out.println("Como estão as condições climaticas? Digite a temperatura para o final de semana.");
                clima = sc.nextInt();
            } else {
            }
        }
        if (clima >= 25) {
            System.out.println("A viagem será de Carro ou de Onibus? Digite 1 para CARRO PRÓPRIO e 2 para CARRO ALUGADO.");
            transporte = sc.nextInt();
            if (transporte == 1) {
                System.out.println("Verificar condições do carro e abastecer");
                System.out.println("Boa viagem, aproveite bem o seu final de semana!!!");
            } else {
                System.out.println("Verificar a disponibilidade e alugar um carro para ir viajar.");
                System.out.println("Boa viagem, aproveite bem o seu final de semana!!!");
            }
        } else {
            System.out.println("Viagem cancelada!!!");
        }
    }
}
