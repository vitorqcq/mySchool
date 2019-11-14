package my_school;

import java.util.ArrayList;


public class Turma {
   protected String id;
   protected String nome;
   protected String turno;
   protected SalaAula sala = new SalaAula();
   protected ArrayList<Aluno>  alunos = new ArrayList<Aluno>();
  protected  ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public String getId() {
        return id;
    }


    public SalaAula getSala() {
        return sala;
    }

    public String getTurno() {
        return turno;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
 
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public void removeAluno(Aluno aluno){
        alunos.remove(aluno);
    }
    
    
    public void addDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    
    public void removeDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSala(SalaAula sala) {
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    
     
    
    
           
}
