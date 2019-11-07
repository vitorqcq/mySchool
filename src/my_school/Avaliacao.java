package my_school;


public class Avaliacao {
    protected String data;
    protected float notaMax = 100;
    protected float notaAluno;

    public float getNotaAluno() {
        return notaAluno;
    }

    public String getData() {
        return data;
    }

    public float getNotaMax() {
        return notaMax;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNotaAluno(float notaAluno) {
        this.notaAluno = notaAluno;
    }

    public void setNotaMax(float notaMax) {
        this.notaMax = notaMax;
    }
    
    
    
    
}
