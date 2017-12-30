package br.oficina.classes;

import java.time.LocalDate;

public class Cliente extends Pessoas{

	private TipoPessoa tipo;
	
	
	public Cliente(String nome, String enderreco, String telefone, String cpf, String rg, LocalDate dataNasc,TipoPessoa tipo) {
		super(nome, enderreco, telefone, cpf, rg, dataNasc);
		this.tipo = tipo;
		
	}
	
	public TipoPessoa getTipo() {
		return tipo;
	}

	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}

}
