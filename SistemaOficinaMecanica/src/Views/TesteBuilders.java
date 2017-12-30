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

		PessoasBuilder ClienteBuilder = new PessoasBuilder("Cliente Padr�o", "Enderreco Padr�o", "Telefone Padr�o",
				"CPF Padr�o", "RG Padr�o", hoje, TipoPessoa.Fisica);

		PessoasBuilder funcionarioBuilder = new PessoasBuilder("Funcionario Padr�o", "Fun��o Padr�o", "Enderreco Padr�o",
				"Telefone Padr�o", "CPF Padr�o", "RG Padr�o", hoje);

		ProcedimentoBuilder procedimentoBuilder = new ProcedimentoBuilder("Descri��o Padr�o", Periodicidade.mensal);

		MaquinarioBuilder veiculo = new MaquinarioBuilder("Placa padr�o", "Marca Padr�o", "Modelo Padr�o", "ano padr�o",
				ClienteBuilder.getPessoa());

		OSBuilder os = new OSBuilder((Funcionario) funcionarioBuilder.getPessoa(), veiculo.getMaquinario(), futuro,
				"Descri��o Padr�o");

		CronogramaBuilder mensalBuilder = new CronogramaBuilder(os.getOS(), procedimentoBuilder.getProcedimento());
		
		OrdemDeServico ordemDeServico = os.getOS();
		
		System.out.println(ordemDeServico);

	}

}

/*
 * -para testes: "padrao", "padrao123"
 * 
 */