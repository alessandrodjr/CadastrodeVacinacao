package br.com.progvacinacao;

import java.util.Scanner;

public class Cadastro {

	static void cadastrando() {
			
		Scanner ler = new Scanner(System.in);
		Usuario user1 =  new Usuario();
		Perguntas perguntas1 = new Perguntas();
		
		System.out.println("***************************************** PREENCHA O CADASTRO *****************************************\n");
		System.out.println("Digite seu nome completo: ");
		user1.setNome(ler.nextLine());
		
		System.out.println("\nDigite o seu CPF (Sem pontos e traços: ex.: 12345678910).");
		user1.setCpf(ler.nextLong());	
		
		System.out.println("\nQual a sua idade? ");
		user1.setIdade(ler.nextInt());
		
		if(user1.getIdade() <= 0 || user1.getIdade() >= 120 ) {
			System.out.println("Idade inválida\n");
			Cadastro.cadastrando();			
		}
				
		System.out.println("\nDe acordo com as regiões abaixo digite o número correspondente"
				+ " a sua região:" +"\n1- Centro \n2- Norte \n3- Leste \n4- Sul \n5- Oeste");
		user1.setRegiao(ler.nextInt());
						
		System.out.println("\n**************************************** COMO PODEMOS AJUDAR? *****************************************\n"
				+ "\nDigite o número para opção desejada: \n1- Mais informações sobre vacinação \n2- Voltar ao menu \n");
		perguntas1.setAjuda(ler.nextInt());
			
		
		if(perguntas1.getAjuda() == 1 && user1.getIdade() < 12 && user1.getIdade() > 0 && user1.getRegiao() == 1 ) {			
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nAinda não chegou a sua vez!!!\n\nA ANVISA autorizou crianças com 12 anos ou mais para se vacinarem."
					+ "\nAssim que ocorrer a liberação, todas as informações estarão disponíveis para você!\n\nVamos deixar a informação sobre o posto central de vacinação da sua região.\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Sé\nEndereço: Rua Frederico Alvarenga, nº 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
			MenuInicial.menu();
		}
		
		if(perguntas1.getAjuda() == 2) {
			MenuInicial.menu();
		}
				
		if(perguntas1.getAjuda() == 1 && user1.getIdade() < 12 && user1.getIdade() > 0 && user1.getRegiao() == 2 ) {			
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nAinda não chegou a sua vez!!!\n\nA ANVISA autorizou crianças com 12 anos ou mais para se vacinarem."
					+ "\nAssim que ocorrer a liberação, todas as informações estarão disponíveis para você!\n\nVamos deixar a informação sobre o posto central de vacinação da sua região.\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Cruz das Almas\nEndereço: Rua Padre Feliciano Domingos, nº 90 - "
					+ "Freguesia do Ó - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");	
			MenuInicial.menu();
		}
		
		if(perguntas1.getAjuda() == 1 && user1.getIdade() < 12 && user1.getIdade() > 0 && user1.getRegiao() == 3 ) {			
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nAinda não chegou a sua vez!!!\n\nA ANVISA autorizou crianças com 12 anos ou mais para se vacinarem."
					+ "\nAssim que ocorrer a liberação, todas as informações estarão disponíveis para você!\n\nVamos deixar a informação sobre o posto central de vacinação da sua região.\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Carlos Gentile de Melo\nEndereço: Av dos Têxteis, nº 3765 - "
					+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");	
			MenuInicial.menu();
		}

		if(perguntas1.getAjuda() == 1 && user1.getIdade() < 12 && user1.getIdade() > 0 && user1.getRegiao() == 4 ) {			
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nAinda não chegou a sua vez!!!\n\nA ANVISA autorizou crianças com 12 anos ou mais para se vacinarem."
					+ "\nAssim que ocorrer a liberação, todas as informações estarão disponíveis para você!\n\nVamos deixar a informação sobre o posto central de vacinação da sua região.\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS São Vicente de Paula\nEndereço: Rua Vicente da Costa, nº 289 - "
					+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
			MenuInicial.menu();
		}
		
