
package contaBancaria;


public class cliente {
    public static void main(String[] args) {
        contaBancaria Jose ;
        Jose = new contaBancaria();
        Jose.cliente= "Jose da Silva";
        Jose.saldo = (1000);
        Jose.limite=(2000);
        Jose.senha=(23456);
        Jose.numero=(5678);
        Jose.quant_Parcelas=3;
        Jose.depositar(100);
        Jose.sacar(550);
        Jose.emprestar(300);
        

    }
}
