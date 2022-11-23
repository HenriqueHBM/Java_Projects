package almoxarifado;


public class Almoxarifado {
// atributos
    String produto;
    int quant;
    double valor;
    
    
    //metodo
    void comprar (int quantidade){
        this.quant+=quantidade;
        System.out.println("Quantidade atual: "+this.quant);
    }
    
    //metodo
    boolean retirar (int quantidade){   
     if(quantidade<=this.quant){
     this.quant-=quantidade;
     System.out.println("Foi retirado do estoque: "+quantidade);
     System.out.println("Tem no estoque: "+this.quant);
     return true;
     
     }else{
  
     System.out.println("Não temos está quantidade de produtos");
     return false;
     }   
    }
    

    
}
