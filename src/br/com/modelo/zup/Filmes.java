package br.com.modelo.zup;

import java.util.List;
import java.util.ArrayList;

public class Filmes extends Item {

	private String genero;
	private String duracao;
	private List<String> atores = new ArrayList<String>();

	public Filmes(String nome, String categoria, String genero, String duracao, List<String> atores) {
		super(nome, categoria);
		this.genero = genero;
		this.duracao = duracao;
		this.atores = atores;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public List<String> getAtores() {
		return atores;
	}

	public void setAtores(List<String> atores) {
		this.atores = atores;
	}

	@Override

	public String toString() {

		String modelo = "";
		modelo += "Nome do filme: " + super.getNome() + "\n";
		modelo += "Categoria: " + super.getCategoria() + "\n";
		modelo += "Genero: " + this.getGenero() + "\n";
		modelo += "Duração: " + this.getDuracao() + "\n";
		modelo += "Elencos: " + this.getAtores() ;
         
		return modelo;
	}
}
