/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrututa_de_repeticao;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor;
        int soma = 0;

        for (int cont = 1; cont <= 10; cont++) {
            System.out.println("linha " + cont + " digite um valor: ");
            valor = entrada.nextInt();
            soma += valor;

        }
        System.out.println("Soma: " + soma);
    }
}
