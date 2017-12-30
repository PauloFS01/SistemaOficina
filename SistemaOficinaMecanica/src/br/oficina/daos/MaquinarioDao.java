package br.oficina.daos;

import br.oficina.classes.MaquinarioCliente;

public class MaquinarioDao extends ObjetosDao{
	
	public void salvaMaquinario(MaquinarioCliente maquinario){
		banco.setMaquinario(maquinario);
	}
	
}
