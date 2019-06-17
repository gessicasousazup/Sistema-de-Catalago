package br.com.teste.zup;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.modelo.zup.Filmes;
import br.com.modelo.zup.Livros;
import br.com.modelo.zup.Musicas;

public class TesteSistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite (1) adicionar filme ");
		System.out.println("Digite (2) adicionar livro ");
		System.out.println("Digite (3) adicionar musica ");
		int entrada = sc.nextInt();

		if (entrada == 1) {
			Scanner inputFilme = new Scanner(System.in);

			System.out.println("Nome do filme: ");
			String nome = inputFilme.nextLine();

			System.out.println("Categoria: ");
			String categoria = inputFilme.nextLine();

			System.out.println("Genero: ");
			String genero = inputFilme.nextLine();

			System.out.println("Tempo do filme: ");
			String duracao = inputFilme.nextLine();

			int entrada1 = 1;
			List<String> atores = new ArrayList<String>();

			while (entrada1 == 1) {
				Scanner scAtor = new Scanner(System.in);
				System.out.println("Nome do elenco: ");
				String novoAtor = scAtor.nextLine();

				atores.add(novoAtor);

				Scanner controle = new Scanner(System.in);
				System.out.println("Adicionar mais ator digite (1), sair digite (0) ");
				entrada1 = controle.nextInt();
			}

			Filmes filmes = new Filmes(nome, categoria, genero, duracao, atores);

			System.out.println("------------------------------------------------");
			System.out.println(filmes);

			// System.out.println("Elencos do filme são: " + atores);
			inputFilme.close();

		} else if (entrada == 2) {
			Scanner scLivro = new Scanner(System.in);

			System.out.println("Titulo do livro: ");
			String nome = scLivro.nextLine();

			System.out.println("Categoria: ");
			String categoria = scLivro.nextLine();

			System.out.println("Autor: ");
			String autor = scLivro.nextLine();

			System.out.println("Total de paginas: ");
			int paginas = scLivro.nextInt();

			Livros livro = new Livros(nome, categoria, autor, paginas);
			System.out.println("------------------------------------------------");
			System.out.println(livro);
			scLivro.close();

		} else if (entrada == 3) {
			Scanner scMusica = new Scanner(System.in);

			System.out.println("Nome da musica: ");
			String nome = scMusica.nextLine();

			System.out.println("Categoria: ");
			String categoria = scMusica.nextLine();

			System.out.println("Pertence a qual banda: ");
			String banda = scMusica.nextLine();

			System.out.println("Gênero: ");
			String genero = scMusica.nextLine();

			System.out.println("Nome do Vocalista: ");
			String cantor = scMusica.nextLine();

			Musicas musicas = new Musicas(nome, categoria, cantor, banda, genero);
			System.out.println("------------------------------------------------");
			System.out.println(musicas);

			scMusica.close();
		} else {
			System.out.println("Numero invalido!");
			sc.close();
		}

	}

}
