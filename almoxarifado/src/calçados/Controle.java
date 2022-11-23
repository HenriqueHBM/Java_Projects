package calçados;

public class Controle {
    public static void main (String[] args){
    Banco banco;
    banco = new Banco();
    banco.nome="Adidas";
    banco.valor =(320);
    banco.quant=(5);
    banco.comprar(2);
    banco.vender(1);
    banco.aumento(340);
    
    }
}
