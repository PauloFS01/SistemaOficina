package br.oficina.classes;

import java.time.LocalDate;


public class FuncionarioLogavel extends Funcionario implements Usuario{

	private String login;
	private String senha;
	
	public FuncionarioLogavel(String nome,String login, String senha, String funcao, String enderreco, String telefone, String cpf, String rg,
			LocalDate dataNasc) {
		super(nome, funcao, enderreco, telefone, cpf, rg, dataNasc);
		this.login = login;
		this.senha = senha;

	}
	
	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String getLogin() {
		return this.login;
	}

	@Override
	public String getSenha() {
		return this.senha;
	}
}

//esta autentificação será util para atidades como abrir e fechar OS, cadastrar pessoas maquinarios e procedimentos.
/*
	@Override
	public void autenticaUsuario(AutenticacaoUsuarios autenticador) {
		autenticador.identifica(this);
		
	}
 */