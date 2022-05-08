package com.senac.sp.log.algorit.grupo_8_mega_ado;

import java.util.Scanner;

public class Desconto10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double desconto;
        int produtos;
        double valor;
        double valorTotal;

        System.out.println("Digite a quantidade de produtos:");
        produtos = sc.nextInt();
        System.out.println("Digite o valor unitário:");
        valor = sc.nextDouble();

        if (produtos >= 10) {
            desconto = ((valor * produtos) * (10) / 100);
            valorTotal = (valor * produtos) - desconto;
            System.out.println("Desconto de 10%: R$" + String.format("%.2f", desconto));

        } else {
            valorTotal = (valor * produtos);

        }
        System.out.println("Valor Total: R$" + String.format("%.2f", valorTotal));
    }

}
