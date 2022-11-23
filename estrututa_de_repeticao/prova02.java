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
public class prova02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float valor = 0;
        float media = 0 ;
        
        System.out.println("Informe 5 valores");
        
        for(float x =1; x<6;x++){
            System.out.println("informe o "+x+" valor ");
            valor=entrada.nextFloat();
            
            
            media = valor+media ;
            
        
        }
        media=media/5;
        System.out.println("Média dos valores é: "+media);
    }
}
