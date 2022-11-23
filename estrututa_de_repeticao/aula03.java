/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrututa_de_repeticao;
import java.util.Scanner;
/**
 *
 * programa que verifica o menor valor digitado
 */
public class aula03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int valor =0;
        int menorValor=0;
        
        for (int cont=1;cont<=10;cont++){
            System.out.println("informe o "+cont+"º valor" );
            valor=entrada.nextInt();
            
            
            if(cont==1){
                menorValor=valor;
            }
            if(valor<menorValor){
                menorValor=valor;
            }
        }
        System.out.println("Menor valor digitado: "+menorValor);
    }
    
}
