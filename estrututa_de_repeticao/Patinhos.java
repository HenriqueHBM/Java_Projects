/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrututa_de_repeticao;

import java.util.Scanner;

public class Patinhos {
    public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
         
         int volt =0;
         for(int patin =5; patin>0; patin-- ){
             //subtraindo quantos voltaram 
             volt=patin-1;
             System.out.println(patin+" patinho foram passear "
             +"Alem das montanhas para nadar.");
             
             System.out.println("A mamãe gritou Quack Quack Quack, Mas "+volt+" voltou de lá.");
             
             if( patin==1){
                 System.out.println("Como nenhum voltou de lá");
                  System.out.println("A mamãe estranhou e foi atrás "
                  +"E ela achou os 5 patinhos. ");
                 
                 
             }
             
             
         }
       
    
    }
    
}
