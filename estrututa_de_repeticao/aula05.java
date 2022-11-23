/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrututa_de_repeticao;
import java.util.Scanner;


public class aula05 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int cont =0;
        int total =0;
        int valor =0;
        while (cont<10){
        
        
        
        System.out.println("Valor "+cont++);
        valor = entrada.nextInt();
        total +=valor;
               
                }
        System.out.println("Resultado da soma: "+total);
        
       
}
}