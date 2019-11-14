package my_school;


import my_school.Diretor.Diretor;
import java.util.ArrayList;

public class Escola {
    // Estruturas
   private ArrayList<SalaAula> salasAula =  new ArrayList<SalaAula>();
   private ArrayList<Turma> turmas =  new ArrayList<Turma>();
   private ArrayList<Disciplina> disciplinas =  new ArrayList<Disciplina>();
   private Estoque estoque = new Estoque();
   private Biblioteca biblioteca =  new Biblioteca();
   
   // Alunos
   private ArrayList<Aluno> alunos =  new ArrayList<Aluno>();
   
   
   // Funcionários
   private ArrayList<Professor> professores =  new ArrayList<Professor>();
   private Bibliotecaria bibliotecaria =  new Bibliotecaria(this.biblioteca);
   private GerenteEstoque gerentesEstoque =  new GerenteEstoque(this.estoque);
  
   
   // Diretor
   private Diretor diretor = new Diretor(this, this.getEstoque(), this.getSalasAula(), this.getDisciplinas(), this.getAlunos());
   
   private ArrayList<Funcionario> funcionarios =  new ArrayList<Funcionario>();
   
   // GETS


    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public Bibliotecaria getBibliotecaria() {
        return bibliotecaria;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public GerenteEstoque getGerentesEstoque() {
        return gerentesEstoque;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public ArrayList<SalaAula> getSalasAula() {
        return salasAula;
    }

    // SETS    
    public void setAluno(ArrayList<Aluno> aluno) {
        this.alunos = aluno;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void setBibliotecarias(Bibliotecaria bibliotecarias) {
        this.bibliotecaria = bibliotecarias;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setGerentesEstoque(GerenteEstoque gerentesEstoque) {
        this.gerentesEstoque = gerentesEstoque;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public void setSalasAula(ArrayList<SalaAula> salasAula) {
        this.salasAula = salasAula;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
   
   // ADDS    
  public void AddALuno(Aluno aluno) {
        this.alunos.add(aluno);
    }


    public void addFuncionarios(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void addProfessores(Professor professor) {
        this.professores.add(professor);
    }

    public void addSalasAula(SalaAula salasAula) {
        this.salasAula.add(salasAula);
    }

    public void addTurmas(Turma turma) {
        this.turmas.add(turma);
    }
    
  // REMOVE    
  public void removeALuno(Aluno aluno) {
        this.alunos.remove(aluno);
    }


    public void removeFuncionarios(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public void removeProfessores(Professor professor) {
        this.professores.remove(professor);
    }

    public void removeSalasAula(SalaAula salasAula) {
        this.salasAula.remove(salasAula);
    }

    public void removeTurmas(Turma turma) {
        this.turmas.remove(turma);
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public void addDisciplina(Disciplina disciplina){
       disciplinas.add(disciplina);
    }
    
    public void removeDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }
    
    
}
