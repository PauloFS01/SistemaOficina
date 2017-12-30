package br.oficina.daos;

import br.oficina.classes.Cronograma;

public class CronogramaDao extends ObjetosDao {
	
	public void salvaCronograma(Cronograma cronograma) {
		banco.setCronogramas(cronograma);
	}
}
