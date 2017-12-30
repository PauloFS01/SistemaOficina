package br.oficina.controllers;

import br.oficina.classes.Cronograma;
import br.oficina.classes.OrdemDeServico;
import br.oficina.classes.Procedimento;
import br.oficina.daos.CronogramaDao;
import br.oficina.helpers.ValidadorUsuario;

public class CronogramaBuilder {
	private Cronograma cronograma;

	public CronogramaBuilder(OrdemDeServico os, Procedimento procedimento) {
		this.cronograma = new Cronograma();
		if (ValidadorUsuario.validaUsuario()) {
			this.cronograma.addOS(os);
			this.cronograma.addProcedimento(procedimento);
			
			System.out.println("Construindo Builder do cronograma");

		} else {
			System.out.println("erro ao tentar cadastrar verifique os dados");
			// mensagen de erro.
		}
	}

	private void salvaCronograma() {
		if(this.cronograma !=null) {
			CronogramaDao dao = new CronogramaDao();
			dao.salvaCronograma(cronograma);// salva no banco			
		}

	}

	public Cronograma getCronograma() {
		return this.cronograma;
	}

}

// 1 - recebe os dados
// 2 - valida os dados.
// 3 - cria o cronograma.
// 4 - valida o usuario.
// 5 - salva o cronograma.