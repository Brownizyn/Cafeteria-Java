package br.com.matheus.lanches;

public class Lanches {
	// Declara uma classe pública chamada 'Lanches'.
	
	private String nome;  // Declara uma variável privada do tipo String chamada 'nome'.
	private int preco;   // Declara uma variável privada do tipo int chamada 'preco'
	private int gramas; // Declara uma variável privada 'gramas' para armazenar o peso do lanche em gram
		// Essas variáveis são acessíveis apenas dentro desta classe
	

	public Lanches(String nome, int preco, int gramas) {
		// Construtor para a classe 'Lanches' que aceita 'nome', 'preco' e 'gramas' como parâmetros.
		
		super(); 
		this.nome = nome; // Atribui o valor do parâmetro 'nome' à variável de instância 'nome'.
		this.preco = preco; // Atribui o valor do parâmetro 'preco' à variável de instância 'preco'.
		this.gramas = gramas; // Atribui o valor do parâmetro 'gramas' à variável de instância 'gramas'.
		
	}
	
	



	public String getNome() {
		// Método getter para a propriedade 'nome'.
		
		return nome;
		// Retorna o valor atual da variável de instância 'nome'
	}





	public void setNome(String nome) {
		// Método setter para a propriedade 'nome'
		
		this.nome = nome;
		// Define o valor da variável de instância 'nome' para o valor passado como parâmetro.
	}





	public int getPreco() {
		// Método getter para a propriedade 'preco'.
		
		return preco;
		// Retorna o valor atual da variável de instância 'preco'.
	}





	public void setPreco(int preco) {
		// Método setter para a propriedade 'preco'
		
		this.preco = preco;
		// Define o valor da variável de instância 'preco' para o valor passado como parâmetro.
	}





	public int getGramas() {
		// Método getter que retorna o valor da variável 'gramas'.
		
		return gramas;
		// Retorna o valor atual de 'gramas'.
	}





	public void setGramas(int gramas) {
		// Método setter que define o valor da variável 'gramas'.
		
		this.gramas = gramas;
		 // Atribui o novo valor à variável de instância 'gramas'.
	}

	public void mostrarInfo() {
		 // Método  para mostrar informações sobre o lanche.
        System.out.println("Mostrando informações do Lanche...");
        // Imprime uma mensagem indicando que as informações do lanche estão sendo exibidas.
        System.out.println(getNome() + " - "  + ": R$" + getPreco() + "\n");
     // Imprime o nome e o preço do lanche. A gramagem não está sendo exibida.
	}
	
	
}
