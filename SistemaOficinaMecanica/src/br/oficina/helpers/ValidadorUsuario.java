package br.oficina.helpers;

import java.util.Scanner;

import br.oficina.classes.FuncionarioLogavel;
import br.oficina.daos.PessoasDao;

public class ValidadorUsuario {

	public static PessoasDao dao = new PessoasDao();
	public static String login;
	public static String senha;
	
	public static boolean validaUsuario() {
		Scanner scanner = new Scanner(System.in);	
		
		System.out.println("\nDigite seu login\n");
		login = scanner.nextLine();
		System.out.println("\nDigite sua senha\n");
		senha = scanner.nextLine();
		
		System.out.println(login);
		
		FuncionarioLogavel funcionario = dao.buscaUsuarioAutenticavel(login);
		if (funcionario != null && funcionario.getSenha().equals(senha)) {
			return true;
		}

		System.out.println("erro ao validar usuario");
		return false;
		
	}
}
/*
String login = JOptionPane.showInputDialog("Digite seu login");
String senha = JOptionPane.showInputDialog("Digite sua senha");
*/