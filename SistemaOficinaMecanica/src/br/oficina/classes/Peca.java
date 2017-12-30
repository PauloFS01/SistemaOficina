package br.oficina.classes;

public class Peca {
	
	private int id;
	private String descricao;

	public Peca(String descricao) {
		
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Peca [descricao = " + descricao + "]";
	}
	
}
