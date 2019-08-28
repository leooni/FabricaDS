package main;

import java.io.Serializable;

public class Supervisor extends Empregado implements Serializable {
	
	
	private Supervisor(String matricula, String nome, String sobrenome, String endereco, String telefone, String celular, String dependentes, float salario, String setor, String equipe) {
        super (matricula, nome, sobrenome, endereco, telefone, celular, dependentes, salario, setor, equipe, equipe);
        tipoPessoa = 2;
    }

    //Método estático que retorna uma instância de funcionário caso todos os dados inseridos sejam válidos
    static Supervisor instanciarGerente(String matricula, String nome, String sobrenome, String endereco, String telefone, String celular, String dependentes, float salario, String setor, String equipe) {
        if (matricula == null || matricula.isEmpty() || nome == null || nome.isEmpty() || telefone == null || telefone.isEmpty() || endereco == null || endereco.isEmpty()) {
            throw new ValorInvalidoException("Valor inválido");
        } else return new Supervisor (matricula, nome, sobrenome, endereco, telefone, celular, dependentes, salario, setor, equipe);
    }
    
     
    
	
}
