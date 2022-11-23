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
public class exercicio01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int contador ;
        double x=0;
        double conta=0;
        
        for (contador =0; contador<=4; contador++){
            System.out.println(contador+"º valor");
            x= entrada.nextDouble();     
            
            if (conta<x){
                conta=conta;
            }  
                    }
        System.out.println("O menor valor é: "+conta);
}
}