package my_school;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        System.out.println("AAAAA");
        Escola escola = new Escola();
        System.out.println("AAAAA");
        
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Produto produto4 = new Produto();
        Produto produto5 = new Produto();
        Produto produto6 = new Produto();
        Produto produto7 = new Produto();
        Produto produto8 = new Produto();
        Produto produto9 = new Produto();
        Produto produto10 = new Produto();
        
        System.out.println("AAAAA");

        produto1.setId("p1");
        produto2.setId("p2");
        produto3.setId("p3");
        produto4.setId("p4");
        produto5.setId("p5");
        produto6.setId("p6");
        produto7.setId("p7");
        produto8.setId("p8");
        produto9.setId("p9");
        produto10.setId("p10");

        produto1.setNomeProduto("Vassoura");
        produto2.setNomeProduto("Detergente");
        produto3.setNomeProduto("Pazinha");
        produto4.setNomeProduto("Saco de Lixo");
        produto5.setNomeProduto("Cx. Giz Escolar");
        produto5.setNomeProduto("Lápis");
        produto6.setNomeProduto("Borracha");
        produto7.setNomeProduto("Caneta Azul");
        produto8.setNomeProduto("Caneta Preta");
        produto9.setNomeProduto("Folha A4");
        produto10.setNomeProduto("Grampeador");

        produto1.setDescricao("Produto de Limpeza");
        produto2.setDescricao("Produto de Limpeza");
        produto3.setDescricao("Produto de Limpeza");
        produto4.setDescricao("Produto de Limpeza");
        produto5.setDescricao("Produto para sala de aula / alunos / professores");
        produto6.setDescricao("Produto para sala de aula / alunos / professores");
        produto7.setDescricao("Produto para sala de aula / alunos / professores");
        produto8.setDescricao("Produto para sala de aula / alunos / professores");
        produto9.setDescricao("Produto para sala de aula / alunos / professores");
        produto10.setDescricao("Produto para sala de aula / alunos / professores");

        produto1.setQuantidade("3");
        produto2.setQuantidade("12");
        produto3.setQuantidade("4");
        produto4.setQuantidade("50");
        produto5.setQuantidade("8");
        produto6.setQuantidade("80");
        produto7.setQuantidade("25");
        produto8.setQuantidade("18");
        produto9.setQuantidade("4500");
        produto10.setQuantidade("5");

        escola.getEstoque().addProduto(produto1);
        escola.getEstoque().addProduto(produto2);
        escola.getEstoque().addProduto(produto3);
        escola.getEstoque().addProduto(produto4);
        escola.getEstoque().addProduto(produto5);
        escola.getEstoque().addProduto(produto6);
        escola.getEstoque().addProduto(produto7);
        escola.getEstoque().addProduto(produto8);
        escola.getEstoque().addProduto(produto9);
        escola.getEstoque().addProduto(produto10);

        escola.getGerentesEstoque().setId("GE1");
        escola.getGerentesEstoque().setNome("Sebastião da Silva");
        escola.getGerentesEstoque().setSalario("1600");

        escola.addFuncionarios(escola.getGerentesEstoque());
    

    SalaAula sala1 = new SalaAula();
    SalaAula sala2 = new SalaAula();
    SalaAula sala3 = new SalaAula();
    SalaAula sala4 = new SalaAula();
    SalaAula sala5 = new SalaAula();

    sala1.setCodigoSala (

    "s1");
    sala2.setCodigoSala (

    "s2");
    sala3.setCodigoSala (

    "s3");
    sala4.setCodigoSala (

    "s4");
    sala5.setCodigoSala (

    "s5");

    sala1.setMaxAlunos (

    33);
    sala2.setMaxAlunos (

    34);
    sala3.setMaxAlunos (

    35);
    sala4.setMaxAlunos (

    29);
    sala5.setMaxAlunos (

    45);

    escola.addSalasAula (sala1);

    escola.addSalasAula (sala2);

    escola.addSalasAula (sala3);

    escola.addSalasAula (sala4);

    escola.addSalasAula (sala5);

    Professor professor1 = new Professor();
    Professor professor2 = new Professor();
    Professor professor3 = new Professor();
    Professor professor4 = new Professor();
    Professor professor5 = new Professor();
    Professor professor6 = new Professor();
    Professor professor7 = new Professor();

    
    System.out.println("AAAAA");
    
    professor1.setNome (

    "João Adalberto");
    professor2.setNome (

    "Maria Cristina");
    professor3.setNome (

    "Rosely da Sulva");
    professor4.setNome (

    "Marcelo Cristian");
    professor5.setNome (

    "Mathias da Cruz");
    professor6.setNome (

    "Filipe de Campos");
    professor7.setNome (

    "Rafaela do Nascimento");

    professor1.setId (

    "p1");
    professor2.setId (

    "p2");
    professor3.setId (

    "p3");
    professor4.setId (

    "p4");
    professor5.setId (

    "p5");
    professor6.setId (

    "p6");
    professor7.setId (

    "p7");

    professor1.setSalario (

    "1200");
    professor2.setSalario (

    "1300");
    professor3.setSalario (

    "1400");
    professor4.setSalario (

    "1000");
    professor5.setSalario (

    "1900");
    professor6.setSalario (

    "2000");
    professor7.setSalario (

    "1800");

        //Outras informações não instanciadas por não serem necessárias à Instancia
    escola.addProfessores (professor1);

    escola.addProfessores (professor2);

    escola.addProfessores (professor3);

    escola.addProfessores (professor4);

    escola.addProfessores (professor5);

    escola.addProfessores (professor6);

    escola.addProfessores (professor7);

    escola.addFuncionarios (professor1);

    escola.addFuncionarios (professor2);

    escola.addFuncionarios (professor3);

    escola.addFuncionarios (professor4);

    escola.addFuncionarios (professor5);

    escola.addFuncionarios (professor6);

    escola.addFuncionarios (professor7);


