package my_school;

import java.util.ArrayList;


public class Estoque {
ArrayList<Produto> produtos =  new ArrayList<Produto>();    

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
    public void addProduto(Produto produto){
     this.produtos.add(produto);
    }
    
    public void removeProduto(Produto produto){
     this.produtos.remove(produto);
    }
}
