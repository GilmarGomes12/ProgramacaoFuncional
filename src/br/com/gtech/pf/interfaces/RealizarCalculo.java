package br.com.gtech.pf.interfaces;

public class RealizarCalculo implements Calcular {

	@Override
	public int calcular(int a, int b) {
		return a + b;
	}

}
