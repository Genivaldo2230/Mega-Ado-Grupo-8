package com.senac.sp.log.algorit.grupo_8_mega_ado;
// chave git :  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
//elvi
import java.util.Scanner;

public class Enel {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int kWh;
        float total;

        System.out.println("Digite o consumo em kWh gasto : ");
        kWh = sc.nextInt();

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
    }

}