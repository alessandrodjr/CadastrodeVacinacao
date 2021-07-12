package br.com.progvacinacao;

import java.util.Scanner;

public class SituacaoGeral {
	
		public static void dadosGerais() {
		System.out.println("========Informa��o Gerais=======");
		System.out.println("\n*Criar Cadastro no site Vacina Já (https://www.vacinaja.sp.gov.br/)");
		System.out.println("\n*Caso não possua, no dia da vacinação\r\n"
				+ "levar RG, Cartão do Sus e Comprovante de\r\n"
				+ "Residência");
		System.out.println("\nTodas as vacinas protegem contra o Covid -19\r\n"
				+ " de forma eficiente");
		System.out.println("\n========Imunobiológicos (Vacinas)========");
		System.out.println("\nASTRAZENECA | OXFORD (2 Doses)");
		System.out.println("\nCORONAVAC | BUTANTAN (2 Doses)");
		System.out.println("\nJANSSEN | JOHNSON & JOHNSON (Dose Única)");
		System.out.println("\nPFIZER | BIONTECH (2 Doses)");
		System.out.println("\n========Quadro Geral de Vacinados no estado de São Paulo=======");
		System.out.println("\nPrimeira Dose ---> 21.404.663");
		System.out.println("\nSegunda Dose ---> 6.494.595");
		System.out.println("\nDose Única --->737.085 ");
		System.out.println("\nPorcentagem da população vacinada ---> 15,62%");
		System.out.println("\n========Quadro Geral de Vacinados na Cidade de São Paulo=======");
		System.out.println("\nPrimeira Dose ---> 5.936.812");
		System.out.println("\nSegunda Dose ---> 1.758.930");
		System.out.println("\nDose Única ---> 290.477 ");
		System.out.println("\nPorcentagem da população vacinada ---> 8%");
		
		Scanner ler = new Scanner(System.in);
		int opcao;
		
		System.out.println("\n========Selecione uma opção========");
		System.out.println("\n1. Voltar a Página");
		System.out.println("\n2. Sair"); 
		
		opcao = ler.nextInt();

		if(opcao == 1) {
			MenuInicial.menu();
		}

		else if(opcao == 2) {
			System.out.println("\nVacina Já!");
		}

		

}
	}
		
		
