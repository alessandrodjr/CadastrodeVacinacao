package br.com.progvacinacao;

import java.util.Scanner;

public class InfoSistema {
	
	public static void infsistema(){
		System.out.println("======================================== Informações do Sistema =======================================");
		System.out.println("\n*O objetivo do Dissemina Vac é levar informação referente a vacinação "
				+ "\ncontra a COVID na Cidade de São Paulo");
		System.out.println("\n*Fornecemos informações gerais de controle de vacinação e coletamos"
				+ "\n dados para melhor auxiliar quem esta em busca orientação");

		System.out.println("\n============================================ Equipe Técnica ===========================================");
		System.out.println("\nAlessandro Dias Jr"
							+ "\nGillie Hope"
							+ "\nJonatas Ribeiro"
							+ "\nKelvin Silva"
							+ "\nLucas Otoni");
		
		
		System.out.println("\n========================================== Versão do Sistema ==========================================");
		System.out.println("\n1.0.0");


		
		Scanner ler = new Scanner(System.in);
		int opcao;

		System.out.println("\n========================================= Selecione uma opção =========================================");
		System.out.println("\n1. Voltar ao menu");
		System.out.println("\n2. Sair");

		opcao = ler.nextInt();

		if (opcao == 1) {
			MenuInicial.menu();
		}

		else if (opcao == 2) {
			System.out.println("\nVacina Já!");
			
		}
	}

}
