package my_school;

import java.util.ArrayList;


public class Biblioteca {
   private ArrayList<Livro> livros =  new ArrayList<Livro>();

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
   
  public void addLivro(Livro livro){
      livros.add(livro);
  }
  
  public void removeLivro(Livro livro){
      livros.remove(livro);
  }
    
}
