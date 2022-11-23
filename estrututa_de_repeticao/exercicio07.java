/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrututa_de_repeticao;

import java.util.Scanner;

/**
 * Programa que recebe o codigo de varios produtos Informe o valor e um desconto
 * de 5% para cada produto informado. Quando o usuario digitar 0, O programa
 * deve encerrar e mostrar o valor total dos produtos com o desconto
 *
 */
public class exercicio07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float quant = 0;
        int x = 1;
        float valor = 0;
        float desc = 0;
        float total = 0;

        System.out.println("Informe o codigo de varios produtos ");
        quant = entrada.nextInt();

        while (quant != 0) {

            System.out.println("Informe o valor do produto ");
            valor = entrada.nextFloat();

            desc = valor - (valor * 5) / 100;
            total += desc;

            System.out.println("Para parar o programa digite [0]. Para continuar "
                    + "digite qualquer outro valor");
            quant = entrada.nextFloat();

        }
        System.out.println("Valor total dos produtos com desconto: " + total);
    }
}
