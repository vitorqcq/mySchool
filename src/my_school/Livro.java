package my_school;


public class Livro {
    private String id;
    private String titulo;
    private String estado;
    private String dataEmprestimo;
    private String dataDevolucao;
    private String quantidade;

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
