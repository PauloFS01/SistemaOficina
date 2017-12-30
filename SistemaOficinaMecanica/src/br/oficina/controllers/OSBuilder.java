package br.oficina.controllers;

import java.time.LocalDate;

import br.oficina.classes.Funcionario;

import br.oficina.classes.Maquinario;
import br.oficina.classes.OrdemDeServico;
import br.oficina.daos.OrdemDeServicoDao;
import br.oficina.helpers.DateHelper;
import br.oficina.helpers.ValidadorUsuario;

public class OSBuilder {

	private OrdemDeServico os;

	public OSBuilder(Funcionario funcionario, Maquinario maquinario, LocalDate data, String descricao) {
		
		if (DateHelper.validaData(data) && ValidadorUsuario.validaUsuario()) {
			this.os = new OrdemDeServico(funcionario, maquinario, data, descricao);
			
			System.out.println("Construindo Builder os ");
			//System.out.println("retorn data" + DateHelper.validaData(data));
			//System.out.println("retorn usuario" + ValidadorUsuario.validaUsuario());
			
	
		} else {
			System.out.println("erro ao tentar cadastrar verifique os dados");
			// mensagen de erro.
		}

	}
	public OrdemDeServico getOS() {
		return this.os;
	}
	void salvaOs(){
		if(this.os != null) {
			OrdemDeServicoDao dao = new OrdemDeServicoDao();
			dao.salvaOS(this.os);// salva no banco
			
		}
	}

}

// 1 - recebe os dados
// 2 - valida os dados.
// 3 - valida o usuario.
// 4 - cria a Os.
// 5 - salva a Os.