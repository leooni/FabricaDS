package main;

import javax.swing.*;

class Controller {

    //Método que cadastra um empregado e salva na lista
    static void cadastrar(int tipoPessoa) {
    	
    	//String [] cargos = {"Gerente", "Supervisor", "Dev. Pleno", "Dev. Jr"};
    	String[] setores = {"IoT", "Big Data", "DevOps"};
    	String [] equipes = {"Front-End", "Back-End"};
    	String[] linguagens = {"Python", "Java", "Go", "PHP", ".NET"};
    	
    	String entradaMatricula = null;
        String entradaNome = null;
        String entradaSobrenome = null;

        String entradaEndereco = null;
        String entradaTelefone = null;
        String entradaCelular = null;
        String entradaDependentes = null;
        String entradaSalario = null;
        String entradaSetor = null;
        String entradaEquipe = null;
        String entradaLinguagem = null;
         
            
        switch (tipoPessoa) {
        case 1:
        	entradaMatricula = JOptionPane.showInputDialog(null, "Matricula: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaNome = JOptionPane.showInputDialog(null, "Nome: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaSobrenome = JOptionPane.showInputDialog(null, "Sobrenome: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaEndereco = JOptionPane.showInputDialog(null, "Endereço: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaTelefone = JOptionPane.showInputDialog(null, "Telefone: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaCelular = JOptionPane.showInputDialog(null, "Celular: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaDependentes = JOptionPane.showInputDialog(null, "Dependentes: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaSalario = JOptionPane.showInputDialog(null, "Salário: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            break;
            
        case 2:
        	entradaMatricula = JOptionPane.showInputDialog(null, "Matricula: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaNome = JOptionPane.showInputDialog(null, "Nome: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaSobrenome = JOptionPane.showInputDialog(null, "Sobrenome: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaEndereco = JOptionPane.showInputDialog(null, "Endereço: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaTelefone = JOptionPane.showInputDialog(null, "Telefone: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaCelular = JOptionPane.showInputDialog(null, "Celular: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaDependentes = JOptionPane.showInputDialog(null, "Dependentes: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaSalario = JOptionPane.showInputDialog(null, "Salário: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaSetor = (String) JOptionPane.showInputDialog(null, "Escolha o setor", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE,null, setores, setores[0]);
            entradaEquipe = (String) JOptionPane.showInputDialog(null, "Escolha a equipe", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE,null, equipes, equipes[0]);
            break;
            
        case 3:
        	entradaMatricula = JOptionPane.showInputDialog(null, "Matricula: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaNome = JOptionPane.showInputDialog(null, "Nome: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaSobrenome = JOptionPane.showInputDialog(null, "Sobrenome: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaEndereco = JOptionPane.showInputDialog(null, "Endereço: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaTelefone = JOptionPane.showInputDialog(null, "Telefone: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaCelular = JOptionPane.showInputDialog(null, "Celular: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaDependentes = JOptionPane.showInputDialog(null, "Dependentes: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaSalario = JOptionPane.showInputDialog(null, "Salário: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaSetor = (String) JOptionPane.showInputDialog(null, "Escolha o setor", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE,null, setores, setores[0]);
            entradaEquipe = (String) JOptionPane.showInputDialog(null, "Escolha a equipe", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE,null, equipes, equipes[0]);
            entradaLinguagem = (String) JOptionPane.showInputDialog(null, "Escolha a linguagem", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE,null, linguagens, linguagens[0]);
            break;
            
            
        case 4:
        	entradaMatricula = JOptionPane.showInputDialog(null, "Matricula: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaNome = JOptionPane.showInputDialog(null, "Nome: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaSobrenome = JOptionPane.showInputDialog(null, "Sobrenome: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);

            entradaEndereco = JOptionPane.showInputDialog(null, "Endereço: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaTelefone = JOptionPane.showInputDialog(null, "Telefone: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaCelular = JOptionPane.showInputDialog(null, "Celular: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaDependentes = JOptionPane.showInputDialog(null, "Dependentes: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaSalario = JOptionPane.showInputDialog(null, "Salário: ", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE);
            entradaSetor = (String) JOptionPane.showInputDialog(null, "Escolha o setor", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE,null, setores, setores[0]);
            entradaEquipe = (String) JOptionPane.showInputDialog(null, "Escolha a equipe", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE,null, equipes, equipes[0]);
            entradaLinguagem = (String) JOptionPane.showInputDialog(null, "Escolha a linguagem", "Cadastrar empregado", JOptionPane.QUESTION_MESSAGE,null, linguagens, linguagens[0]);
        	break;
            
        }
        
         
        boolean valorInvalido = false;

        try {
            if (tipoPessoa == 1) { //Gerente
                Gerente g = Gerente.instanciarGerente(entradaMatricula, entradaNome, entradaSobrenome, entradaEndereco,  entradaTelefone, entradaCelular, entradaDependentes, (float) Double.parseDouble(entradaSalario));
                EntradaSaidaDados.listaEmpregados.add(g);
                
            } else if (tipoPessoa == 2) { // Supervisor
               
            	Supervisor s = Supervisor.instanciarGerente(entradaMatricula, entradaNome, entradaSobrenome, entradaEndereco,  entradaTelefone, entradaCelular, entradaDependentes, (float) Double.parseDouble(entradaSalario), entradaSetor, entradaEquipe);
                EntradaSaidaDados.listaEmpregados.add(s);
             
            }
            
            else if (tipoPessoa == 3) { // Dev. Pleno
                
            	DevPl d = DevPl.instanciarGerente(entradaMatricula, entradaNome, entradaSobrenome, entradaEndereco,  entradaTelefone, entradaCelular, entradaDependentes, (float) Double.parseDouble(entradaSalario), entradaSetor, entradaEquipe, entradaLinguagem);
                EntradaSaidaDados.listaEmpregados.add(d);
             
            }
            
            else if (tipoPessoa == 4) { // Dev. Jr
                
            	DevJr r = DevJr.instanciarGerente(entradaMatricula, entradaNome, entradaSobrenome, entradaEndereco,  entradaTelefone, entradaCelular, entradaDependentes, (float) Double.parseDouble(entradaSalario), entradaSetor, entradaEquipe, entradaLinguagem);
                EntradaSaidaDados.listaEmpregados.add(r);
             
            }
        } catch (ValorInvalidoException e1) {
            valorInvalido = true;
        } catch (NumberFormatException e2) {
            valorInvalido = true;
        }

        if (valorInvalido) {
            JOptionPane.showMessageDialog(null, "Erro! Alguns dos dados inseridos foram inválidos");
        }
    }

    //Método que deleta um empregado da lista se a matricula estiver cadastrado no sistema
    static void deletar() {

        if (EntradaSaidaDados.listaEmpregados.size() > 0) {

            String entradaMatricula = JOptionPane.showInputDialog(null, "Digite a Matricula do empregado:", "Deletar empregado", JOptionPane.QUESTION_MESSAGE);

            boolean pessoaDeletada = false;

            for (int i = 0; i < EntradaSaidaDados.listaEmpregados.size(); i++) {
                if (entradaMatricula.equals(EntradaSaidaDados.listaEmpregados.get(i).getMatricula())) {
                    EntradaSaidaDados.listaEmpregados.remove(i);
                    pessoaDeletada = true;
                    break;
                }
            }
            if (pessoaDeletada) {
                JOptionPane.showMessageDialog(null, "Empregado deletado");
            } else if (pessoaDeletada == false) {
                JOptionPane.showMessageDialog(null, "Matricula não encontrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há empregados cadastrado no sistema");
        }
    }

    //Método que deleta todos os empregados
    static void deletarTodos() {

        if (EntradaSaidaDados.listaEmpregados.size() > 0) {

            int confirmacao = JOptionPane.showConfirmDialog(null, "Deletar todos os empregados?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (confirmacao == 0) {

                EntradaSaidaDados.listaEmpregados.clear();
                JOptionPane.showMessageDialog(null, "Todos os empregados foram deletados");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há empregados cadastrado no sistema");
        }
    }

    //Método que altera um empregado da lista
    static void alterar() {

        if (EntradaSaidaDados.listaEmpregados.size() > 0) {

            String entradaMatricula = JOptionPane.showInputDialog(null, "Digite a Matricula do empregado:", "Alterar empregado", JOptionPane.QUESTION_MESSAGE);

            boolean pessoaAlterada = false;
            boolean valorInvalido = false;

            for (int i = 0; i < EntradaSaidaDados.listaEmpregados.size(); i++) {
                if (entradaMatricula.equals(EntradaSaidaDados.listaEmpregados.get(i).getMatricula())) {

                    String entradaNome, entradaTelefone, entradaEndereco, entradaSobrenome, entradaCelular, entradaDependentes, entradaSetor, entradaEquipe, entradaLinguagem;
					String entradaSalario;
					String[] setores={"IoT", "Big Data", "DevOps"};String[] equipes={"Front-End", "Back-End"};
					String[] linguagens = {"Python", "Java", "Go", "PHP", ".NET"};
					String[] cargos={"Gerente", "Supervisor", "Dev. Pleno", "Dev. Jr"};

                    Empregado p = EntradaSaidaDados.listaEmpregados.get(i);

                    
                	 entradaMatricula = JOptionPane.showInputDialog(null, "Matricula: ", p.getMatricula());
                     entradaNome = JOptionPane.showInputDialog(null, "Nome: ", p.getNome());
                     entradaSobrenome = JOptionPane.showInputDialog(null, "Sobrenome: ", p.getSobrenome());
                     entradaEndereco = JOptionPane.showInputDialog(null, "Endereço: ", p.getEndereco());
                     entradaTelefone = JOptionPane.showInputDialog(null, "Telefone: ", p.getTelefone());
                     entradaCelular = JOptionPane.showInputDialog(null, "Celular: ", p.getCelular());
                     entradaDependentes = JOptionPane.showInputDialog(null, "Dependentes: ", p.getDependentes());
                     entradaSalario = JOptionPane.showInputDialog(null, "Salário: ", p.getSalario());
                     entradaSetor = (String) JOptionPane.showInputDialog("Escolha o setor", p.getSetor());
                     entradaEquipe = (String) JOptionPane.showInputDialog("Escolha a equipe", p.getEquipe());
                     entradaLinguagem = (String) JOptionPane.showInputDialog(null, "Escolha a linguagem", p.getLinguagens());

                    try {
                    	
                    	p.setMatricula(entradaMatricula);
                    	p.setNome(entradaNome);
                    	p.setSobrenome(entradaSobrenome);
                    	p.setEndereco(entradaEndereco);
                    	p.setCelular(entradaCelular);
                    	p.setDependentes(entradaDependentes);
                    	p.setSalario(entradaSalario);
                    	p.setSetor(entradaSetor);
                    	p.setEquipe(entradaEquipe);
                    	p.setLinguagens(entradaLinguagem);

                        }

                     catch (ValorInvalidoException e1) {
                        valorInvalido = true;
                    } catch (NumberFormatException e2) {
                        valorInvalido = true;
                    }

                    pessoaAlterada = true;

                    break;
                }
            }

            if (valorInvalido) {
                JOptionPane.showMessageDialog(null, "Erro! Alguns dos dados inseridos foram inválidos");
            } else if (pessoaAlterada) {
                JOptionPane.showMessageDialog(null, "Empregado alterada com sucesso");
            } else if (pessoaAlterada == false) {
                JOptionPane.showMessageDialog(null, "Matrícula não encontrado");
            
        } else {
            JOptionPane.showMessageDialog(null, "Não há empregados cadastrados no sistema");
            }
            
        }
        
        }
           

            

    //Método que imprime os dados de um empregado se a matricula dele estiver cadastrado no sistema
    static void consultar() {

        if (EntradaSaidaDados.listaEmpregados.size() > 0) {

            String entradaMatricula = JOptionPane.showInputDialog(null, "Digite a Matricula do empregado:", "Alterar empregado", JOptionPane.QUESTION_MESSAGE);

            for (int i = 0; i < EntradaSaidaDados.listaEmpregados.size(); i++) {
                if (entradaMatricula.equals(EntradaSaidaDados.listaEmpregados.get(i).getMatricula()) == true) {
                    JOptionPane.showMessageDialog(null, getDados(EntradaSaidaDados.listaEmpregados.get(i)));
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há empregados cadastrados no sistema");
        }
    }

    //Método que lista todas os empregados cadastrados no sistema
    static void listar() {

        if (EntradaSaidaDados.listaEmpregados.size() > 0) {

            String dados = "";

            for (int i = 0; i < EntradaSaidaDados.listaEmpregados.size(); i++) {
                dados += getDados(EntradaSaidaDados.listaEmpregados.get(i));
            }

            JOptionPane.showMessageDialog(null, dados, "Listar empregados", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Não há empregados cadastrados no sistema");
        }    }
    
    //Listar somente os Devs

	static void listarDev()) {

        if (EntradaSaidaDados.listaEmpregados.size() > 0) {

            int[] pessoaDev = {1, 2};

            for (int i = 0; i < EntradaSaidaDados.listaEmpregados.size(); i++) {
                if (pessoaDev.equals(EntradaSaidaDados.listaEmpregados.get(1).getTipoPessoa()) == true) {
                    JOptionPane.showMessageDialog(null, getDados(EntradaSaidaDados.listaEmpregados.get(i)));
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há empregados cadastrados no sistema");
        }
    }


    // Dar aumento para funcionário
    
    static void aumentarSalario() {

        if (EntradaSaidaDados.listaEmpregados.size() > 0) {

            String entradaMatricula = JOptionPane.showInputDialog(null, "Digite a Matricula do empregado:", "Aumento salárial", JOptionPane.QUESTION_MESSAGE);

            boolean pessoaAlterada = false;
            boolean valorInvalido = false;

            for (int i = 0; i < EntradaSaidaDados.listaEmpregados.size(); i++) {
                if (entradaMatricula.equals(EntradaSaidaDados.listaEmpregados.get(i).getMatricula())) {

                    String  entradaSalario;
                  
                    Empregado p = EntradaSaidaDados.listaEmpregados.get(i);

                    
                     entradaSalario = JOptionPane.showInputDialog(null, "Digite o novo Salario: ", p.getSalario());


                    try {
                    	
                    	p.setMatricula(entradaMatricula);

                    	p.setSalario(entradaSalario);

                        }

                     catch (ValorInvalidoException e1) {
                        valorInvalido = true;
                    } catch (NumberFormatException e2) {
                        valorInvalido = true;
                    }

                    pessoaAlterada = true;

                    break;
                }
            }
        }
        
            }
    
    //Método que retorna uma String com os dados de um empregado
    private static String getDados(Empregado e) {

        String dados = "Matricula: " + e.getMatricula() + "\nNome: " + e.getNome() + e.getSobrenome()  + "\nEndereço: " + e.getEndereco() + "\nTelefone: " + e.getTelefone() + "\nCelular: " + e.getCelular() + "\nDependentes: " + e.getDependentes() + "\nSalário R$ " + e.getSalario();
        
    

        switch (e.getTipoPessoa()) {
        case 1:
        	dados += "\nCargo: Gerente";
        	
        case 2:
        	dados += "\nCargo: Supervisor" + "\nEquipe:" + e.getEquipe() + "\nSetor:" + e.getSetor();
        	
        case 3:
        	dados += "\nCargo: Dev. Pleno" + "\nEquipe:" + e.getEquipe() + "\nSetor:" + e.getSetor() + "\nLinguagens" + e.getLinguagens();
        	
        case 4:
        	dados += "\nCargo: Dev. Jr." + "\nEquipe:" + e.getEquipe() + "\nSetor:" + e.getSetor() + "\nLinguagens" + e.getLinguagens();
        	
        }

        return dados;
    }
}
