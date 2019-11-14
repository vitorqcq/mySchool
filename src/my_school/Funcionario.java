package my_school;

import java.util.ArrayList;


public class Funcionario {
   protected String nome;
   protected String id;
   protected String documento;
   protected String dataNascimento;
   protected String Endereco;
   protected String Salario;
   protected String horaInicioServico;
   protected String horaFimServico;
   public String cargo;

    public String getDocumento() {
        return documento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEndereco() {
        return Endereco;
    }

    public String getHoraFimServico() {
        return horaFimServico;
    }

    public String getHoraInicioServico() {
        return horaInicioServico;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public String getSalario() {
        return Salario;
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

    public void setHoraFimServico(String horaFimServico) {
        this.horaFimServico = horaFimServico;
    }

    public void setHoraInicioServico(String horaInicioServico) {
        this.horaInicioServico = horaInicioServico;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(String Salario) {
        this.Salario = Salario;
    }
   
   
}
