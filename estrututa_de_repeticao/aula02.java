/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*aplique que solicite ao usuario quantos produtos ele deseja comprar. se o valor final das compras for maios que
1000 reais de a ele um desconto de 10%*/
package estrututa_de_repeticao;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
public class aula02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int quant=0;
        double  valor=0;
        double total=0;
        
        System.out.println("informe a quantidade de compras ");
        quant=entrada.nextInt();
        
        for(int x=1; x<=quant; x++){
            System.out.println("Informe o Valor da "+x+ " compra");
            valor=entrada.nextDouble();
            total+=valor;
        }
        if (total>100){
            total=total-(total*10)/100;
        }
        System.out.println("O total da compra sera de R$: "+total);
}
}
