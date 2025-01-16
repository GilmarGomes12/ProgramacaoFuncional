package br.com.gtech.consumer;

public class PessoaTest {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
//		pessoa.atualizarDados("Gilmar", 47);
		System.out.println(pessoa);
		
		pessoa.atualizarDadosComConsumer(pes -> {
			pes.setNome("Gilmar");
			pes.setIdade(47);
        });
		
		System.out.println(pessoa);
	}

}
	