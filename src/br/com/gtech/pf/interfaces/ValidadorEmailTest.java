package br.com.gtech.pf.interfaces;

import java.util.List;

public class ValidadorEmailTest {

	public static void main(String[] args) {
		
		List<String> emails = List.of("gilmargomes12@gmail.com", "gilmar_gomes12@hotmail.com", "gomes_alf@yahoo.com");
		
		//INTERFACE FUNCIONAL		= EXPRESSAO LAMBDA
		IValidarEmail iValidarEmail = (email) -> email.contains("@");
		
		List<String> emailsValidos = IValidarEmail.obterEmailsValidos(emails, iValidarEmail);
		
		System.out.println(emailsValidos);
	}

}
