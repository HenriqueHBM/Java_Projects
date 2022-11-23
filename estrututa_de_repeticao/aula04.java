/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrututa_de_repeticao;

/**
 *
 *
 */
import java.util.Scanner;

public class aula04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidade;
        float altura;
        int peso;
        double menor = 0;
        double maior = 0;

        System.out.println("Quantidade de Moças? ");
        quantidade = entrada.nextInt();
        for (int x = 0; x < quantidade; x++) {

            System.out.println("Digite a altura da " + x + " moça");
            altura = entrada.nextInt();
            if (x == 1) {
                menor = altura;
            }
            if (altura > menor) {
                maior = altura;
            } else {
                menor = altura;
            }

        }
        System.out.println("A maior altura é: " + maior);
        System.out.println("A menor altura é: " + menor);

    }
}
