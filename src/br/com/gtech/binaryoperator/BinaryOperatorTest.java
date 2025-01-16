package br.com.gtech.binaryoperator;

/**
 * BinaryOperator é uma interface funcional que representa uma operação em dois operandos do mesmo tipo, 
 * produzindo um resultado do mesmo tipo dos operandos. Ela estende a interface Function<T, R>, onde T representa 
 * o tipo dos operandos e R representa o tipo do resultado. No caso do BinaryOperator, T e R são o mesmo tipo.
 * Em resumo: Um BinaryOperator recebe dois valores do mesmo tipo e retorna um único valor do mesmo tipo.
 * BinaryOperator simplifica a definição de operações binárias em Java, tornando o código mais conciso e legível, 
 * especialmente quando usado com expressões lambda e referências de métodos. É uma ferramenta fundamental na 
 * programação funcional com Java.
 */

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

	public static void main(String[] args) {
		
		// T apply(T t, T u);
		BinaryOperator<Integer> binaryOperator = (numero1, numero2) -> numero1 + numero2;
		System.out.println(binaryOperator.apply(10, 50));
		
		// R apply(T t, T u);
		BiFunction<Integer, Integer, String> biFunctionSoma = (numeroA, numeroB) -> "A soma do numeroA + numeroB é: " + (numeroA + numeroB);
		System.out.println(biFunctionSoma.apply(10, 50));
		
		Produto produtoA = new Produto(250.0);
		Produto produtoB = new Produto(250.0);
		
		// T apply(T t, T u);
		BinaryOperator<Produto> binaryOperatorProduto = (produto1, produto2) -> {
			return new Produto(produto1.getPreco() + produto2.getPreco());
		};
		
		Produto produtoNovoSomado = binaryOperatorProduto.apply(produtoA, produtoB);
		System.out.println(produtoNovoSomado);
		
		Pessoa pessoaA = new Pessoa("João", 45);
		Pessoa pessoaB = new Pessoa("Maria", 30);
		
		BinaryOperator<Pessoa> binaryOperatorPessoa = (pessoaNum1, pessoaNum2) -> {
			String nomeDoMaisVelho = pessoaNum1.getIdade() > pessoaNum2.getIdade() ? pessoaNum1.getNome() : pessoaNum2.getNome();
			int idade = pessoaNum1.getIdade() > pessoaNum2.getIdade() ? pessoaNum1.getIdade() : pessoaNum2.getIdade();
			return new Pessoa(nomeDoMaisVelho, idade);
		};
		
		Pessoa pessoaMaisVelha = binaryOperatorPessoa.apply(pessoaA, pessoaB);
		System.out.println(pessoaMaisVelha);
	}

}
