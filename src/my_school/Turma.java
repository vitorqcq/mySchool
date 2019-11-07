package my_school;

import java.util.ArrayList;


public class Turma {
   protected String id;
   protected String turno;
   protected String nivel;
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

    public String getNivel() {
        return nivel;
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

    public void setNivel(String nivel) {
        this.nivel = nivel;
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
    
    
     
    
    
           
}
