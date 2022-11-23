/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Declarações;

import java.util.Scanner;

public class Patos_e_coelhos {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int cabeca =0;
        int pes =0;

        int pesp =0;
        int pesc =0;
        int cabecap =0;
        int cabecac =0;
        int patos =0;
        int coelhos =0; 
        
        System.out.println("Informe o total de cabeças e pés: ");
        cabeca=entrada.nextInt();
        pes = entrada.nextInt();
        
        pesp = pesp+(pes/2);
        pesc = pesc+(pes/4);
        
        cabecap +=cabeca;
        cabecac += cabeca;
        
        patos = cabecap/pesp;
        coelhos= cabecac/pesc; 
        
        System.out.println("total de coelhos: "+coelhos+ " total de patos: "+patos);
        
        
     } 
}
