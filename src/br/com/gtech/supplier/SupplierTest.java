package br.com.gtech.supplier;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		Supplier<String> mensagemSupplier = () -> "Olá, mundo!";
		String mensagemGet = mensagemSupplier.get();
		System.out.println(mensagemGet);

		
		Supplier<Pessoa> pessoaSupplier = () -> new Pessoa("João", 25);
		Pessoa novaPessoa = pessoaSupplier.get();
		System.out.println(novaPessoa);
		
		
		Supplier<ConfigBD> configBDSupplier = SupplierTest::obterDadosDeAcessoAoBanco;
		Consumer<ConfigBD> configBDConsumer = configBD -> {
            System.out.println("Dados de conexão com o banco");
            System.out.println("Porta: " + configBD.getPort());
        };
        
        ConfigBD configBDAtualizazadas = configBDSupplier.get();
        configBDConsumer.accept(configBDAtualizazadas);
	}
	
	public static ConfigBD obterDadosDeAcessoAoBanco() {
        return new ConfigBD("localhost8080", 3306);
	}    

}
