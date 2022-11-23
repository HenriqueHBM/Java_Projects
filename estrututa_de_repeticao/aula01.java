/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrututa_de_repeticao;

import java.util.Scanner;

/**
 *
 * @author Mondrone-Lab-5
 */
public class aula01 {
    public static void main(String[] args){
    //usando a classe scanner para ler uma informação do console
        Scanner entrada = new Scanner (System.in);        
        double y;
        double total =0;
        double media =0;
        
        for (int x =0; x<=5; x++){
            System.out.println("Valor ");
            y= entrada.nextDouble();
            total +=+y;
           media =(total/x);
    }
 
     System.out.println("Soma total " + total);
     System.out.println("Media " + media);
}
    
    
    
    
}
