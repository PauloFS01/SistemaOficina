package br.oficina.daos;

import br.oficina.classes.Procedimento;

public class ProcedimentoDao extends ObjetosDao{
	
	public void salvaProcedimento (Procedimento procedimento) {
		banco.setProcedimentos(procedimento);
	}
}
