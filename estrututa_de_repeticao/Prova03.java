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
public class Prova03 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int tempo = 0;
        double salario = 0;
        
        for(int x=1; x<4;x++){
            System.out.println("Informe o tempo em anos de trabalho do "+x+"º funcionario, e o salario atual");
            tempo=entrada.nextInt();
            salario=entrada.nextDouble();
            
            
            if(tempo<5){
                
                salario=salario+(salario*10)/100;
                
            }
            
            else{
                salario=salario+(salario*20)/100;
                
            }
            System.out.println("Salario atual igual a: "+salario);
            
            
            
        }
     }
    
}
