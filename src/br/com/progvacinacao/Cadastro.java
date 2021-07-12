package br.com.progvacinacao;

import java.util.Scanner;

public class Cadastro extends Usuario {


	public static void cadastrando() {
		
		Scanner ler = new Scanner(System.in);
		Usuario user1 =  new Usuario();
		
		System.out.println("*****************************PREENCHA O CADASTRO*****************************\n");
		System.out.println("Digite seu nome completo: ");
		user1.setNome(ler.nextLine());
		
		System.out.println("\nQual a sua idade? ");
		user1.setIdade(ler.nextInt());
				
		System.out.println("\nQual é o seu endereço? (exemplo: rua abc, nº 123 )");
		user1.setEndereco(ler.nextLine());
		
		System.out.println("\nDe acordo com as regiões abaixo digite o número correspondente"
				+ " a sua região:" +"\n1- Centro \n2- Norte \n3- Leste \n4- Sul \n5- Oeste");
		user1.setRegiao(ler.nextInt());
		
		
		System.out.println("\n*****************************COMO PODEMOS AJUDAR?*****************************\n"
				+ "\nDigite o número para opção desejada: \n1- Vacinação \n2- Situação Geral \n3- Informações");
		user1.setAjuda(ler.nextInt());
			
		if(user1.getAjuda() == 1) {			
			System.out.println("Você tomou a 1ª dose da vacina? Digite 1 ou 2 nas opções abaixo:\n1- Sim \n2- Não");
			user1.setVacina1(ler.nextInt());
			
		}
		
		if(user1.getVacina1() == 1) {			
			System.out.println("\nDigite o número correspodente para qual fabricante foi aplicada a 1ª dose em você:\n1- Coronavac (Butantan) "
					+ "\n2- AstraZeneca/Oxford (Fiocruz) \n3- Pfizer (BioNTech) \n4- Jassen (Johnson & Johnson) ");
			user1.setFabricante(ler.nextInt());	
				
		}
		
		if(user1.getFabricante() == 1) {			
			System.out.println("\n===============================Coronavac (Butantan)===============================\nVocê tomou a 2ª dose? Digite 1 ou 2 nas opções abaixo:\n1- Sim \n2- Não");
			user1.setCoronavac1(ler.nextInt());						
		}
		
		if(user1.getCoronavac1() == 1) {			
			System.out.println("\n===============================Coronavac (Butantan)===============================\nParabéns!!!\n \nFicamos muito felizes que você esteja imuninizado!"
					+ "\nAinda precisamos da sua colaboração para vencermos o Vírus.\nA vacina te protege mas não eximi o contágio.\n\n------------------------------------Importante"
					+ "------------------------------------\nContinue seguindo as recomedanções dos Órgãos de saúde:\n \n-Use máscara. \n-Lave suas mãos com frequência. Use sabão e "
					+ "água ou álcool em gel.\n-Matenha o distanciamento social sempre que possível.\n \n#Vacinaparatodos \n----------------------------------------------"
					+ "------------------------------------");
			user1.setCoronavac2(ler.nextInt());						
		}
		
		if(user1.getCoronavac1() == 2) {
			System.out.println("\n===============================Coronavac (Butantan)===============================\nFazem 28 dias ou mais que você tomou a 1ª dose? Digite 1 ou 2 nas"
					+ " opções abaixo:\n1- Sim \n2- Não");
			user1.setCoronavac2S(ler.nextInt());
		}
		
		if(user1.getCoronavac2S() == 1 && user1.getRegiao() == 1) {
			System.out.println("\n===============================Coronavac (Butantan)===============================\nChegou a sua hora!!!\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Sé\nEndereço: Rua Frederico Alvarenga 259 "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informações acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n----------------------"
					+ "------------------------------------------------------------");
			user1.setCoronavac2S(ler.nextInt());
		}
				
		if(user1.getVacina1() == 2){
			System.out.println("Você possui Comorbidades?\nDigite 1 ou 2 nas opções abaixo:\n1- Sim \n2- Não");
			user1.setComorbidade(ler.nextInt());
		}
		
			
			
	}
}
