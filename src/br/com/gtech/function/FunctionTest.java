package br.com.gtech.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		
		Function<Integer, Integer> functionMultiplicacao = numero -> numero * numero;
		int resultado = functionMultiplicacao.apply(10);
		System.out.println("Resultado da multiplicação: " + resultado);
		
		
		Function<String, Integer> functionTexto = texto -> texto.length();
		int qntCaracteres = functionTexto.apply("Texto de teste");
		System.out.println("Quantidade de caracteres: " + qntCaracteres);
		
		
		Function<String, String> functionMaiusculo = texto -> texto.toUpperCase();
		String textoMaiusculo = functionMaiusculo.apply("estou aprendendo java");
		System.out.println("Texto em maiúsculo: " + textoMaiusculo);
		
		
		Function<Pessoa, String> functionConcatenacaoPessoa = pessoa -> pessoa.getNome() + "tem " + pessoa.getIdade() + "anos ";
		System.out.println(functionConcatenacaoPessoa.apply(new Pessoa("Gilmar ", 47)));
		
		
//		List<String> linguagensDeProgramacao = Arrays.asList("Java", "Python", "JavaScript", "C#", "PHP", "Ruby", "Swift", "Kotlin");
//		Function<List<String>, String> functionLinguagens = lista -> String.join(", ", lista);
//		System.out.println("Linguagens de programação: " + functionLinguagens.apply(linguagensDeProgramacao));
		
		List<String> linguagensDeProgramacao = Arrays.asList("Java", "Python", "JavaScript", "C#", "PHP", "Ruby", "Swift", "Kotlin");
		Function<List<String>, String> functionLinguagens = linguagens -> {
			StringBuilder resultadoConcatenacao = new StringBuilder();
			for (String linguagem : linguagens) {
				resultadoConcatenacao
				.append(linguagem)
				.append(", ");
			}
			if (resultadoConcatenacao.length() > 0) {
                resultadoConcatenacao.delete(resultadoConcatenacao.length() - 1, resultadoConcatenacao.length());
                }
			
			return resultadoConcatenacao.toString();
		};
		
		String linguagensSeparadasPorVirgula = functionLinguagens.apply(linguagensDeProgramacao);
		System.out.println("Linguagens de programação: " + linguagensSeparadasPorVirgula);
	}
}
