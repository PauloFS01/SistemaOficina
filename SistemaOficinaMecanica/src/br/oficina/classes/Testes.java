package br.oficina.classes;

import java.time.LocalDate;

import br.oficina.helpers.DateHelper;

public class Testes {
	public static void main(String[] args) {
		//criar um cliente
		//criar um maquinario
		//criar uma peca
		//criar um procedimento
		//criar um cronograma
		// cria um funcionario
		
		LocalDate hoje = LocalDate.now();
		//Cria cliente
		Cliente cliente =  new Cliente("Cliente de teste", "Enderreco padrao de teste", "telefone Padrao", "000.000.000-00"
				, "0.000.000-0", hoje,TipoPessoa.Fisica);
		//Cria peca
		Peca peca = new Peca("Peça de teste");
		
		//Cria procedimento
		Procedimento procedimento = new Procedimento("Procedimento padrão",Periodicidade.mensal);
		procedimento.addPecas(peca);
		
		//Cria funcionario
		Funcionario funcionario = new Funcionario("funcionario de teste","Função padrao"
				, "Enderreco padrao de teste", "telefone Padrao", "000.000.000-00", "0.000.000-0", hoje);
		
		//Cria cronograma
		Cronograma cronograma = new Cronograma();
		cronograma.addProcedimento(procedimento);
		
		//Cria veiculo
		Veiculo veiculo = new Veiculo("Placa-padrao","Marca padrao", "Modelo padrao", "Ano padrao",cliente);
		
		//Cria ordem de servico
		OrdemDeServico os = new OrdemDeServico(funcionario, veiculo, hoje, "OS de teste");
		cronograma.addOS(os);
		
		System.out.println(os + "\n Data: " + DateHelper.dataFormatada(os.getData()));

	}
}
