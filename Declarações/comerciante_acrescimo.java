/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Declarações;

import java.util.Scanner;

public class comerciante_acrescimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int mes =0;
        int prestacao =0;
        
        System.out.println("Informe o valor da prestação: ");
        prestacao = entrada.nextInt();
        
        System.out.println("Informe o total de meses em atraso: ");
        mes = entrada.nextInt();
        
        double valor =0;
        valor = prestacao+(prestacao*10)/100;
        valor = valor *mes;
        System.out.println("Valor a pagar: "+valor);
        
        
    }
}
