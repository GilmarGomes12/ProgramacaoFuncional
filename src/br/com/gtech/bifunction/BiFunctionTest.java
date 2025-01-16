package br.com.gtech.bifunction;

import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionTest {

	public static void main(String[] args) {

		BiFunction<String, Integer, String> biFunctionMeuNome = (nome, idade) -> "Meu nome é " + nome + " e tenho "
				+ idade + " anos.";
		System.out.println(biFunctionMeuNome.apply("Gilmar", 47));

		BiFunction<Integer, Integer, Integer> biFunctionSoma = (numeroA, numeroB) -> numeroA + numeroB;
		System.out.println(biFunctionSoma.apply(10, 50));

		String linhaArquivoTxt = "Gilmar,00000000000,Uberlândia,47";
		BiFunction<String, Character, String[]> strSplit = (entradaString, entradaChar) -> {
			String[] arrSplit = entradaString.split(entradaChar.toString());
			return arrSplit;
		};

		String[] resultadoSplit = strSplit.apply(linhaArquivoTxt, new Character(','));
		for (String resultSplit : resultadoSplit) {
			System.out.println(resultSplit);
		}

		List<Integer> listaNumero1 = List.of(1, 2, 3, 4);
		List<Integer> listaNumero2 = List.of(5, 6, 7, 8);

		BiFunction<List<Integer>, List<Integer>, Integer> biFunctionSomaListas = (lista1, lista2) -> {

			int tamanho = lista1.size();
			int somatorioTotal = 0;

			for (int i = 0; i < tamanho; i++) {
				int somaPosicao = lista1.get(i) + lista2.get(i);
				somatorioTotal += somaPosicao;
			}
			return somatorioTotal;
		};

		int resultadoSomatorio = biFunctionSomaListas.apply(listaNumero1, listaNumero2);
		System.out.println("Resultado somatório: " + resultadoSomatorio);

	}

}
