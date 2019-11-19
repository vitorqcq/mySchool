package my_school;

import java.util.ArrayList;
import my_school.Diretor.CadastrarProduto;
import my_school.telasPrincipais.TelaDiretor;



public class My_School {
    
    public static void main(String[] args) {
        Instancia inst =  new Instancia();
        inst.montaTudo();
        Login login = new Login();
        login.escola = inst.escola;
        login.setVisible(true);
    }
    
    
    
}
    