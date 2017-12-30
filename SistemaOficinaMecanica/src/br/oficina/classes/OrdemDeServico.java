package br.oficina.classes;

import java.time.LocalDate;


public class OrdemDeServico {
	
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private Funcionario funcionario;
	private Maquinario maquinario;
	private LocalDate data;
	private String descricao;
	private Status status;
	private EstadoOS finaliza;
	private EstadoOS cancela;
	
	public OrdemDeServico(Funcionario funcionario, Maquinario maquinario, LocalDate data, String descricao) {
		super();
		this.funcionario = funcionario;
		this.maquinario = maquinario;
		this.data = data;
		this.descricao = descricao;
		this.status = Status.ABERTA;
		finaliza = new FinalizaOS();
		cancela = new CancelaOS();
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public LocalDate getData() {
		return this.data;
	}
	//decorator
	public void finaliza() {
		finaliza.next(this);
	}
	//decorator
	public void cancela() {
		cancela.next(this);
	}	

	@Override
	public String toString() {
		return "OrdemDeServico: \n funcionario = " + funcionario.getNome() + "\n maquinario = " + maquinario 
				+ "\n descricao= " + descricao + " ";
	}
	
	
	
	
	

}
