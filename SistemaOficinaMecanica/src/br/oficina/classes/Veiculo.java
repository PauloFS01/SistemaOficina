package br.oficina.classes;

public class Veiculo extends MaquinarioCliente{
	
	private String placa;

	
	public Veiculo(String placa, String marca, String modelo, String anoFabricaca, Pessoas proprietario) {
		super(marca, modelo, anoFabricaca, proprietario);
		this.placa = placa;
	}


	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}


	@Override
	public String toString() {
		return "Veiculo: placa = " + placa;
	}
	
	

}
