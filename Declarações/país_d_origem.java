/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Declarações;

import java.util.Scanner;

public class país_d_origem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String cod ="";
        float valor =0;
        float pagar =0;
       
        System.out.println("Codido do país: ");
        System.out.println("[A], [B], [C] ");
        
        System.out.println("Informe o codigo do produto: ");
        cod = entrada.nextLine();
                
        System.out.println("Informe o valor do produto: ");
        valor = entrada.nextFloat();
        
        switch(cod){
            case "A" : 
                System.out.println("Valor a pagar com Imposto: "+valor);
                break;
            case "B":
                pagar +=valor+(valor*15)/100;
                System.out.println("Valor a pagar com Imposto: "+pagar);
                break;
                
            case "C":
                pagar+=valor+(valor*25)/100;
                System.out.println("Valor a pagar com Imposto: "+pagar);
                break;
                
            default:
                System.out.println("Valor invalido ");
                
        }
        
        
        
    }     
}
