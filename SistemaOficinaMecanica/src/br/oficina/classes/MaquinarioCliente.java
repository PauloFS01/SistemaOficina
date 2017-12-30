package br.oficina.classes;

public abstract class MaquinarioCliente implements Maquinario {
	private int id;
	private String marca;
	private String modelo;
	private String anoFabricaca;
	private Pessoas proprietario;
	private Cronograma cronograma;

	public MaquinarioCliente(String marca, String modelo, String anoFabricaca, Pessoas proprietario) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricaca = anoFabricaca;
		this.proprietario = proprietario;
		this.cronograma = cronograma;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getAnoFabricaca() {
		return anoFabricaca;
	}

	public Pessoas getProprietario() {
		return proprietario;
	}

	public Cronograma getCronograma() {
		return cronograma;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAnoFabricaca(String anoFabricaca) {
		this.anoFabricaca = anoFabricaca;
	}

	public void setProprietario(Pessoas proprietario) {
		this.proprietario = proprietario;
	}

	public void setCronograma(Cronograma cronograma) {
		this.cronograma = cronograma;
	}

}
