/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Aluno
 */
public class estudante {
    public static void main(String[] args) {
        biblioteca Andre;
        
        Andre = new biblioteca();
        Andre.nome = "Andre Ribeiro";
        Andre.Professora= "Dileusa";
        Andre.ISBN = 5420;
        Andre.Titulo = "Harry Poter";
        Andre.Paginas = 223;
        Andre.emprestar(3);
        Andre.devolver(2);
        Andre.comprar(2);
   
                
    }
    
}
