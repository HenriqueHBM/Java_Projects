/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrututa_de_repeticao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int cont = 0;
        int x = 0;
        double valor = 0;
        double desc = 0;
        double soma = 0;
        
        System.out.println("Informe a quantidade de produtos");
        cont = entrada.nextInt();

        while (x != cont) {
            x++;
            
            System.out.println("Informe o valor do produto ");
            valor = entrada.nextDouble();

            desc = valor - (valor * 5) / 100;
            soma += desc;
                       
            if (valor == 0) {
                x = cont;
                System.out.println("Você cancelou a conta dos produtos");
            }
        }
    }
}