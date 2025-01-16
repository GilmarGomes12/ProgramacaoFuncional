package br.com.gtech.pf.interfaces;

public class InterfaceFuncionalTest {

	public static void main(String[] args) {
		
		RealizarCalculo realizarCalculo = new RealizarCalculo();
		System.out.println(realizarCalculo.calcular(5, 10));
		
		Calcular2 calcular2 = (a, b) -> a + b;
		System.out.println(calcular2.calcular(20, 10));
	}

}
