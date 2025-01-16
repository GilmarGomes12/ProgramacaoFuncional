package br.com.gtech.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		
		// SINTAXE: (ARGUMENTO) -> CORPO   
		Consumer<String> consumerMaiusculo = palavra -> System.out.println(palavra.toUpperCase());
		consumerMaiusculo.accept("jesus rei dos reis");
		
		List<String> nomes = List.of("Gilmar", "Humberto", "Gomes");
		Consumer<String> nomeMaiusculo = palavra -> System.out.println(palavra.toUpperCase());
		
		nomes.forEach(nomeMaiusculo);
	}

}
