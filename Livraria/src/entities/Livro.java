package entities;

public class Livro {

	private String nome;
	private String autor;
	private double preco;

	public Livro(String nome, String autor, double preco) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco > 100) {
			this.preco = preco + (preco * 0.3);
		} else {
			this.preco = preco;
		}
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", autor=" + autor + ", preco=" + preco + "]";
	}

}
