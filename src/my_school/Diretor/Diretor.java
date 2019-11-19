package my_school.Diretor;

import my_school.telasPrincipais.TelaDiretor;
import java.util.ArrayList;
import my_school.Aluno;
import my_school.Disciplina;
import my_school.Escola;
import my_school.Estoque;
import my_school.Funcionario;
import my_school.SalaAula;

public class Diretor extends Funcionario {

   public Escola escolaDirigida;
    Estoque estoque;

    //Telas
    CadastraFuncionarios cadastraFuncionario = new CadastraFuncionarios();
    EditaFuncionarios editarFuncionario = new EditaFuncionarios();
    CadastrarAluno cadastrarAluno = new CadastrarAluno();
    MatriculaAluno matriculaAluno = new MatriculaAluno();
    CadastrarProduto cadastrarProduto = new CadastrarProduto();
    CadastrarLivro cadastraLivro =  new CadastrarLivro();
    criarDisciplina criarDisc = new criarDisciplina();
    CadastrarTurma criarTurma = new CadastrarTurma();
    VizualizaEstoque vizualizaEstoque = new VizualizaEstoque();
    VizualizarLivros visualizarLivros = new VizualizarLivros();
    VizualizarFuncionarios visualizarFuncionarios = new VizualizarFuncionarios();
    VizualizarAlunos visualizarAlunos = new VizualizarAlunos();
    VisualizarDisciplinas visualizarDisciplinas =  new VisualizarDisciplinas();
    VisualizarTurmas visualizarTurmas = new VisualizarTurmas();
    

    public Diretor(Escola escolaDirigida, Estoque estoque, ArrayList<SalaAula> salas, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos) {
        this.setId("d1");
        this.escolaDirigida = escolaDirigida;
        this.estoque = estoque;
        this.escolaDirigida.setSalasAula(salas);
        this.escolaDirigida.setDisciplinas(disciplinas);
        this.escolaDirigida.setAlunos(alunos);
        this.cargo = "Diretor";

    }

    public void cadastrarFuncionario() {
        cadastraFuncionario.funcionarioEscola =  escolaDirigida.getFuncionarios();
        cadastraFuncionario.setVisible(true);
    }
    
    public void cadastraAluno(){
        cadastrarAluno.alunosEscola =  escolaDirigida.getAlunos();
        cadastrarAluno.setVisible(true);
    }
    
    public void matriculaAluno(){
        matriculaAluno.alunosEscola =  escolaDirigida.getAlunos();
        matriculaAluno.turmasEsocla =  escolaDirigida.getTurmas();
        matriculaAluno.setVisible(true);
    }            

    public void editarFuncionario(Funcionario funcionario) {
        editarFuncionario.setVisible(true);
        editarFuncionario.funcionario = funcionario;
        while (cadastraFuncionario.funcionario.getNome() == null) {
        }
        escolaDirigida.removeFuncionarios(funcionario);
        escolaDirigida.addFuncionarios(editarFuncionario.funcionario);
    }

    public void cadastrarProduto() {
        cadastrarProduto.produtosEscola =  escolaDirigida.getEstoque().getProdutos();
        cadastrarProduto.setVisible(true);
    }
    public void cadastrarLivro() {
       cadastraLivro.bibliotecaEscola =  escolaDirigida.getBiblioteca();
       cadastraLivro.setVisible(true);
    }
    public void crirarDisciplinas(){
        criarDisc.professores = (this.escolaDirigida.getProfessores());
        criarDisc.disciplinasEscola = this.escolaDirigida.getDisciplinas();
        criarDisc.setVisible(true);    
    }
    

    public void criarTurmas() {
        criarTurma.turmasEscola = escolaDirigida.getTurmas();
        criarTurma.salas = escolaDirigida.getSalasAula();
        criarTurma.disciplinas = escolaDirigida.getDisciplinas();
        criarTurma.alunos = escolaDirigida.getAlunos();
        criarTurma.setVisible(true);
        
        System.out.println("Nome Turma: " + criarTurma.turma.getNome());
        System.out.println("Turno: " + criarTurma.turma.getTurno());
        System.out.println("Sala: " + criarTurma.turma.getSala());

        for (int i = 0; i < criarTurma.turma.getDisciplinas().size(); i++) {
            System.out.println("disciplina " + i + criarTurma.turma.getDisciplinas().get(i).getNome());
        }

        for (int i = 0; i < criarTurma.turma.getAlunos().size(); i++) {
            System.out.println("aluno " + i + criarTurma.turma.getAlunos().get(i).getNome());
        }

        System.out.println("--------------------------");
    }

    public void vizualizarEstoque() {
        vizualizaEstoque.estoque = escolaDirigida.getEstoque();
        vizualizaEstoque.setVisible(true);
    }

    public void visualizarLivros() {
        visualizarLivros.biblioteca = escolaDirigida.getBiblioteca();
        visualizarLivros.setVisible(true);
    }

    public void visualizarFuncionarios() {
        visualizarFuncionarios.funcionarios = escolaDirigida.getFuncionarios();
        visualizarFuncionarios.setVisible(true);
    }

    public void visualizarAlunos() {
        visualizarAlunos.alunos = escolaDirigida.getAlunos();
        visualizarAlunos.setVisible(true);
    }

   @Override
    public void abreTela() {
        TelaDiretor telaDiretor = new TelaDiretor();
        telaDiretor.escola = escolaDirigida;
        telaDiretor.setVisible(true);
    }
    
    public void visualizarDisciplinas(){
        visualizarDisciplinas.disciplinas =  escolaDirigida.getDisciplinas();
        visualizarDisciplinas.setVisible(true);
    }
    
    public void visualizarTurmas(){
        visualizarTurmas.turmas =  escolaDirigida.getTurmas();
        visualizarTurmas.setVisible(true);
    }
}
