package br.oficina.controllers;

import java.time.LocalDate;

import br.oficina.classes.Cliente;
import br.oficina.classes.Funcionario;
import br.oficina.classes.FuncionarioLogavel;
import br.oficina.classes.Pessoas;
import br.oficina.classes.TipoPessoa;
import br.oficina.daos.PessoasDao;
import br.oficina.helpers.DateHelper;
import br.oficina.helpers.ValidadorUsuario;

public class PessoasBuilder {
	private Pessoas pessoa;

	public PessoasBuilder(String nome, String enderreco, String telefone, String cpf, String rg, LocalDate dataNasc,
			TipoPessoa tipo) {
		if (ValidadorUsuario.validaUsuario() && DateHelper.validaDataNasc(dataNasc)) {
			
			this.pessoa = new Cliente(nome, enderreco, telefone, cpf, rg, dataNasc, tipo);
			System.out.println("Criando Builder cliente: " + pessoa.getNome());
		}
	}

	public PessoasBuilder(String nome, String funcao, String enderreco, String telefone, String cpf, String rg,
			LocalDate dataNasc) {
		if (ValidadorUsuario.validaUsuario() && DateHelper.validaDataNasc(dataNasc)) {
			
			this.pessoa = new Funcionario(nome, funcao, enderreco, telefone, cpf, rg, dataNasc);
			
			System.out.println("Criando Builder funcionario: " + pessoa.getNome());
		}
	}
	
	public PessoasBuilder(String nome,String login, String senha, String funcao, String enderreco, String telefone, String cpf, String rg,
			LocalDate dataNasc) {
		if (ValidadorUsuario.validaUsuario() && DateHelper.validaDataNasc(dataNasc)) {
			
			this.pessoa = new FuncionarioLogavel( nome, login, senha, funcao, enderreco, telefone, cpf,  rg, dataNasc);
			System.out.println("Criando funcionario logavel: " + pessoa.getNome());
		}
	}
	
	public Pessoas getPessoa() {
		return this.pessoa;
	}
	
	private void salvaPessoa() {
		if(this.pessoa != null) {
			PessoasDao dao = new PessoasDao();
			dao.salvaPessoa(this.pessoa);
			
		}
		
	}
}

// validar data de nasc
// diferenciar cliente funcionario e funcionario logavel.
// PS para isso pode usar sobrecarga do construtor
// validar usuario