package br.com.gtech.pf.interfaces;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface IValidarEmail {
	
	boolean validarEmail(String email);

	static List<String> obterEmailsValidos(List<String> emails, IValidarEmail iValidarEmail) {
		
		List<String> listaEmailsValidos = new ArrayList<>();
		
		for (String email : emails) {
            if (iValidarEmail.validarEmail(email)) {
            	listaEmailsValidos.add(email);
            }
		}   
		return listaEmailsValidos;
	}

}
