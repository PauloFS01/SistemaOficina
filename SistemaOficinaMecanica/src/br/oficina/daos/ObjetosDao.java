package br.oficina.daos;

public abstract class ObjetosDao {
	BancoDeDados banco;
	
	public ObjetosDao(){
		this.banco = BdFactory.getBancoDeDados();
		
	}

}
