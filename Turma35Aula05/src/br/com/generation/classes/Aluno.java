package br.com.generation.classes;

public class Aluno {
	//atributos - variaveis
	//vem por padr�o public caso n for encapsular no private
	public String nome;
	int idade;
	//este aqui est� como public como exemplo
	String curso;
	
	//m�todos - fun��es - funcionalidades
	void assistirAula() {
		System.out.println("aluno assistindo aula");
	}
	void estudar() {
		System.out.println("aluno estudando");
	}
	void fazerProva() {
		System.out.println("aluno fazendo prova");
	}

}
