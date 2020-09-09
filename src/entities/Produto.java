package entities;

public class Produto {
	
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	public Produto(String nome, Double preco, Integer quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public void removerQuantidade(Integer numero) {
		
		quantidade = quantidade - numero;
		
	}
	
	public void adicionarQuantidade(Integer numero) {
		
		quantidade = quantidade+numero;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		if(preco>=0) {
		return preco;
		}else {
			System.out.println(" ");
			System.out.println("Entrada Inválida!");
			System.out.println(" ");
		}
		return preco;
	}

	public void setPreco(Double preco) {
		if(preco>=0) {
		this.preco = preco;
		}else {
			System.out.println(" ");
			System.out.println("Entrada Inválida!");
			System.out.println(" ");
		}
	}

	public Integer getQuantidade() {
		if (quantidade>=0) {
		return quantidade;
		}else {
			System.out.println(" ");
			System.out.println("Entrada Inválida!");
			System.out.println(" ");
		}
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		if (quantidade>0) {
		this.quantidade = quantidade;
		}else {
			System.out.println(" ");
			System.out.println("Entrada Inválida!");
			System.out.println(" ");
		}
	}


	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	

}
