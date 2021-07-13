package br.com.progvacinacao;

public class Usuario {

	private String nome;
	private int idade;
	private String endereco;
	private int regiao;
	private long cpf;
	
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getRegiao() {
		return regiao;
	}
	public void setRegiao(int regiao) {
		this.regiao = regiao;
	}			
}