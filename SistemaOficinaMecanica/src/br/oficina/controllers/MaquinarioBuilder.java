package br.oficina.controllers;

import br.oficina.classes.Equipamento;
import br.oficina.classes.MaquinarioCliente;
import br.oficina.classes.Pessoas;
import br.oficina.classes.TipoMaquinario;
import br.oficina.classes.Veiculo;
import br.oficina.daos.MaquinarioDao;
import br.oficina.helpers.ValidadorUsuario;

public class MaquinarioBuilder {
	
	MaquinarioCliente maquinario;

	public MaquinarioBuilder(String placa, String marca, String modelo, String anoFabricaca, Pessoas proprietario) {
		if (ValidadorUsuario.validaUsuario()) {
			this.maquinario = new Veiculo(placa, marca, modelo, anoFabricaca, proprietario);
			// maquinarioDao(veiculo);
			System.out.println("criando novo maqunario Builder " + maquinario.getMarca());
		}

		//System.out.println("Saindo do construtor");

	}

	public MaquinarioBuilder(TipoMaquinario tipo, String marca, String modelo, String anoFabricaca,
			Pessoas proprietario) {

		if (ValidadorUsuario.validaUsuario()) {
			this.maquinario = new Equipamento(tipo, marca, modelo, anoFabricaca, proprietario);
			salvaMaquinario();
			// maquinarioDao(veiculo);
		}
		// instancia outros
	}

	private void salvaMaquinario() {
		if(this.maquinario != null) {
			MaquinarioDao dao = new MaquinarioDao();
			dao.salvaMaquinario(this.maquinario);
			
		}
		
	}

	public MaquinarioCliente getMaquinario() {
		return maquinario;
	}

	
	

}

// verificar se será instancia de veiculo
// PS para isso pode usar sobrecarga do construtor
// validar usuario