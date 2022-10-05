package psoft;

public class Produto {
	public Produto(String nome, String fabricante, Double preco) {
		super();
		this.nome = nome;
		this.fabricante = fabricante;
		this.preco = preco;
	}
	private String nome;
	private String fabricante;
	private Double preco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
