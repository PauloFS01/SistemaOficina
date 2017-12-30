package br.oficina.helpers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateHelper {
	public static DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
	public static DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static String dataFormatada(LocalDate data) {
		return data.format(formatador);
	}

	public static String dataHoraFormatada(LocalDateTime data) {
		return data.format(formatadorComHoras);
	}

	public static boolean validaData(LocalDate data) {
		return (data.compareTo(LocalDate.now()) > 0) ? true : false;
	}
	
	public static boolean validaDataNasc(LocalDate data) {
		return (data.compareTo(LocalDate.now()) > 0) ? false : true;
	}

}