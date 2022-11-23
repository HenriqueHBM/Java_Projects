
package almoxarifado;


public class produto {
    public static void main (String[] args){
    Almoxarifado caderno;
    caderno = new Almoxarifado();
    caderno.produto="Caderno";
    caderno.quant=200;
    caderno.comprar(200);
    caderno.retirar(150);
    }
}
