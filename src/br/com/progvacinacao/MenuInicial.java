package br.com.progvacinacao;

import java.util.Scanner;

public class MenuInicial {

	public static void menu(){
		
		System.out.println(" _____   _                       _                _    _           \r\n"
				+ "(____ \\ (_)                     (_)              | |  | |          \r\n"
				+ " _   \\ \\ _  ___  ___  ____ ____  _ ____   ____   | |  | |___  ____ \r\n"
				+ "| |   | | |/___)/___)/ _  )    \\| |  _ \\ / _  |   \\ \\/ / _  |/ ___)\r\n"
				+ "| |__/ /| |___ |___ ( (/ /| | | | | | | ( ( | |    \\  ( ( | ( (___ \r\n"
				+ "|_____/ |_(___/(___/ \\____)_|_|_|_|_| |_|\\_||_|     \\/ \\_||_|\\____)\r\n"
				+ "                                                                   ");
		
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