		if(perguntas1.getAjuda() == 1 && user1.getIdade() < 12 && user1.getIdade() > 0 && user1.getRegiao() == 5 ) {			
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nAinda não chegou a sua vez!!!\n\nA ANVISA autorizou crianças com 12 anos ou mais para se vacinarem."
					+ "\nAssim que ocorrer a liberação, todas as informações estarão disponíveis para você!\n\nVamos deixar a informação sobre o posto central de vacinação da sua região.\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Alto de Pinheiros"
					+ "\nEndereço: Av Queiróz Filho, nº 313 - "
					+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
			MenuInicial.menu();
		}
		
		if(perguntas1.getAjuda() == 1) {			
			System.out.println("Você tomou a 1ª dose da vacina? Digite 1 ou 2 nas opções abaixo:\n1- Sim \n2- Não");
			perguntas1.setVacina1(ler.nextInt());
			
		}
					
		if(perguntas1.getVacina1() == 1) {			
			System.out.println("\nDigite o número correspodente para qual fabricante foi aplicada a 1ª dose em você:\n1- Coronavac (Butantan) "
					+ "\n2- AstraZeneca/Oxford (Fiocruz) \n3- Pfizer (BioNTech) \n4- Jassen (Johnson & Johnson) ");
			perguntas1.setFabricante(ler.nextInt());	
				
		}
		
		if(perguntas1.getFabricante() == 1) {			
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nVocê tomou a 2ª dose? Digite 1 ou 2 nas opções abaixo:\n1- Sim \n2- Não");
			perguntas1.setCoronavac1(ler.nextInt());						
		}
		
