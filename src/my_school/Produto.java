package my_school;


public class Produto {
    private String id;
    private String nomeProduto;
    private String descricao;
    private String quantidade;

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
}
