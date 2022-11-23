/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Declarações;

import java.util.Scanner;

public class revendedoraDcarros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int salario = 1000;
        int vendidos = 0;
        
        System.out.println("Informe a quantidade de carros vendidos: ");
        vendidos = entrada.nextInt();

        if (vendidos <= 5) {
            salario+=500*vendidos;
            
        } else {
            salario+=1000*vendidos;
        }
        
        System.out.println("Salario total do funcionario : "+ salario);
    }
}
