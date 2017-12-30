package br.oficina.classes;

import java.time.LocalDate;

public class Funcionario extends Pessoas{
	
	private String funcao;
	
	
	public Funcionario(String nome,String funcao, String enderreco, String telefone, String cpf, String rg, LocalDate dataNasc) {
		super(nome, enderreco, telefone, cpf, rg, dataNasc);
		this.funcao = funcao;
	}

	
	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
}
