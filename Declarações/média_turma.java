/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Declarações;

import java.util.Scanner;

public class média_turma {

    /*Programa que lê 5 nomes e notas de uma turma, calcule e exibe a média 
    das notas da turma e em seguida exibe a relação de nomes cuja nota é 
    superior a esta média
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float media = 0;
        float nota = 0;
        float total = 0;
        float maior = 0;

        for (int x = 0; x < 5; x++) {
            /*System.out.println("Informe o Nome do Aluno : ");
        String nome =entrada.nextLine();
             */

            System.out.println("Informe a nota do Aluno: ");
            nota = entrada.nextFloat();

            if (nota > maior) {
                maior = nota;

            }

            media += nota;

            total = media / 5;
            System.out.println("Média da turma é: " + total);
            System.out.println("Maior nota " + maior);
           

        }

    }
}
