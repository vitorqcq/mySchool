package my_school;

import java.util.ArrayList;


public class Disciplina {

    protected String id;
    protected String nome;
    protected String nivel;
    protected String livro;
    protected ArrayList<Avaliacao> avaliacoes =  new ArrayList<Avaliacao>();
    protected Professor professor =  new Professor();
    protected String horarioInicio;
    protected String horarioTermino;
    
    public String getHorarioInicio() {
        return horarioInicio;
    }

    public String getHorarioTermino() {
        return horarioTermino;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public void setHorarioTermino(String horarioTermino) {
        this.horarioTermino = horarioTermino;
    }

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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    
    
     
            
    
    
}
