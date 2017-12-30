package br.oficina.classes;

public class Embarcacao extends MaquinarioCliente{
	
	private TipoMaquinario tipo;

	public Embarcacao(TipoMaquinario tipo, String marca, String modelo, String anoFabricaca, Pessoas proprietario) {
		super(marca, modelo, anoFabricaca, proprietario);

	}


}
