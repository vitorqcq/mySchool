package my_school;


import my_school.Diretor.Diretor;
import java.util.ArrayList;

public class Escola {
    
   // Funcionários
   private Diretor diretor = new Diretor();
   private ArrayList<Professor> professores =  new ArrayList<Professor>();
   private ArrayList<Bibliotecaria> bibliotecarias =  new ArrayList<Bibliotecaria>();
   private ArrayList<GerenteEstoque> gerentesEstoque =  new ArrayList<GerenteEstoque>();
   private ArrayList<Funcionario> funcionarios =  new ArrayList<Funcionario>();
    
   // Alunos
   private ArrayList<Aluno> alunos =  new ArrayList<Aluno>();
    
   // Estruturas
   private ArrayList<SalaAula> salasAula =  new ArrayList<SalaAula>();
   private ArrayList<Turma> turmas =  new ArrayList<Turma>();
   private Estoque estoque = new Estoque();
   private Biblioteca biblioteca =  new Biblioteca();

   
   // GETS
   public ArrayList<Aluno> getAluno() {
        return alunos;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public ArrayList<Bibliotecaria> getBibliotecarias() {
        return bibliotecarias;
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

    public ArrayList<GerenteEstoque> getGerentesEstoque() {
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

    public void setBibliotecarias(ArrayList<Bibliotecaria> bibliotecarias) {
        this.bibliotecarias = bibliotecarias;
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

    public void setGerentesEstoque(ArrayList<GerenteEstoque> gerentesEstoque) {
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

    public void addBibliotecaria(Bibliotecaria bibliotecaria) {
        this.bibliotecarias.add(bibliotecaria);
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

    public void removeBibliotecaria(Bibliotecaria bibliotecaria) {
        this.bibliotecarias.remove(bibliotecaria);
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
}
