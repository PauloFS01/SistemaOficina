package br.oficina.daos;

public class BdFactory {
	
	 private static BancoDeDados bd;
	
	public static BancoDeDados getBancoDeDados() {
		if(bd == null) {
			bd = new BancoDeDados(); 
			System.out.println("\nCriando Bd ");
		}
		System.out.println("\nRetornando Bd ");
		return bd;
	}

}
