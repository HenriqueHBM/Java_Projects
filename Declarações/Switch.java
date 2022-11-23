/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Declarações;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*System.out.println("Digite um número entre 1 e 4: ");
        int num = entrada.nextInt();

        switch (num) {
            case 1:
                System.out.println("Vc escolheu 1 ");
                break;
            case 2:
                System.out.println("Vc escolheu 2 ");
                break;
            case 3:
                System.out.println("Vc escolheu 3 ");
                break;
            case 4:
                System.out.println("Vc escolheu 4 ");
                break;
            default:
                System.out.println("Número Invalido");

        }

        System.out.println("Digite um dia de Semana entre Segunda e Sexta: ");
        String semana = entrada.nextLine();

        switch (semana){
            case "segunda" :
                System.out.println("Vc digitou Segunda");
                break;
            case "terca":
                System.out.println("Vc digitou Terça");
                break;
            case "quarta":
                System.out.println("Vc digitou Quarta");
                break;
            case "quinta":
                System.out.println("Vc digitou Quinta");
                break;
            case "sexta":
                System.out.println("Vc digitou Sexta");
                break;
            default:
                System.out.println("Dia incalido ");
        }
         */
        
        int c= 0;
        System.out.println("informe o codigo, 3, 4 ou 5: ");
        int codigo = entrada.nextInt();
        System.out.println("Informe o valor de [a] e [b]");
        int a = entrada.nextInt();
        int b =entrada.nextInt();
        
        switch (codigo) {
            case 3:
                c=a+b;
                System.out.println( c+(c*20)/100);
                
                //Jeito da Professora:         
                a=a+b;
                System.out.println(a=a+(a*20)/100);
                
                break;

            case 4:   
                c= b-a;
                System.out.println(c+(c*20)/100);
                
                //Jeito da Professora: 
                a=b-a;
                System.out.println(a=a+(a*20)/100);
                break;

            case 5:
                c=a+a;
                System.out.println(c-(c*5)/100);
                
                //Jeito da Professora: 
                a=a+a;
                System.out.println(a=a-(a*5)/100);
                break;

            default:
                System.out.println("VALOR INVALIDO");
                
                
                
        }

    }   
}
