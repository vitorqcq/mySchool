package my_school;

import my_school.Estoque;
import my_school.Funcionario;


public class GerenteEstoque extends Funcionario{
    private Estoque estoque = new Estoque();
   
    
    public GerenteEstoque(Estoque estoque){
        this.estoque =  estoque;
        this.cargo = "Gerente Estoque";
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
}
