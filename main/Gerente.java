package main;

import java.io.Serializable;

class Gerente extends Empregado implements Serializable {

	private Gerente(String matricula, String nome, String sobrenome, String endereco, String telefone, String celular, String dependentes, float salario, String setor, String equipe, String linguagens) {
        super (matricula, nome, sobrenome, endereco, telefone, celular, dependentes, salario, setor, equipe, linguagens);
        tipoPessoa = 1;
    }

    //Método estático que retorna uma instância de funcionário caso todos os dados inseridos sejam válidos
    static Gerente instanciarGerente(String matricula, String nome, String sobrenome, String endereco, String telefone, String celular, String dependentes, float salario) {
        if (matricula == null || matricula.isEmpty() || nome == null || nome.isEmpty() || telefone == null || telefone.isEmpty() || endereco == null || endereco.isEmpty()) {
            throw new ValorInvalidoException("Valor inválido");
        } else return new Gerente(matricula, nome, sobrenome, endereco, telefone, celular, dependentes, salario, dependentes, dependentes, dependentes);
    
    }
}
	