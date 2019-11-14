package my_school;

import java.util.ArrayList;
import my_school.Funcionario;
import my_school.Turma;


public class Professor extends Funcionario{
    protected ArrayList<Turma> turmas =new ArrayList<Turma>();
    
    public Professor(){
        this.cargo = "Professor";
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
    
    public void addTurma(Turma turma){
        turmas.add(turma);
    }
    
    public void removeTurma(Turma turma){
        turmas.remove(turma);
    }
    
    public void enviarNota(){
        //toDo
    }
    public void enviarFrequencia(){
        //toDo
    }
    
    public void enviarDataAvaliacoes(){
        //todo
    }
    
    
}
