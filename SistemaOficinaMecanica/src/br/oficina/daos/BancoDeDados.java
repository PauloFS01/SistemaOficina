package br.oficina.daos;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

import br.oficina.classes.Cronograma;
import br.oficina.classes.FuncionarioLogavel;
import br.oficina.classes.MaquinarioCliente;
import br.oficina.classes.OrdemDeServico;
import br.oficina.classes.Peca;
import br.oficina.classes.Pessoas;
import br.oficina.classes.Procedimento;

public class BancoDeDados {

	Map<String, FuncionarioLogavel> funcionario = new HashMap<>();
	Map<Integer, Pessoas> pessoas = new HashMap<>();
	Map<Integer, MaquinarioCliente> maquinarioCliente = new HashMap<>();
	Map<Integer, Peca> pecas = new HashMap<>();
	Map<Integer, Procedimento> procedimentos = new HashMap<>();
	Map<Integer, Cronograma> cronogramas = new HashMap<>();
	Map<Integer, OrdemDeServico> os = new HashMap<>();
	int ultimoId = 1;

	public BancoDeDados() {
		criaRegistros();
		System.out.println("construindo banco de dados com funcionario padrao: " +  funcionario.get("padrao").getNome());
	}

	public void setCronogramas(Cronograma cronograma) {
		cronograma.setId(geraId());
		this.cronogramas.put(cronograma.getId(), cronograma);
	}

	protected void prencheMapFuncionario(FuncionarioLogavel funcionario) {
		funcionario.setId(geraId());
		this.funcionario.put(funcionario.getLogin(), funcionario);
		setPessoas(funcionario);

	}

	public FuncionarioLogavel getFuncionarioLogin(String login) {
		return funcionario.get(login);
	}

	public void setPessoas(Pessoas pessoa) {
		if (pessoa.getId() == 0) {
			pessoa.setId(geraId());
		}

		pessoas.put(pessoa.getId(), pessoa);

	}

	public void setMaquinario(MaquinarioCliente maquinario) {
		maquinario.setId(geraId());
		this.maquinarioCliente.put(maquinario.getId(), maquinario);
	}

	public MaquinarioCliente getMaquinarioCliente(int id) {
		return maquinarioCliente.get(id);
	}

	public void setPeca(Peca peca) {
		peca.setId(geraId());
		this.pecas.put(peca.getId(), peca);
	}

	public Peca getPeca(int id) {
		return pecas.get(id);
	}

	public void setProcedimentos(Procedimento procedimento) {
		procedimento.setId(geraId());
		procedimentos.put(procedimento.getId(), procedimento);
	}

	public Procedimento getProcedimento(int id) {
		return procedimentos.get(id);
	}

	public OrdemDeServico getOS(int id) {
		return os.get(id);
	}

	public void setOS(OrdemDeServico os) {
		os.setId(geraId());
		this.os.put(os.getId(), os);
	}

	public int geraId() {
		this.ultimoId += 1;
		return this.ultimoId;
	}

	private void criaRegistros() {//nome login e senha
		FuncionarioLogavel funcionarioTeste = new FuncionarioLogavel("Usuario de teste", "padrao", "padrao123",
				"funcao padrao", "enderreco padrao", "12345678", "293.483.943-21", "12345678",
				LocalDate.of(1982, Month.JULY, 31));
		//System.out.println("Criando fucionario logavel " + funcionarioTeste.getLogin());
		prencheMapFuncionario(funcionarioTeste);
	}

}
