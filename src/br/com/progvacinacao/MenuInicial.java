package br.com.progvacinacao;

import java.util.Scanner;

public class MenuInicial {

	public static void menu(){
		
		Scanner ler = new Scanner(System.in);
		System.out.println("******************************** MENU **********************************");
		System.out.println("\n                   Bem vinde ao Dissemina Vac!!!\n"
						+ "========================================================================");
		
		int opcao;
		
		System.out.println("                       SELECIONE UMA OPÇÃO \n"
						+ "========================================================================\n1. "
						+ "Cadastro\n2. "
						+ "Situação geral de vacinação em São Paulo\n3. "
						+ "Informações do sistema");
		
		opcao = ler.nextInt();
		
		if(opcao == 1) {
			Cadastro.cadastrando();
		}
		
		else if(opcao == 2) {
			SituacaoGeral.dadosGerais();
		}
		
		else if(opcao == 3) {
			InfoSistema.infsistema();
		}
		
	}

}
