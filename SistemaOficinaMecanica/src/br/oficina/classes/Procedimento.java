package br.oficina.classes;

import java.util.ArrayList;
import java.util.List;

public class Procedimento {
	private int id;
	private String descricao;
	private Periodicidade periodicidade;
	private List<Peca> pecas;
	
	public Procedimento(String descricao, Periodicidade periodicidade) {
		this.descricao = descricao;
		this.periodicidade = periodicidade;
		this.pecas = new ArrayList<>();

	}
	
	public void addPecas(Peca peca) {
		pecas.add(peca);
	}
	
	public Peca getPeca(int posicao) {
		return this.pecas.get(posicao);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		 return this.descricao;
	}


}
