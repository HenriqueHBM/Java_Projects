/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrututa_de_repeticao;

import java.util.Scanner;

/**
 * Faça um programa que recebe 2 notas de 5 alunos, calcule e mostre a média
 * aritimética das duas notas de cada aluno. informe uma mensagem conforme a
 * seguir: média: 30- reprovado média: 30 and 70 -exame média: >70 -aprovado
 *
 * mostre total de alunos aprovados, total em exames, alunos reprovados e a
 * média da classe
 *
 */
public class exercicio05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1 = 0;
        double nota2 = 0;
        double soma = 0;
        double media = 0;
        int reprovado = 0;
        int exame = 0;
        int aprovado = 0;
        double mediadaClasse = 0;

        for (int alunos = 0; alunos < 5; alunos++) {
            System.out.println("informe as 2 notas notas ");
            nota1 = entrada.nextDouble();
            nota2 = entrada.nextDouble();
            System.out.println("1º nota: " + nota1 + ", 2º Nota: " + nota2);
            soma = nota1 + nota2;

            System.out.println("Soma das notas: " + soma);
            media = soma / 2;

            if (media < 30) {
                System.out.println("Reprovado");
                reprovado += 1;
                System.out.println("Média de: " + media);
            }
            if (media >= 30 || media < 70) {
                System.out.println("Exame");
                exame += 1;
                System.out.println("Média de: " + media);
            }

            if (media >= 70) {

                System.out.println("Aprovado");
                aprovado += 1;
                System.out.println("Média de: " + media);
            }
            mediadaClasse += media;
        }
        mediadaClasse = mediadaClasse / 5;
        System.out.println("Total de alunos Reprovados: " + reprovado);
        System.out.println("Total de alunos para exame: " + exame);
        System.out.println("Total de alunos aprovados: " + aprovado);
        System.out.println("Média da Classe: " + mediadaClasse);

    }
}
