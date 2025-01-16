package br.com.gtech.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		Predicate<Integer> numeroPar = numero -> {
			return numero % 2 == 0;
		};
		
		boolean esteNumeroEhPar = numeroPar.test(10);
		
		if (esteNumeroEhPar) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
		
		System.out.println(esteNumeroEhPar ? "O número é par" : "O número é impar");
		
		Predicate<String> estaVazia = meuNome -> meuNome.isEmpty();
			System.out.println(estaVazia.test("Gilmar Gomes"));
		
			
		List<Produto> listProdutos = new ArrayList<>();
		listProdutos.add(new Produto("Notebook", 2500.00));
		listProdutos.add(new Produto("Smartphone", 1500.00));
		listProdutos.add(new Produto("Tablet", 1200.00));
		listProdutos.add(new Produto("Smartwatch", 800.00));
		listProdutos.add(new Produto("SmartTV", 3500.00));
		
		Predicate<Produto> produtoMaiorQue2000 = produto -> produto.getValor() >= 2000.00;
		
		for (Produto produto : listProdutos) {
			if (produtoMaiorQue2000.test(produto)) {
				System.out.println(produto.getNomeProduto() + " custa mais de R$ 2000,00");
			}
		}
	}
}
