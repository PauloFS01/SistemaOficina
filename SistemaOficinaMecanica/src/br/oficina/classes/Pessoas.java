package br.oficina.classes;

import java.time.LocalDate;

public abstract class Pessoas {
	
	private int id;
	private String nome;
	private String enderreco;
	private String telefone;
	private String cpf;
	private String rg;
	private LocalDate dataNasc;
	

	public Pessoas(String nome, String enderreco, String telefone, String cpf, String rg, LocalDate dataNasc) {
		this.nome = nome;
		this.enderreco = enderreco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNasc = dataNasc;
		this.id = 0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderreco() {
		return enderreco;
	}
	public void setEnderreco(String enderreco) {
		this.enderreco = enderreco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
