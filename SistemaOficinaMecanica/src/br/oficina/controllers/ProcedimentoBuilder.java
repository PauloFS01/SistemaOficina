package br.oficina.controllers;

import br.oficina.classes.Periodicidade;
import br.oficina.classes.Procedimento;
import br.oficina.daos.ProcedimentoDao;
import br.oficina.helpers.ValidadorUsuario;

public class ProcedimentoBuilder {
	//validar usuario
	Procedimento procedimento;
	 
	
	public ProcedimentoBuilder(String descricao, Periodicidade periodicidade) {
		
		if (ValidadorUsuario.validaUsuario()) {
			this.procedimento = new Procedimento(descricao, periodicidade);
			procedimento.getDescricao();
			System.out.println("Criando Novo Builder Procedimento  ");
		}
		
	}
	
	public Procedimento getProcedimento() {
		return this.procedimento;
	}
	
	private void salvaProcedimento() {
		if(this.procedimento !=null) {
			ProcedimentoDao dao = new ProcedimentoDao();
			dao.salvaProcedimento(this.procedimento);
			
		}
	}

}
