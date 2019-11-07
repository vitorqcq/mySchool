
package my_school;

/**
 *
 * @author vitor
 */
public class My_School {
    
    public static void main(String[] args) {
        Escola escolaTeste =  new Escola();
        Funcionario funcionarioTeste = new Funcionario();
        
       /* funcionarioTeste.setNome("Vitor");
        funcionarioTeste.setDataNascimento("09/12/1996");
        funcionarioTeste.setDocumento("130.496.186-98");
        funcionarioTeste.setEndereco("Jose Libaneo 917");
        funcionarioTeste.setHoraFimServico("21h");
        funcionarioTeste.setHoraInicioServico("18h");
        funcionarioTeste.setId("1");
        funcionarioTeste.setSalario("5200");*/
        
        
        
       
       
        Estoque est = new Estoque();
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();
  
        
        
        p1.setDescricao("ffskjdnfjsjdnfksndf");
        p2.setDescricao("sjdnfpasdhfpasdf");
        p3.setDescricao("DESCRIÇÃOO");
        
        p1.setId("P1");
        p2.setId("P2");
        p3.setId("P3");
        
        p1.setNomeProduto("PRODUTO 1");
        p2.setNomeProduto("PRODUTO 2");
        p3.setNomeProduto("PRODUTO 3");
        
        p1.setQuantidade("10");
        p2.setQuantidade("25");
        p3.setQuantidade("3579");
        
        est.addProduto(p1);
        est.addProduto(p2);
        est.addProduto(p3);
        
        escolaTeste.setEstoque(est);
        
        escolaTeste.getDiretor().setEscola(escolaTeste);
        escolaTeste.getDiretor().cadastrarProduto();
        escolaTeste.getDiretor().vizualizarEstoque();
        
        
             
    }
    
}