		if(perguntas1.getCoronavac1() == 1) {			
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\n\nParabéns!!!\n \nFicamos muito felizes que você tomou as duas doses!\n"
					+ "\nAinda precisamos da sua colaboração para vencermos o Vírus.\nA vacina te protege mas não eximi o contágio.\n\n-----------------------------------------------Importante----------------------------------------------"
					+ "\n\nContinue seguindo as recomedanções dos Órgãos de saúde:\n \n-Use máscara. \n-Lave suas mãos com frequência. Use sabão e "
					+ "água ou álcool em gel.\n-Matenha o distanciamento social sempre que possível.\n \n#Vacinaparatodos \n---------------------------------------------------------------------------"
					+ "----------------------------");									
		}
		
		if(perguntas1.getCoronavac1() == 2) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nFazem 28 dias ou mais que você tomou a 1ª dose? Digite 1 ou 2 nas"
					+ " opções abaixo:\n1- Sim \n2- Não");
			perguntas1.setCoronavac2S(ler.nextInt());
		}
		
		if(perguntas1.getCoronavac2S() == 1 && user1.getRegiao() == 1) {
			System.out.println("\n======================================= Coronavac (Butantan) ======================================\nChegou a sua hora!!!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Sé\nEndereço: Rua Frederico Alvarenga, nº 259 -"
					+ " Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informações acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n--------------------------------------------------------------------------"
					+ "-----------------------------");			
		}
		
		if(perguntas1.getCoronavac2S() == 1 && user1.getRegiao() == 2) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Cruz das Almas\nEndereço: Rua Padre Feliciano Domingos, nº 90 - "
			+ "Freguesia do Ó - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informações"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getCoronavac2S() == 1 && user1.getRegiao() == 3) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Carlos Gentile de Melo\nEndereço: Av dos Têxteis, nº 3765 - "
			+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informações"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getCoronavac2S() == 1 && user1.getRegiao() == 4) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS São Vicente de Paula\nEndereço: Rua Vicente da Costa, nº 289 - "
			+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informações"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getCoronavac2S() == 1 && user1.getRegiao() == 5) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Alto de Pinheiros"
			+ "\nEndereço: Av Queiróz Filho, nº 313 - "
			+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informações"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}				
		
		if(perguntas1.getCoronavac2S() == 2 && user1.getRegiao() == 1) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nEstá quase lá!!!\nAguarde o prazo de 28 dias e se dirija a um posto de saúde próximo da sua residência e vacine-se!!!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Sé\nEndereço: Rua Frederico Alvarenga, nº 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informações acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n--------------------------------------------------------------------------------"
					+ "-----------------------");			
		}				

		if(perguntas1.getCoronavac2S() == 2 && user1.getRegiao() == 2) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nEstá quase lá!!!\nAguarde o prazo de 28 dias e se dirija a um posto de saúde próximo da sua residência e vacine-se!!!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Cruz das Almas\nEndereço: Rua Padre Feliciano Domingos, nº 90 - "
					+ "Freguesia do Ó - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}		

		if(perguntas1.getCoronavac2S() == 2 && user1.getRegiao() == 3) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nEstá quase lá!!!\nAguarde o prazo de 28 dias e se dirija a um posto de saúde próximo da sua residência e vacina-se!!!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Carlos Gentile de Melo\nEndereço: Av dos Têxteis, nº 3765 - "
					+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}		

		if(perguntas1.getCoronavac2S() == 2 && user1.getRegiao() == 4) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nEstá quase lá!!!\nAguarde o prazo de 28 dias e se dirija a um posto de saúde próximo da sua residência e vacine-se!!!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS São Vicente de Paula\nEndereço: Rua Vicente da Costa, nº 289 - "
					+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}		

		if(perguntas1.getCoronavac2S() == 2 && user1.getRegiao() == 5) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nEstá quase lá!!!\nAguarde o prazo de 28 dias e se dirija a um posto de saúde próximo da sua residência e vacine-se!!!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Alto de Pinheiros"
					+ "\nEndereço: Av Queiróz Filho, nº 313 - "
					+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getFabricante() == 2) {			
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nVocê tomou a 2ª dose? Digite 1 ou 2 nas opções abaixo:\n1- Sim \n2- Não");
			perguntas1.setAstrazeneca1(ler.nextInt());						
		}
		
		if(perguntas1.getAstrazeneca1() == 1) {			
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\n\nParabéns!!!\n \nFicamos muito felizes que você tomou as duas doses!\n"
					+ "\nAinda precisamos da sua colaboração para vencermos o Vírus.\nA vacina te protege mas não eximi o contágio.\n\n-----------------------------------------------Importante----------------"
					+ "------------------------------\n\nContinue seguindo as recomedanções dos Órgãos de saúde:\n \n-Use máscara. \n-Lave suas mãos com frequência. Use sabão e "
					+ "água ou álcool em gel.\n-Matenha o distanciamento social sempre que possível.\n \n#Vacinaparatodos \n-----------------------------------------------------------------------------------"
					+ "--------------------");								
		}
		
		if(perguntas1.getAstrazeneca1() == 2) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nFazem 12 semanas ou mais que você tomou a 1ª dose? Digite 1 ou 2 nas"
					+ " opções abaixo:\n1- Sim \n2- Não");
			perguntas1.setAstrazeneca2S(ler.nextInt());
		}
		
		if(perguntas1.getAstrazeneca2S() == 1 && user1.getRegiao() == 1) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nChegou a sua hora!!!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Sé\nEndereço: Rua Frederico Alvarenga, nº 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informações acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n---------------------------------------------------------------------"
					+ "----------------------------------");			
		}
		
		if(perguntas1.getAstrazeneca2S() == 1 && user1.getRegiao() == 2) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nChegou a sua hora!!!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Cruz das Almas\nEndereço: Rua Padre Feliciano Domingos, nº 90 - "
			+ "Freguesia do Ó - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informações"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getAstrazeneca2S() == 1 && user1.getRegiao() == 3) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nChegou a sua hora!!!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Carlos Gentile de Melo\nEndereço: Av dos Têxteis, nº 3765 - "
			+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informações"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getAstrazeneca2S() == 1 && user1.getRegiao() == 4) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nChegou a sua hora!!!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS São Vicente de Paula\nEndereço: Rua Vicente da Costa, nº 289 - "
			+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informações"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getAstrazeneca2S() == 1 && user1.getRegiao() == 5) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nChegou a sua hora!!!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Alto de Pinheiros"
			+ "\nEndereço: Av Queiróz Filho, nº 313 - "
			+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informações"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
				
		
		if(perguntas1.getAstrazeneca2S() == 2 && user1.getRegiao() == 1) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nEstá quase lá!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de saúde próximo da sua residência e vacine-se!!!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Sé\nEndereço: Rua Frederico Alvarenga, nº 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informações acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------"
					+ "------------");			
		}				

		if(perguntas1.getAstrazeneca2S() == 2 && user1.getRegiao() == 2) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nEstá quase lá!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de saúde próximo da sua residência e vacine-se!!!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Cruz das Almas\nEndereço: Rua Padre Feliciano Domingos, nº 90 - "
					+ "Freguesia do Ó - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}		

		if(perguntas1.getAstrazeneca2S() == 2 && user1.getRegiao() == 3) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nEstá quase lá!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de saúde próximo da sua residência e vacine-se!!!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Carlos Gentile de Melo\nEndereço: Av dos Têxteis, nº 3765 - "
					+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}		

		if(perguntas1.getAstrazeneca2S() == 2 && user1.getRegiao() == 4) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nEstá quase lá!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de saúde próximo da sua residência e vacine-se!!!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS São Vicente de Paula\nEndereço: Rua Vicente da Costa, nº 289 - "
					+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}		

		if(perguntas1.getAstrazeneca2S() == 2 && user1.getRegiao() == 5) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nEstá quase lá!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de saúde próximo da sua residência e vacine-se!!!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Alto de Pinheiros"
					+ "\nEndereço: Av Queiróz Filho, nº 313 - "
					+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}
		
		if(perguntas1.getFabricante() == 3) {			
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nVocê tomou a 2ª dose? Digite 1 ou 2 nas opções abaixo:\n1- Sim \n2- Não");
			perguntas1.setPfizer1(ler.nextInt());						
		}
		
		if(perguntas1.getPfizer1() == 1) {			
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\n\nParabéns!!!\n \nFicamos muito felizes que você tomou as duas doses!\n"
					+ "\nAinda precisamos da sua colaboração para vencermos o Vírus.\nA vacina te protege mas não eximi o contágio.\n\n------------------------------------------------"
					+ "Importante--------------------------------------------\n\nContinue seguindo as recomedanções dos Órgãos de saúde:\n \n-Use máscara. \n-Lave suas mãos com frequência. Use sabão e "
					+ "água ou álcool em gel.\n-Matenha o distanciamento social sempre que possível.\n \n#Vacinaparatodos \n------------------------------------------------------------------------------------"
					+ "-------------------");								
		}
		
		if(perguntas1.getPfizer1() == 2) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nFazem 12 semanas ou mais que você tomou a 1ª dose? Digite 1 ou 2 nas"
					+ " opções abaixo:\n1- Sim \n2- Não");
			perguntas1.setPfizer2S(ler.nextInt());
		}
		
		if(perguntas1.getPfizer2S() == 1 && user1.getRegiao() == 1) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Sé\nEndereço: Rua Frederico Alvarenga, nº 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informações acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------"
					+ "------------------------------------");
		}
		
		if(perguntas1.getPfizer2S() == 1 && user1.getRegiao() == 2) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Cruz das Almas\nEndereço: Rua Padre Feliciano Domingos, nº 90 - "
			+ "Freguesia do Ó - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informações"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getPfizer2S() == 1 && user1.getRegiao() == 3) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Carlos Gentile de Melo\nEndereço: Av dos Têxteis, nº 3765 - "
			+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informações"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getPfizer2S() == 1 && user1.getRegiao() == 4) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS São Vicente de Paula\nEndereço: Rua Vicente da Costa, nº 289 - "
			+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informações"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getPfizer2S() == 1 && user1.getRegiao() == 5) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Alto de Pinheiros"
			+ "\nEndereço: Av Queiróz Filho, nº 313 - "
			+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informações"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}				
		
		if(perguntas1.getPfizer2S() == 2 && user1.getRegiao() == 1) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nEstá quase lá!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de saúde próximo da sua residência e vacine-se!!!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Sé\nEndereço: Rua Frederico Alvarenga, nº 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informações acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n---------------------------------------------------------------------------------------"
					+ "----------------");			
		}				

		if(perguntas1.getPfizer2S() == 2 && user1.getRegiao() == 2) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nEstá quase lá!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de saúde próximo da sua residência e vacine-se!!!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Cruz das Almas\nEndereço: Rua Padre Feliciano Domingos, nº 90 - "
					+ "Freguesia do Ó - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}		

		if(perguntas1.getPfizer2S() == 2 && user1.getRegiao() == 3) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nEstá quase lá!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de saúde próximo da sua residência e vacine-se!!!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Carlos Gentile de Melo\nEndereço: Av dos Têxteis, nº 3765 - "
					+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}		

		if(perguntas1.getPfizer2S() == 2 && user1.getRegiao() == 4) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nEstá quase lá!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de saúde próximo da sua residência e vacine-se!!!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS São Vicente de Paula\nEndereço: Rua Vicente da Costa, nº 289 - "
					+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}		

		if(perguntas1.getPfizer2S() == 2 && user1.getRegiao() == 5) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nEstá quase lá!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de saúde próximo da sua residência e vacine-se!!!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Alto de Pinheiros"
					+ "\nEndereço: Av Queiróz Filho, nº 313 - "
					+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getFabricante() == 4) {			
			System.out.println("\n===================================== Jassen (Johnson & Johnson) ======================================\n\nParabéns!!!\n\nFicamos muito felizes que você tomou a dose única da Jassen!\n"
					+ "\nAinda precisamos da sua colaboração para vencermos o Vírus.\nA vacina te protege mas não eximi o contágio.\n\n-----------------------------------------------Importante----------------------------------------------"
					+ "\n\nContinue seguindo as recomedanções dos Órgãos de saúde:\n\n-Use máscara.\n-Lave suas mãos com frequência. Use sabão e "
					+ "água ou álcool em gel.\n-Matenha o distanciamento social sempre que possível.\n\n#Vacinaparatodos\n-------------------------------------------------------------------------------------------------------");
		}		
				
		if(perguntas1.getVacina1() == 2){
			System.out.println("Você possui Comorbidades? Digite 1 ou 2 nas opções abaixo:\n1- Sim \n2- Não");
			perguntas1.setComorbidade(ler.nextInt());
		}		
					
		if(perguntas1.getComorbidade() == 1 && user1.getRegiao() == 1 && user1.getIdade() >= 18){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do município de São Paulo a partir dos 18 anos"
					+ "\ncom comorbidades e deficiência permanente podem se vacinar!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Sé\nEndereço: Rua Frederico Alvarenga, nº 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
				
		if(perguntas1.getComorbidade() == 1 && user1.getRegiao() == 2 && user1.getIdade() >= 18){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do município de São Paulo a partir dos 18 anos"					
					+ "\ncom comorbidades e deficiência permanente podem se vacinar!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Cruz das Almas\nEndereço: Rua Padre Feliciano Domingos, nº 90 - "
					+ "Freguesia do Ó - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
				
		if(perguntas1.getComorbidade() == 1 && user1.getRegiao() == 3 && user1.getIdade() >= 18){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do município de São Paulo a partir dos 18 anos"
					+ "\ncom comorbidades e deficiência permanente podem se vacinar!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Carlos Gentile de Melo\nEndereço: Av dos Têxteis, nº 3765 - "
					+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
				
		if(perguntas1.getComorbidade() == 1 && user1.getRegiao() == 4 && user1.getIdade() >= 18){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do município de São Paulo a partir dos 18 anos"
					+ "\ncom comorbidades e deficiência permanente podem se vacinar!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS São Vicente de Paula\nEndereço: Rua Vicente da Costa, nº 289 - "
					+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}			
		
		if(perguntas1.getComorbidade() == 1 && user1.getRegiao() == 5 && user1.getIdade() >= 18){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do município de São Paulo a partir dos 18 anos"
					+ "\ncom comorbidades e deficiência permanente podem se vacinar!\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Alto de Pinheiros"
					+ "\nEndereço: Av Queiróz Filho, nº 313 - "
					+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}
		
		if(perguntas1.getComorbidade() == 1 && user1.getRegiao() == 1 && user1.getIdade() < 18 && user1.getIdade() >= 12){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nEstá quase lá!!!\n\nVeja no cronograma de vacinação abaixo qual data esta sua faixa de idade"
					+ "\ne já anote na sua agenda."
					+ "\nEstamos ansiosos para que você tome a sua vacina!!!\nAh, não se esqueça também de anotar o posto central da sua região!\n"
					+ "\n************************************* CRONOGRAMA DE VACINAÇÃO *************************************"
					+ "\nEntre 12 e 17 anos -------> 23 a 5 de setembro(com deficiência e comorbidades)\n***************************************************************************************************\n"
					+ "\nLOCAL DE VACINAÇÃO:"
					+ "\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Sé\nEndereço: Rua Frederico Alvarenga, nº 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}
				
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 1 && user1.getIdade() >= 37){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do município de São Paulo a partir dos 37 anos podem se vacinar!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Sé\nEndereço: Rua Frederico Alvarenga, nº 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}
		
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 2 && user1.getIdade() >= 37){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do município de São Paulo a partir dos 37 anos podem se vacinar!"					
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Cruz das Almas\nEndereço: Rua Padre Feliciano Domingos, nº 90 - "
					+ "Freguesia do Ó - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}		
		
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 3 && user1.getIdade() >= 37){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do município de São Paulo a partir dos 37 anos podem se vacinar!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Carlos Gentile de Melo\nEndereço: Av dos Têxteis, nº 3765 - "
					+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}		
		
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 4 && user1.getIdade() >= 37){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do município de São Paulo a partir dos 37 anos podem se vacinar!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS São Vicente de Paula\nEndereço: Rua Vicente da Costa, nº 289 - "
					+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}			
		
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 5 && user1.getIdade() >= 37){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do município de São Paulo a partir dos 37 anos podem se vacinar!"
					+ "\n\nLOCAL DE VACINAÇÃO:\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Alto de Pinheiros"
					+ "\nEndereço: Av Queiróz Filho, nº 313 - "
					+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 1 && user1.getIdade() < 37 && user1.getIdade() >= 12){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nEstá quase lá!!!\n\nVeja no cronograma de vacinação abaixo qual data esta sua faixa de idade"
					+ "\ne já anote na sua agenda."
					+ "\nEstamos ansiosos para que você tome a sua vacina!!!\nAh, não se esqueça também de anotar o posto central da sua região!\n"
					+ "\n*************************************** CRONOGRAMA DE VACINAÇÃO ***************************************"
					+ "\nEntre 35 e 36 anos -------> 15 a 18 de julho.\nEntre 30 e 34 anos -------> 19 de julho a 4 de agosto."
					+ "\nEntre 25 e 29 anos -------> 5 a 12 de agosto.\nEntre 18 e 24 anos -------> 13 a 20 de agosto."
					+ "\nEntre 15 e 17 anos -------> 6 a 19 de setembro.\nEntre 12 e 14 anos -------> 20 a 30 de setembro."
					+ "\\n*Gestantes entre 12 e 17 anos -------> 23 de agosto a 5 de setembro."
					+ "\n*******************************************************************************************************\n"
					+ "\nLOCAL DE VACINAÇÃO:"
					+ "\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Sé\nEndereço: Rua Frederico Alvarenga, nº 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}
		
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 2 && user1.getIdade() < 37 && user1.getIdade() >= 12){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nEstá quase lá!!!\n\nVeja no cronograma de vacinação abaixo qual data esta sua faixa de idade"
					+ "\ne já anote na sua agenda."
					+ "\nEstamos ansiosos para que você tome a sua vacina!!!\nAh, não se esqueça também de anotar o posto central da sua região!\n"
					+ "\n*************************************** CRONOGRAMA DE VACINAÇÃO ***************************************"
					+ "\nEntre 35 e 36 anos -------> 15 a 18 de julho.\nEntre 30 e 34 anos -------> 19 de julho a 4 de agosto."
					+ "\nEntre 25 e 29 anos -------> 5 a 12 de agosto.\nEntre 18 e 24 anos -------> 13 a 20 de agosto."
					+ "\nEntre 15 e 17 anos -------> 6 a 19 de setembro.\nEntre 12 e 14 anos -------> 20 a 30 de setembro."
					+ "\n*Gestantes entre 12 e 17 anos -------> 23 de agosto a 5 de setembro."
					+ "\n*******************************************************************************************************\n"
					+ "\nLOCAL DE VACINAÇÃO:"					
					+ "\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Cruz das Almas\nEndereço: Rua Padre Feliciano Domingos, nº 90 - "
					+ "Freguesia do Ó - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}		
		
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 3 && user1.getIdade() < 37 && user1.getIdade() >= 12){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nEstá quase lá!!!\n\nVeja no cronograma de vacinação abaixo qual data esta sua faixa de idade"
					+ "\ne já anote na sua agenda."
					+ "\nEstamos ansiosos para que você tome a sua vacina!!!\nAh, não se esqueça também de anotar o posto central da sua região!\n"
					+ "\n*************************************** CRONOGRAMA DE VACINAÇÃO ***************************************"
					+ "\nEntre 35 e 36 anos -------> 15 a 18 de julho.\nEntre 30 e 34 anos -------> 19 de julho a 4 de agosto."
					+ "\nEntre 25 e 29 anos -------> 5 a 12 de agosto.\nEntre 18 e 24 anos -------> 13 a 20 de agosto."
					+ "\nEntre 15 e 17 anos -------> 6 a 19 de setembro.\nEntre 12 e 14 anos -------> 20 a 30 de setembro."
					+ "\n*Gestantes entre 12 e 17 anos -------> 23 de agosto a 5 de setembro."
					+ "\n*******************************************************************************************************\n"
					+ "\nLOCAL DE VACINAÇÃO:"
					+ "\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Carlos Gentile de Melo\nEndereço: Av dos Têxteis, nº 3765 - "
					+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}		
		
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 4 && user1.getIdade() < 37 && user1.getIdade() >= 12){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nEstá quase lá!!!\n\nVeja no cronograma de vacinação abaixo qual data esta sua faixa de idade"
					+ "\ne já anote na sua agenda."
					+ "\nEstamos ansiosos para que você tome a sua vacina!!!\nAh, não se esqueça também de anotar o posto central da sua região!\n"
					+ "\n*************************************** CRONOGRAMA DE VACINAÇÃO ***************************************"
					+ "\nEntre 35 e 36 anos -------> 15 a 18 de julho.\nEntre 30 e 34 anos -------> 19 de julho a 4 de agosto."
					+ "\nEntre 25 e 29 anos -------> 5 a 12 de agosto.\nEntre 18 e 24 anos -------> 13 a 20 de agosto."
					+ "\nEntre 15 e 17 anos -------> 6 a 19 de setembro.\nEntre 12 e 14 anos -------> 20 a 30 de setembro."
					+ "\n*Gestantes entre 12 e 17 anos -------> 23 de agosto a 5 de setembro."
					+ "\n*******************************************************************************************************\n"
					+ "\nLOCAL DE VACINAÇÃO:"
					+ "\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS São Vicente de Paula\nEndereço: Rua Vicente da Costa, nº 289 - "
					+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}			
		
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 5 && user1.getIdade() < 37 && user1.getIdade() >= 12){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nEstá quase lá!!!\n\nVeja no cronograma de vacinação abaixo qual data esta sua faixa de idade"
					+ "\ne já anote na sua agenda."
					+ "\nEstamos ansiosos para que você tome a sua vacina!!!\nAh, não se esqueça também de anotar o posto central da sua região!\n"
					+ "\n*************************************** CRONOGRAMA DE VACINAÇÃO ***************************************"
					+ "\nEntre 35 e 36 anos -------> 15 a 18 de julho.\nEntre 30 e 34 anos -------> 19 de julho a 4 de agosto."
					+ "\nEntre 25 e 29 anos -------> 5 a 12 de agosto.\nEntre 18 e 24 anos -------> 13 a 20 de agosto."
					+ "\nEntre 15 e 17 anos -------> 6 a 19 de setembro.\nEntre 12 e 14 anos -------> 20 a 30 de setembro."
					+ "\nGestantes entre 12 e 17 anos -------> 23 de agosto a 5 de setembro.\n*******************************************************************************************************\n"
					+ "\nLOCAL DE VACINAÇÃO:"
					+ "\n\nSua região cadastrada foi a nº: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informações do posto de vacinação central para sua região:\n\nUBS Alto de Pinheiros"
					+ "\nEndereço: Av Queiróz Filho, nº 313 - "
					+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informações"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}		
		
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
