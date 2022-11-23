/*
Em uma eleição, existem 3 candidatos.
Os votos são informados por mei de codigo
receba o codigo de cada candidato e informe:
total de votos validos,
total de votos de cada candidato
votos nulos
e candidato vencedor
*/
package estrututa_de_repeticao;
import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args){
         Scanner entrada = new Scanner (System.in);
          int valor=0;
          int boso=0;
          int lula =0;
          int moro =0;
          int nulo=0; 
          int validos=0;
          int x;
          int y;
           System.out.println("Quantos eleitores estão para votar?");
           y=entrada.nextInt();
          for(x=0; x<y;x++){
        System.out.println("Vote no seu candidato: Boso=17, Lula=13, Moro=23 ou nulo[0]");
         valor=entrada.nextInt();
         if(valor==17){
             boso+=+1;
             validos+=+1;
         }
         if(valor==13){
             lula+=+1;
              validos+=+1;
         }
         if(valor==23){
             moro+=+1;
              validos+=+1;
         }
         if(valor==0){
             nulo+=+1;
              
         }
          }
         if(boso>lula && boso>moro && boso>nulo){
             System.out.println("o candidato ganhador foi Bolsonaro com: "+boso+" votos");
         }
         
         if(lula>boso && lula>moro && lula>nulo){
             System.out.println("o candidato ganhador foi Lula com: "+lula+" votos");
         }
         if(moro>lula && boso<moro && lula>nulo){
             System.out.println("o candidato ganhador foi Moro com: "+moro+" votos");
         }

            System.out.println("Numero de votos validos foram: "+validos);
             System.out.println("O numero de votos nulos foi de: "+nulo);
         
         
    }
        
    }

