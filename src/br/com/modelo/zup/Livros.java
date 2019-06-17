package br.com.modelo.zup;

public class Livros extends Item {

	private String autor;
	private int paginas;

	public Livros(String nome, String categoria, String autor, int paginas) {
		super(nome, categoria);
		this.autor = autor;
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override

	public String toString() {

		String modelo = "";
		modelo += "Titulo do Livro: " + super.getNome() + "\n";
		modelo += "Categoria: " + super.getCategoria() + "\n";
		modelo += "Autor: " + this.getAutor() + "\n";
		modelo += "Total de paginas: " + this.getPaginas() ;
		return modelo;

	}
}