package br.com.gtech.consumer;

import java.util.function.Consumer;

public class Pessoa {

	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void atualizarDados(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

	public void atualizarDadosComConsumer(Consumer<Pessoa> consumerPessoa) {
			consumerPessoa.accept(this);
		};

	}
