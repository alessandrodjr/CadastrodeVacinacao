package br.com.progvacinacao;

import java.util.Scanner;

public class MenuInicial {

	public static void menu(){
		
		Scanner ler = new Scanner(System.in);
		System.out.println("******************************** MENU **********************************");
		System.out.println("\n                   Bem vinde ao Dissemina Vac!!!\n"
						+ "========================================================================");
		
		int opcao;
		
		System.out.println("                       SELECIONE UMA OP��O \n"
						+ "========================================================================\n1. "
						+ "Cadastro\n2. "
						+ "Situa��o geral de vacina��o em S�o Paulo\n3. "
						+ "Informa��es do sistema");
		
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
