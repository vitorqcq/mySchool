package my_school;

import my_school.Biblioteca;
import my_school.Funcionario;


public class Bibliotecaria extends Funcionario{
    private Biblioteca biblioteca = new Biblioteca();
    
    
    public Bibliotecaria(Biblioteca biblioteca){
        this.biblioteca = biblioteca;
        this.cargo =  "Bibliotecária";
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    
    public void alugarLivro(){
        //ToDo
    }
    public void devolverLivro(){
        //toDo
    }
    public void aprovarAluguel(){
        //toDo
    }
    public void emitirMulta(){
        
    }
    public void visualizarLivrosAtrasados(){
        //toDo
    }
}
