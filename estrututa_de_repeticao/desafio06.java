package estrututa_de_repeticao;

import java.util.Scanner;

public class desafio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 0;
        double valor = 0;
        int ruim = 0;
        int bom = 0;
        int otimo = 0;
        int exelente = 0;
        int quant = 0;
        int quantidade = 0;
        double filme;
        System.out.println("Informe o nome do filme do ano: ");
        filme = entrada.nextDouble();

        System.out.println("Informe a a quantidade de pessoas que asssitiram o filme do ano");
        quantidade = entrada.nextInt();

        while (i < quantidade) {
            System.out.println("Responda a pesquisa com: ");
            System.out.println("1= Ruim");
            System.out.println("2=Bom");
            System.out.println("3=Otimo");
            System.out.println("4=Exelente");

            valor = entrada.nextDouble();
            if (valor == 1) {
                ruim++;
            }
            if (valor == 2) {
                bom++;
            }
            if (valor == 3) {
                otimo++;
            }
            if (valor == 4) {
                exelente++;
            }
            i++;

        }
        System.out.println("O Filme do ano foi: " + filme);
        System.out.println("Quantidade de pessoas que assistiram o filme: " + quantidade);
        System.out.println("Resultado da pesquisa foi: ruim= " + ruim + " bom= " + bom + " otimo= " + otimo + " exelente= " + exelente);
    }
}
