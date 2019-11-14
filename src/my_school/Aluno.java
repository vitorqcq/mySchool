package my_school;


public class Aluno {
   private String nome;
   private String id;
   private String documento;
   private String dataNascimento;
   private String Endereco;
   private String nomeResponsavel;
   private String contatoResponsavel;
   private Turma turma;
   private String estado;

    public String getContatoResponsavel() {
        return contatoResponsavel;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEndereco() {
        return Endereco;
    }

    public String getEstado() {
        return estado;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setContatoResponsavel(String contatoResponsavel) {
        this.contatoResponsavel = contatoResponsavel;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
   
    
   
}
