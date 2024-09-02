package br.com.matheus.bebidas;

public class Cha extends Bebidas{
	// Esta linha declara uma classe chamada 'Cha' que herda de 'Bebidas'.
	private boolean Bolhas;  // Declara uma variável privada do tipo boolean chamada 'Bolhas' para indicar se o chá possui bolhas.

	private boolean gelo; // Declara uma variável privada do tipo boolean chamada 'gelo' para indicar se o chá é servido com gelo.

	
	
	public Cha(String nome, int preco, boolean bolhas, boolean gelo) {
		// Construtor da classe 'Cha'. Aceita nome, preço, presença de bolhas e de gelo como parâmetros.
		super(nome, preco); // Chama o construtor da superclasse 'Bebidas' com os parâmetros 'nome' e 'preco'.
		this.Bolhas = bolhas; // Atribui o valor do parâmetro 'bolhas' à variável de instância 'Bolhas
		this.gelo = gelo; // Atribui o valor do parâmetro 'gelo' à variável de instância 'gelo'.
	}


	public boolean isBolhas() {
		// Método getter para verificar o estado da variável 'Bolhas'.
		return Bolhas;
		// Retorna o valor atual da variável de instância 'Bolhas'.
	}


	public void setBolhas(boolean bolhas) {
		// Método setter para definir o estado da variável 'Bolhas'.
		this.Bolhas = bolhas;
		// Atribui o novo valor ao campo 'Bolhas'.
	}


	public boolean isGelo() {
		// Método getter para verificar o estado da variável 'gelo'.
		return gelo;
		// Retorna o valor atual da variável de instância 'gelo'.
	}


	public void setGelo(boolean gelo) {
		// Método setter para definir o estado da variável 'gelo'.
		this.gelo = gelo;
		// Atribui o novo valor ao campo 'gelo'.
	}


	@Override
	public void mostrarInfo() {
		 // Método sobrescrito para mostrar informações sobre o chá, incluindo nome, preço, presença de bolhas e de gelo.
		
		String detalheBolhas =  Bolhas ? "com bolhas" : "sem bolhas";
		 // Cria uma string baseada na condição de 'Bolhas' sendo verdadeira ou falsa.
		
        System.out.println("Mostrando informações do Cha...");
     // Imprime uma mensagem indicativa de que as informações serão mostradas.
        
        System.out.println(getNome() + " - " + detalheBolhas + ": R$" + getPreco() + "\n");
     // Imprime o nome, se possui bolhas, e o preço do chá.
        
        String detalheGelo =  gelo ? "com gelo" : "sem gelo";
     // Cria uma string baseada na condição de 'gelo' sendo verdadeira ou falsa.
        
        System.out.println(getNome() + " - " + detalheGelo + ": R$" + getPreco() + "\n");
     // Imprime novamente o nome, agora com a condição de gelo, e o preço do chá.
	}
	
	
}
