package my_school;

import java.util.ArrayList;


public class Disciplina {

    protected String id;
    protected String nivel;
    protected String livro;
    protected ArrayList<Avaliacao> avaliacoes =  new ArrayList<Avaliacao>();
    protected Horario horario =  new Horario();
    protected Professor professor =  new Professor();

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public String getLivro() {
        return livro;
    }

    public String getId() {
        return id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }
    
    public void addAvaliacao(Avaliacao avaliacao){
        avaliacoes.add(avaliacao);
    }
    
    
    public void removeAvaliacao(Avaliacao avaliacao){
        avaliacoes.remove(avaliacao);
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
    
     
            
    
    
}
