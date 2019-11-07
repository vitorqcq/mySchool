package my_school.Diretor;


import my_school.Escola;
import my_school.Estoque;
import my_school.Funcionario;


public class Diretor extends Funcionario {

    Escola escolaDirigida;
    Estoque estoque;
    
    //Telas
    CadastraFuncionarios cadastraFuncionario =  new CadastraFuncionarios();
    EditaFuncionarios  editarFuncionario = new EditaFuncionarios();
    VizualizaEstoque vizualizaEstoque = new VizualizaEstoque();
    CadastrarProduto cadastrarProduto =  new CadastrarProduto();
    

   public void setEscola(Escola escola) {
        escolaDirigida = escola;
        estoque =  escola.getEstoque();
    }
    
    public void cadastrarFuncionario(){
        cadastraFuncionario.setVisible(true);
        while(cadastraFuncionario.funcionario.getNome() == null){
            System.out.println("While");
        }
        
        cadastraFuncionario.funcionario.setId("f"+ String.valueOf(escolaDirigida.getFuncionarios().size()+1));
        escolaDirigida.addFuncionarios(cadastraFuncionario.funcionario);
    }
    
    public void editarFuncionario(Funcionario funcionario){
        editarFuncionario.setVisible(true);
        editarFuncionario.funcionario =  funcionario;
        while(cadastraFuncionario.funcionario.getNome() == null){
        }
        escolaDirigida.removeFuncionarios(funcionario);
        escolaDirigida.addFuncionarios(editarFuncionario.funcionario);        
    }
    
    public void vizualizarEstoque(){
        vizualizaEstoque.estoque =  escolaDirigida.getEstoque();
        vizualizaEstoque.setVisible(true);
    }
    
        public void cadastrarProduto(){

        cadastrarProduto.setVisible(true);

        while(cadastrarProduto.produto.getDescricao() == null){
            System.out.println("While");
        }
        cadastrarProduto.produto.setId("p"+ String.valueOf(escolaDirigida.getEstoque().getProdutos().size()+1));
        escolaDirigida.getEstoque().addProduto(cadastrarProduto.produto);
    }
}
