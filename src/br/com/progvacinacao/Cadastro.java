package br.com.progvacinacao;

import java.util.Scanner;

public class Cadastro {


	static void cadastrando() {
		
		Scanner ler = new Scanner(System.in);
		Usuario user1 =  new Usuario();
		
		System.out.println("Digite seu nome completo: ");
		user1.setNome(ler.next());
		
		System.out.println("Qual a sua idade? ");
		user1.setIdade(ler.nextInt());
		
		System.out.println("Qual seu endere�o: ex: rua, n� ");
		user1.setEndereco(ler.next());
		
		System.out.println("De acordo com as regi�es abaixo digite o n�mero correspondente"
				+ "a sua regi�o: \n 1- Centro 2- Norte 3- Leste 4- Sul 5- Oeste");
		user1.setNome(ler.next());
		
		
		
	}
	
	
	
}
