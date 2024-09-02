package br.com.matheus.bebidas;

public class Bebidas {
	// Define a classe chamada 'Bebidas'.
	
	private String nome; // Declara uma variável privada do tipo String chamada 'nome'.
	private int preco;  // Declara uma variável privada do tipo int chamada 'preco'.
	
	public Bebidas(String nome, int preco) { 
		// Construtor da classe que inicializa um objeto 'Bebidas' com os valores 'nome' e 'preco'.
		super(); // Chama o construtor da classe pai (Object, por padrão).
		this.nome = nome;  // Atribui o valor do parâmetro 'nome' à variável de instância 'nome'.
		this.preco = preco; // Atribui o valor do parâmetro 'preco' à variável de instância 'preco'.
	}

	public String getNome() {
		// Método getter para a propriedade 'nome'.
		return nome;
		// Retorna o valor atual da variável de instância 'nome'.
	}

	public void setNome(String nome) {
		// Método setter para a propriedade 'nome'.
		this.nome = nome;
		// Define o valor da variável de instância 'nome' para o valor passado como parâmetro.
	}

	public int getPreco() {
		 // Método getter para a propriedade 'preco'.
		return preco;
		// Retorna o valor atual da variável de instância 'preco'.
	}

	public void setPreco(int preco) {
        // Método setter para a propriedade 'preco'.

		this.preco = preco;
        // Define o valor da variável de instância 'preco' para o valor passado como parâmetro.

	}
	
	public void mostrarInfo() {
		// Método para mostrar informações sobre o objeto 'Bebidas'.
		
	}
}
