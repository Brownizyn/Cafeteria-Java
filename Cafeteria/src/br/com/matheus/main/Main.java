package br.com.matheus.main;

import br.com.matheus.bebidas.Cafe;
import br.com.matheus.bebidas.Cha;
import br.com.matheus.lanches.Lanches;
//Importa as classes Cafe, Cha e Lanches de outros pacotes para que possam ser utilizadas nesta classe.

public class Main {
	// Declara a classe pública Main. Sendo pública, ela pode ser acessada de outros pacotes.

	public static void main(String[] args) {
		// Define o método main, que é o ponto de entrada para qualquer aplicação Java.
        // O parâmetro String[] args é uma array que recebe argumentos da linha de comando.
		
		Cafe objcafeExpresso = new Cafe("Cafe Expresso", 10, false);
		Cafe objcafeLeite = new Cafe("Cafe com Leite", 10, true);
		// Cria duas instâncias da classe Cafe. 'objcafeExpresso' é um café expresso sem leite e custa 10.
        // 'objcafeLeite' é um café com leite que também custa 10.
		
		Cha objchaBolhas = new Cha("Cha com Bolhas", 20, true, true);
		Cha objchaGelado = new Cha("Cha Gelado", 15, false, true);
		 // Cria duas instâncias da classe Cha. 'objchaBolhas' é um chá com bolhas e gelo, custando 20.
        // 'objchaGelado' é um chá gelado sem bolhas que custa 15.
		
		Lanches objLanche = new Lanches("Misto Quente", 7, 250);
		// Cria uma instância da classe Lanches. 'objLanche' é um misto quente que pesa 250 gramas e custa 7.
		
		objcafeExpresso.mostrarInfo();
		objcafeLeite.mostrarInfo();
		objchaBolhas.mostrarInfo();
		objchaGelado.mostrarInfo();
		objLanche.mostrarInfo();
		 // Chama o método mostrarInfo() em cada objeto criado.
        // Esse método imprime detalhes específicos de cada produto, como nome, preço, e características adicionais (como leite em cafés ou bolhas em chás).
	}

}
