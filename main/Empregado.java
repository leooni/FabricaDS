package main;

import java.io.Serializable;

abstract class Empregado implements Serializable {
    //Variável que indica qual o tipo da pessoa (gerente ou funcionário) para facilitar as operações de busca
    protected int tipoPessoa;

    private String matricula;
    private String nome;
    private String sobrenome;
    private String endereco;
    private String telefone;
    private String celular;
    private String dependentes;
    private float salario;
  //  private String cargo;
    private String setor;
    private String equipe;
    private String linguagens;
    
    
  

    Empregado(String matricula, String nome, String sobrenome, String endereco, String telefone, String celular, String dependentes, float salario, String setor, String equipe, String linguagens) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.celular = celular;
        this.dependentes = dependentes;
        this.salario = (float) salario;
        this.setor = setor;
        this.equipe = equipe;
        this.linguagens = linguagens;
        
        
    }

    String getMatricula() {
        return matricula;
    }

    void setMatricula(String matricula) {
        if (matricula == null || matricula.isEmpty()) {
            throw new ValorInvalidoException("Valor inválido");
        } else {
            this.matricula = matricula;
        }
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new ValorInvalidoException("Valor inválido");
        } else {
            this.nome = nome;
        }
    }
    
    String getSobrenome() {
        return sobrenome;
    }

    void setSobrenome(String sobrenome) {
        if (sobrenome == null || sobrenome.isEmpty()) {
            throw new ValorInvalidoException("Valor inválido");
        } else {
            this.sobrenome = sobrenome;
        }
    }
    
    String getEndereco() {
        return this.endereco;
    }

    void setEndereco(String endereco) {
        if (endereco == null || endereco.isEmpty()) {
            throw new ValorInvalidoException("Valor inválido");
        } else {
            this.endereco = endereco;
        }
    }

    String getTelefone() {
        return telefone;
    }

    void setTelefone(String telefone) {
        if (telefone == null || telefone.isEmpty()) {
            throw new ValorInvalidoException("Valor inválido");
        } else {
            this.telefone = telefone;
        }
    }
    
    String getCelular() {
        return celular;
    }

    void setCelular(String celular) {
        if (celular == null || celular.isEmpty()) {
            throw new ValorInvalidoException("Valor inválido");
        } else {
            this.celular = celular;
        }
    }

    String getDependentes() {
        return dependentes;
    }

    void setDependentes(String dependentes) {
    	if (dependentes == null) {
            throw new ValorInvalidoException("Valor inválido");
        } else {
            this.dependentes = dependentes;
        }
    }

    double getSalario() {
        return salario;
    }

    void setSalario(float salario) {
        if (salario < 0) {
            throw new ValorInvalidoException("Valor inválido");
        } else {
            this.salario = salario;
        }
    }

    int getTipoPessoa() {
        return tipoPessoa;
    }
    

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	public String getLinguagens() {
		return linguagens;
	}

	public void setLinguagens(String linguagens) {
		this.linguagens = linguagens;
	}

	public void setSalario(String entradaSalario) {
		// TODO Auto-generated method stub
		
	}
}