Disciplina disciplina1 = new Disciplina();
        Disciplina disciplina2 = new Disciplina();
        Disciplina disciplina3 = new Disciplina();
        Disciplina disciplina4 = new Disciplina();
        Disciplina disciplina5 = new Disciplina();
        Disciplina disciplina6 = new Disciplina();
        Disciplina disciplina7 = new Disciplina();
        Disciplina disciplina8 = new Disciplina();
        Disciplina disciplina9 = new Disciplina();

        disciplina1.setId("d1");
        disciplina2.setId("d2");
        disciplina3.setId("d3");
        disciplina4.setId("d4");
        disciplina5.setId("d5");
        disciplina6.setId("d6");
        disciplina7.setId("d7");
        disciplina8.setId("d8");
        disciplina9.setId("d9");

        
        System.out.println("AAAAA");
        disciplina1.setNome("História - 1º Ano");
        disciplina2.setNome("História - 2º Ano");
        disciplina3.setNome("História - 3º Ano");
        disciplina4.setNome("Matemática - 1º Ano");
        disciplina5.setNome("Matemática - 2º Ano");
        disciplina6.setNome("Matemática - 3º Ano");
        disciplina7.setNome("Português - 1º Ano");
        disciplina8.setNome("Português - 2º Ano");
        disciplina9.setNome("Português - 3º Ano");

        disciplina1.setNivel("1º Ano");
        disciplina2.setNivel("2º Ano");
        disciplina3.setNivel("3º Ano");
        disciplina4.setNivel("1º Ano");
        disciplina5.setNivel("2º Ano");
        disciplina6.setNivel("3º Ano");
        disciplina7.setNivel("1º Ano");
        disciplina8.setNivel("2º Ano");
        disciplina9.setNivel("3º Ano");

        disciplina1.setLivro("História em Fatos 1");
        disciplina2.setLivro("História em Fatos 2");
        disciplina3.setLivro("História em Fatos 3");
        disciplina4.setLivro("Números em Movimento 1");
        disciplina5.setLivro("Números em Movimento 2");
        disciplina6.setLivro("Números em Movimento 3");
        disciplina7.setLivro("Sopa de Letras 1");
        disciplina8.setLivro("Sopa de Letras 2");
        disciplina9.setLivro("Sopa de Letras 3");

        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);
        disciplinas.add(disciplina4);
        disciplinas.add(disciplina5);
        disciplinas.add(disciplina6);
        disciplinas.add(disciplina7);
        disciplinas.add(disciplina8);
        disciplinas.add(disciplina9);

        //Horarios e etc nao necessarios na instancia
        //Avalaoes das Disciplinas
        Avaliacao av1 = new Avaliacao();
        Avaliacao av2 = new Avaliacao();
        Avaliacao av3 = new Avaliacao();
        Avaliacao av4 = new Avaliacao();

        av1.setData("01/03/2020");
        av2.setData("01/06/2020");
        av3.setData("01/09/2020");
        av4.setData("01/11/2020");

        for (int i = 0; i < disciplinas.size(); i++) {
            disciplinas.get(i).addAvaliacao(av1);
            disciplinas.get(i).addAvaliacao(av2);
            disciplinas.get(i).addAvaliacao(av3);
            disciplinas.get(i).addAvaliacao(av4);
        }

        // Professores das disciplinas        
        disciplinas.get(0).setProfessor(escola.getProfessores().get(0));
        disciplinas.get(1).setProfessor(escola.getProfessores().get(1));
        disciplinas.get(2).setProfessor(escola.getProfessores().get(2));
        disciplinas.get(3).setProfessor(escola.getProfessores().get(3));
        disciplinas.get(4).setProfessor(escola.getProfessores().get(4));
        disciplinas.get(5).setProfessor(escola.getProfessores().get(5));
        disciplinas.get(6).setProfessor(escola.getProfessores().get(6));
        disciplinas.get(7).setProfessor(escola.getProfessores().get(5));
        disciplinas.get(8).setProfessor(escola.getProfessores().get(3));

        escola.setDisciplinas(disciplinas);
    

  
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();
        Turma turma3 = new Turma();

        turma1.setId("t1");
        turma2.setId("t2");
        turma3.setId("t3");

        turma1.setNome("1º Ano - E.M.");
        turma2.setNome("2º Ano - E.M.");
        turma3.setNome("3º Ano - E.M.");

        System.out.println("AAAAA");
        turma1.addDisciplina(escola.getDisciplinas().get(0));
        turma1.addDisciplina(escola.getDisciplinas().get(3));
        turma1.addDisciplina(escola.getDisciplinas().get(6));

        turma2.addDisciplina(escola.getDisciplinas().get(1));
        turma2.addDisciplina(escola.getDisciplinas().get(4));
        turma2.addDisciplina(escola.getDisciplinas().get(7));

        turma3.addDisciplina(escola.getDisciplinas().get(2));
        turma3.addDisciplina(escola.getDisciplinas().get(5));
        turma3.addDisciplina(escola.getDisciplinas().get(8));

        turma1.setSala(escola.getSalasAula().get(0));
        turma2.setSala(escola.getSalasAula().get(1));
        turma3.setSala(escola.getSalasAula().get(2));

        escola.addTurmas(turma1);
        escola.addTurmas(turma2);
        escola.addTurmas(turma3);
    

  

        String[] nomes = {"Agostinho Carreiro",
            "Agostinho Quintella",
            "Aida Mena",
            "Alcides Assumpção",
            "Aline Velázquez",
            "Alzira Moreyra",
            "Anselmo Gaspar",
            "Antão Covelhã",
            "Augusta Caldas",
            "Augusta Mendoça",
            "Bartira Souto",
            "Borrás Alves",
            "Branco Gusmão",
            "Bráulio Ferro",
            "Bukake Cantanhede",
            "Casimiro Monte",
            "Cassandra Ávila",
            "Clementina Furquim",
            "Clóvis Colaço",
            "Célia Souto",
            "César Neto",
            "Damião Lozada",
            "Diodete Cordeiro",
            "Donata Téllez",
            "Dália Tibiriçá",
            "Eduarda Beiriz",
            "Eloi Cantanhede",
            "Emiliano Guedes",
            "Estefânia Ventura",
            "Evaristo Baião",
            "Fabiana Caniça",
            "Fiona Simas",
            "Flamínia Marrero",
            "Gil Loio",
            "Gonçalo Delgado",
            "Greice Fialho",
            "Hugo Neiva",
            "Hélder Lemes",
            "Hélder Novais",
            "Ifigénia Couto",
            "Isilda Villaverde",
            "Jaci Bentes",
            "Jaci Castanheira",
            "Jacir Carvalhoso",
            "Jonas Santarém",
            "Jorge Mena",
            "Josefa Salles",
            "Josefina Paredes",
            "Leopoldo Quirós",
            "Levindo Collaço",
            "Lorena Matos",
            "Lázaro Bautista",
            "Léia Baião",
            "Lúcio Cyrne",
            "Madalena Bessa",
            "Madalena Espírito Santo",
            "Marcelo Valgueiro",
            "Maria Monsanto",
            "Mariano Moreira",
            "Marina Themes",
            "Martinho Martins",
            "Miru Marinho",
            "Moema Veleda",
            "Morgana Bello",
            "Morgana Hipólito",
            "Máxima Malheiro",
            "Máxima Saldaña",
            "Máximo Gouveia",
            "Mécia Quadros",
            "Napoleão Semedo",
            "Nicolas Pereira",
            "Norberto Paredes",
            "Osvaldo Larangeira",
            "Parcidio Piteira",
            "Quintilien Valerio",
            "Quirina Reyes",
            "Raoni Sabala",
            "Raul Raminhos",
            "Rodolfo Pais",
            "Rosa Álvaro",
            "Rosalina Grande",
            "Salvina Porciúncula",
            "Simone Cezar",
            "Teresa Café",
            "Tobias Duarte",
            "Tânia Neiva",
            "Ubiratã Andrade",
            "Udo Pavía",
            "Urbano Ramires",
            "Valdemar Telinhos",
            "Vanda Ramírez",
            "Vanessa Zagallo",
            "Vlademiro Arantes",
            "Xico Moreno",
            "Zacarias Padilha",
            "Zidane Cezimbra",
            "Zoe Capanema",
            "Zuleica Valadares",
            "Zuleide Eanes",
            "Érico Aires"};

        for (int i = 0; i < 75; i++) {
            Aluno aluno = new Aluno();
            aluno.setNome(nomes[i]);
            aluno.setId("a" + i);

            if (i <= 25) {
                aluno.setTurma(escola.getTurmas().get(0));
                escola.getTurmas().get(0).addAluno(aluno);
            }
            if (i > 25 && i <= 50) {
                aluno.setTurma(escola.getTurmas().get(1));
                escola.getTurmas().get(1).addAluno(aluno);
            }

            if (i > 50 && i <= 75) {
                aluno.setTurma(escola.getTurmas().get(2));
                escola.getTurmas().get(2).addAluno(aluno);
            }
            escola.AddALuno(aluno);
        }
    

   
        escola.getDiretor().setNome("Vitor Queiroz de Campos");
        escola.getDiretor().setDataNascimento("09/12/1996");
        escola.getDiretor().setDocumento("145.679.986-90");
        escola.getDiretor().setEndereco("Rua Juiz 09 - Juiz de Dentro");
        escola.getDiretor().setHoraInicioServico("09h");
        escola.getDiretor().setHoraFimServico("18h");
        escola.getDiretor().setSalario("12000");

        escola.addFuncionarios(escola.getDiretor());

    System.out.println("AAAAA");

  
        String[] titulos = {"Cão dos pesadelos",
            "Caçador da liberdade",
            "Ratos dos Grandes",
            "Criadores sem falhas",
            "Cobras e assassinos",
            "Criminosos e defensores",
            "Vitória do crepúsculo",
            "Torre da Praga",
            "Sorrisos no futuro",
            "Chutando os animais",
            "Soldado da insanidade",
            "Piloto da noite",
            "Crianças com asas",
            "Assassinos sem casa",
            "Herdeiros e assassinos",
            "Abutres e assassinos",
            "Sorte sem dever",
            "Vontade do céu",
            "Espreitando no passado",
            "Perdendo minha família",
            "Herói de pedra",
            "Criador de Água",
            "Escravos da minha imaginação",
            "Inimigos sem Vergonha",
            "Descendentes e aranhas",
            "Robôs e Ladrões",
            "Maldição do Solstício",
            "Vingança de arco-íris",
            "Lutando contra o oceano",
            "Abandonando o cemitério",
            "Homem do Grande",
            "Rei do Eterno",
            "Humanos da linha de frente",
            "Cavaleiros com honra",
            "Soldados e pilotos",
            "Gângsteres e oficiais",
            "Besta sem dever",
            "Esperança do Ocidente",
            "Mudando as sombras",
            "Admirando Meu Destino"};

        for (int i = 0; i < 40; i++) {
            Livro livro = new Livro();
            livro.setId("l" + i);
            livro.setTitulo(titulos[i]);
            livro.setEstado("Disponível");
            int rand = (int) (Math.random() * 20) + 0;
            livro.setQuantidade(String.valueOf(rand));
            escola.getBiblioteca().addLivro(livro);
        }

        escola.getBibliotecaria().setId("b1");
        escola.getBibliotecaria().setNome("Rosana Maria Correa");
        escola.getBibliotecaria().setSalario("1300");
        escola.addFuncionarios(escola.getBibliotecaria());

        System.out.println("montou");
        escola.getDiretor().abreTelaDiretor();
System.out.println("AAAAA");
    
    }
    
}
