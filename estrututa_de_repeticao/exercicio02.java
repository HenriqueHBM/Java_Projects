/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
faça uma aplicação que solicita ao adm um numero de funcionarios 
informe um bonus de 20% se o trabalho na empresa for maior que 5 anos
 */
package estrututa_de_repeticao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quant = 0;
        double anos = 0;
        double total = 0;
        double salario = 0;

        System.out.println("informe a quantidade de funcionarios ");
        quant = entrada.nextInt();
        for (int x = 1; x <= quant; x++) {
            System.out.println("informe quantos anos de trabalho o " + x + " funcionario possui ");
            anos = entrada.nextDouble();

            if (anos >= 5) {
                System.out.println("informe o seu salario");
                salario = entrada.nextDouble();
                salario = salario + (salario * 20) / 100;
                System.out.println("Você pode ter um aumento no salario " + salario);
            } else {
                System.out.println("Voce não pode ter um aumento no salario ");
            }
        }
    }
}
