package br.com.gtech.unaryoperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

	public static void main(String[] args) {
		
		Function<Integer, Integer> funcSoma = numero -> numero * 2;
		System.out.println(funcSoma.apply(10));
		
		UnaryOperator<Integer> unarySoma = numero -> numero * 2;
		System.out.println(unarySoma.apply(10));
		
		UnaryOperator<String> unaryColocarMaiusculo = texto -> texto.toUpperCase();
		System.out.println(unaryColocarMaiusculo.apply("jesus é o senhor da minha vida!"));
		
		UnaryOperator<Venda> unaryOperatorVenda = venda -> {
			venda.setValor(venda.getValor() + 100);
			return venda;
		};
		
		Venda objVenda = unaryOperatorVenda.apply(new Venda(400));
		System.out.println(objVenda);
		
		List<Integer> listDeNumeros = List.of(1,2,3,4,5,6,7,8,9,10);
		UnaryOperator<Integer> unaryOperatorMultiplicacao = numero -> numero * 2;
		
		List<Integer> listaDeNumerosMultiplicados = realizarMultiplicacaoDaLista(listDeNumeros, unaryOperatorMultiplicacao); {
		System.out.println(listaDeNumerosMultiplicados);	
		}
		

	}

	private static List<Integer> realizarMultiplicacaoDaLista(List<Integer> listDeNumeros,
			UnaryOperator<Integer> unaryOperatorMultiplicacao) {
		List<Integer> resultado = new ArrayList<>();
		for (Integer numero : listDeNumeros) {
			resultado.add(unaryOperatorMultiplicacao.apply(numero));
		}
		return resultado;
	}

}
