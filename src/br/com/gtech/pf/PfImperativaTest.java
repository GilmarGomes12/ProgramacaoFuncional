package br.com.gtech.pf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PfImperativaTest {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> numerosPares = obterNumerosPares(numeros);
		
		System.out.println(numerosPares);
		
	}

	private static List<Integer> obterNumerosPares(List<Integer> numeros) {
		
		List<Integer> somentePares = new ArrayList<>();
		
		for (Integer numero : numeros) {
			if (numero % 2 == 0) {
				somentePares.add(numero);
			}
		}
		
		return somentePares;
	}

}
