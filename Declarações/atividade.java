/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Declarações;

import java.util.Scanner;

/*
PROGRAMA QUE RECEBE:
- O CODIGO DE UM PRODUTO (01 A 04);
- A QUANTIDADE COMPRADA;

CALCULE E MOSTRE:
- O VALOR TOTAL DA NOTA;
- O VALOR FINAL COM DESCONTO DE 10%;
- A QUANTIDADE DE PRODUTOS COMPRADO;
SOLICITE AO USUARIO SE ELE DESEJA REPITIR O PROGRAMA;


 */
public class atividade {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = 0;
        int sn = 0;

        while (a != 1) {

            System.out.println(" Cd 1 - Caneta -   R$ 1");
            System.out.println(" Cd 2 - Borracha - R$ 2");
            System.out.println(" Cd 3 - Regua -    R$ 7");
            System.out.println(" Cd 4 - Apontador -R$ 5");

            float v1 = 0;
            float v2 = 0;
            float v3 = 0;
            float v4 = 0;
            int quant = 0;
            float valor = 0;

            System.out.println("Informe o codigo do produto [1 a 4]: ");
            int codigo = entrada.nextInt();

            if (quant == 0) {
                System.out.println("Informe a quantidade comprada: ");
                quant = entrada.nextInt();

            }

            switch (codigo) {

                case 1:

                    v1 += 1 * quant;
                    System.out.println("Valor total: " + v1);
                    System.out.println("Valor com desconto: " + (v1 - (v1 * 10) / 100));
                    System.out.println("Qauntidade comprada; " + quant);

                    break;
                case 2:
                    v2 += 2 * quant;
                    System.out.println("Valor total: " + v2);
                    System.out.println("Valor com desconto: " + (v2 - (v2 * 10) / 100));
                    System.out.println("Qauntidade comprada; " + quant);

                    break;

                case 3:
                    v3 += 7 * quant;
                    System.out.println("Valor total: " + v3);
                    System.out.println("Valor com desconto: " + (v3 - (v3 * 10) / 100));
                    System.out.println("Qauntidade comprada; " + quant);

                    break;

                case 4:
                    v4 += 5 * quant;
                    System.out.println("Valor total: " + v4);
                    System.out.println("Valor com desconto: " + (v4 - (v4 * 10) / 100));
                    System.out.println("Qauntidade comprada; " + quant);

                    break;
                default:
                    System.out.println("Valor invalido");

            }
            System.out.println("Deseja começar um novo codigo?:[0] para Não, e [1] para Sim: ");
            sn = entrada.nextInt();

            if (sn == 0) {
                a = 1;
            }

        }

    }
}
