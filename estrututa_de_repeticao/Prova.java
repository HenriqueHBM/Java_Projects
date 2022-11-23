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
public class Prova {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int menor = 0;
        int valor = 0;
        int maior = 0;

            System.out.println("Informe 5 valores inteiros ");
        for (int x = 0; x < 5; x++) {
            System.out.println("Informe um valor");

            valor = entrada.nextInt();
            
            
            if (x == 1) {
                menor = valor;
            
            }
            if (valor < menor) {
                menor = valor;
            
            }
            if(valor>maior){
                maior=valor;
            }
     
        }
        System.out.println("menor valor digitado foi: "+menor);
        System.out.println("maior valor digitado foi: "+maior);
    }

}

