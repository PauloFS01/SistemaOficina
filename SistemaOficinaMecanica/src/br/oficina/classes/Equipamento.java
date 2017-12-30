package br.oficina.classes;

public class Equipamento extends MaquinarioCliente{
	private TipoMaquinario tipo;

	public Equipamento(TipoMaquinario tipo, String marca, String modelo, String anoFabricaca, Pessoas proprietario) {
		super(marca, modelo, anoFabricaca, proprietario);

	}

	
}
