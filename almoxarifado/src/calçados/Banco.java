package calçados;

public class Banco {
    //atributos
    String nome ;
    float valor ;
    int quant;
    
    //metodos
    
       void comprar (int quantidade){
        this.quant+=quantidade;
        System.out.println("Quantidade atual: "+this.quant);
    }
    
    boolean vender(int quantidade){
        if(quantidade<=this.quant){
        this.quant-=quantidade;
        System.out.println("Foi retirado do estoque: "+quantidade);
        System.out.println("Tem no estoque: "+this.quant);
        return true;
            
            
        }else{
  
     System.out.println("Não temos está quantidade de produtos para venda");
     return false;
     } 
    }
    
    void aumento(int valor){
        this.valor= valor;
        System.out.println("Novo valor do produto: "+this.valor);
        
    }
    
}
