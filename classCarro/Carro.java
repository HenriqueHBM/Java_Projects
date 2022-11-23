
package classCarro;


public class Carro {
    //atributos
    String nome,modelo;
    int ano;
    int velocidade_inicial, velocidade_maxima=470;
    
    
    
    void liga(){
        System.out.println("Carro ligado");
    }
    boolean acelerar(int velo){
        if(velo<= 110){
        System.out.println("Oooopotência");
        
        return true;
        }else{
            System.out.println("Acima da velocidade, a policia vem ai!!!");
            return false;
        }
    }
    
}
