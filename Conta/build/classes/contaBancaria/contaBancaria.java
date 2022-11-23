package contaBancaria;
//classe

public class contaBancaria {

    int numero;
    double senha;
    String cliente;
    double saldo, limite;
    int quant_Parcelas;

    //Metodo
    void depositar(double quantidade) {
        this.saldo += quantidade;
        System.out.println("depósito: " + quantidade);
        this.saldo += this.limite;
        System.out.println("limite + saldo = " + this.saldo);

    }
    //metodo

    boolean sacar(double quantidade) {
        if (quantidade < this.saldo) {
            this.saldo = this.saldo - quantidade;
            System.out.println("Qunatidade sacada: " + quantidade);
            System.out.println("Saldo atual: " + this.saldo);
            return true;

        } else {
            System.out.println("Não tem saldo suficiente");
            return false;
        }

    }
    //Metodo
    void emprestar(double quantidade) {
      double total =0; 
      total =quantidade+(quantidade*5)/100;  //315
      total=total/this.quant_Parcelas;   //105
      
      this.saldo+=quantidade;
      
      System.out.println("Valor emprestado: "+quantidade);
      System.out.println("Valor da parcelas: "+total);
      System.out.println("Saldo com o  emprestimo: "+this.saldo);
      
    }

}
