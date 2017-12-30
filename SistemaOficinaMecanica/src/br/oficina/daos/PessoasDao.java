package br.oficina.daos;

import br.oficina.classes.FuncionarioLogavel;
import br.oficina.classes.Pessoas;

public class PessoasDao extends ObjetosDao{
	
	public void salvaPessoa(FuncionarioLogavel funcionarioLogavel) {
		banco.prencheMapFuncionario(funcionarioLogavel);
	}
	
	public void salvaPessoa(Pessoas funcionarioLogavel) {//verificar se havera erro na execu��o pois funcionario logavel tambem extende pessoas
		banco.setPessoas(funcionarioLogavel);
	}
	
	public FuncionarioLogavel buscaUsuarioAutenticavel(String login) {
		return  banco.getFuncionarioLogin(login);

	}
}

//caso precise pode criar um novo m�todo (ou alterar um ja existente) para salvar um funcionario logavel
//que recebe como parametro um usu�rio(interface) ja que funcionario logavel tambem implementa essa interface.