package Views;

import java.time.LocalDate;
import java.time.Month;

import br.oficina.classes.Funcionario;
import br.oficina.classes.OrdemDeServico;
import br.oficina.classes.Periodicidade;
import br.oficina.classes.TipoPessoa;
import br.oficina.controllers.CronogramaBuilder;
import br.oficina.controllers.MaquinarioBuilder;
import br.oficina.controllers.OSBuilder;
import br.oficina.controllers.PessoasBuilder;
import br.oficina.controllers.ProcedimentoBuilder;

public class TesteBuilders {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		LocalDate futuro = LocalDate.of(2020, Month.JULY, 31);

		PessoasBuilder ClienteBuilder = new PessoasBuilder("Cliente Padrão", "Enderreco Padrão", "Telefone Padrão",
				"CPF Padrão", "RG Padrão", hoje, TipoPessoa.Fisica);

		PessoasBuilder funcionarioBuilder = new PessoasBuilder("Funcionario Padrão", "Função Padrão", "Enderreco Padrão",
				"Telefone Padrão", "CPF Padrão", "RG Padrão", hoje);

		ProcedimentoBuilder procedimentoBuilder = new ProcedimentoBuilder("Descrição Padrão", Periodicidade.mensal);

		MaquinarioBuilder veiculo = new MaquinarioBuilder("Placa padrão", "Marca Padrão", "Modelo Padrão", "ano padrão",
				ClienteBuilder.getPessoa());

		OSBuilder os = new OSBuilder((Funcionario) funcionarioBuilder.getPessoa(), veiculo.getMaquinario(), futuro,
				"Descrição Padrão");

		CronogramaBuilder mensalBuilder = new CronogramaBuilder(os.getOS(), procedimentoBuilder.getProcedimento());
		
		OrdemDeServico ordemDeServico = os.getOS();
		
		System.out.println(ordemDeServico);

	}

}

/*
 * -para testes: "padrao", "padrao123"
 * 
 */