
package biblioteca;

/**
 *
 * @author Aluno
 */
public class biblioteca {

    int qn_livros = 10;
    String Titulo, nome, Professora;
    int ISBN, Paginas;
    

    //emprestar
    boolean emprestar(double livro) {
        if (livro <= this.qn_livros) {
            System.out.println("Pode pegar a quantidade desejada");
            this.qn_livros += -livro;
            return true;
        } else {
            System.out.println("Não possui livros suficientes");
            return false;
        }

    }
    //devolver
    boolean devolver (double livro){
    int total =0;
    this.qn_livros+=livro;
  
    total+=10-this.qn_livros;
    
    if(qn_livros<=10 && livro >0){
        System.out.println("Quantidade devolvida aceita, aida falta devolver: "+total+" livro(s)");
        return true;
    }else{
        System.out.println("Qunatidade acima para entregar");
    
        return false;
    }
    
    
    }
    void comprar(double livro){
        
        this.qn_livros+=livro;
        System.out.println("Qunatidade no estoque aumentou para: "+qn_livros);

  
    }

}