
package contaBancaria;

//Objeto
public class cliente2 {
     public static void main(String[] args) {
        contaBancaria Maria ;
        Maria = new contaBancaria(); //instância de uma classe
        Maria.cliente= "Maria Lucia de Braga";
        Maria.saldo = (1000);
        Maria.limite=(2000);
        Maria.senha=(765456);
        Maria.numero=(998732946);
        Maria.quant_Parcelas=3;
        Maria.depositar(840);
        Maria.sacar(460);
        Maria.emprestar(200);
    }
}
