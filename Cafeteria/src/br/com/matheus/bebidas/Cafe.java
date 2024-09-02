package br.com.matheus.bebidas;

public class Cafe extends Bebidas{
	// Declara a classe 'Cafe' que herda da classe 'Bebidas'.
	
	private boolean temLeite; // Declara uma variável privada 'temLeite' do tipo boolean para indicar se o café possui leite ou não.

	public Cafe(String nome, int preco, boolean temLeite) {
		 // Construtor da classe 'Cafe'. Recebe parâmetros para nome, preço e se tem leite.
		
		super(nome, preco); // Chama o construtor da superclasse 'Bebidas' passando 'nome' e 'preco' como argumentos.
		this.temLeite = temLeite;  // Atribui o valor do parâmetro 'temLeite' à variável de instância 'temLeite'.
	}

	public boolean isTemLeite() {
		// Método getter que retorna o estado da variável 'temLeite'
		
		return temLeite;
		// Retorna o valor atual de 'temLeite'.
	}

	public void setTemLeite(boolean temLeite) {
		// Método setter para definir o estado de 'temLeite'.
		
		this.temLeite = temLeite;
		// Atribui o novo valor ao campo 'temLeite'.
	}

	@Override
	public void mostrarInfo() {
		// Método sobrescrito para exibir informações sobre o café.
		
		 String detalheLeite = temLeite ? "com leite" : "sem leite";
		// Cria uma string que depende do valor booleano de 'temLeite' para formular uma descrição.
		 
	        System.out.println("Mostrando informações do Café...");
	        // Imprime uma mensagem introdutória sobre a exibição de informações
	        
	        System.out.println(getNome() + " - " + detalheLeite + ": R$" + getPreco() + "\n");
	     // Imprime o nome do café, se tem leite ou não, e o preço do mesmo.
	}
	
	
}
