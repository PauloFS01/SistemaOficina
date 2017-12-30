package br.oficina.daos;

import br.oficina.classes.OrdemDeServico;

public class OrdemDeServicoDao extends ObjetosDao{
	
	public void salvaOS(OrdemDeServico os) {
		banco.setOS(os);		
	}

}
