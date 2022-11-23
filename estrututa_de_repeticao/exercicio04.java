/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrututa_de_repeticao;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int compras = 0;
        double soma = 0;
        double valor = 0;
        System.out.println("Quantas compras você efetuou realizou nesse mês?");
        compras = entrada.nextInt();

        for (int x = 0; x < compras; x++) {

            System.out.println("Informe o valor do produto");

            valor = entrada.nextDouble();
            soma += valor;
        }
        System.out.println("Valor total das compras foi de R$: " + soma);
    }

}
