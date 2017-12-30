package br.oficina.classes;

import java.util.ArrayList;
import java.util.List;

public class Cronograma {
	private int id; 
	private List<OrdemDeServico> ultimaOS;
	private List<Procedimento> procedimentos;
	
	
	public Cronograma() {
		this.ultimaOS = new ArrayList<>();
		this.procedimentos = new ArrayList<>();
		//System.out.println("construtor do cronograma");
	}
	
	public void addProcedimento(Procedimento procedimento) {
		this.procedimentos.add(procedimento);
	}
	
	public void addOS(OrdemDeServico os) {
		this.ultimaOS.add(os);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	
	

}
