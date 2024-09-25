package lista6;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {

	private List<Livro> contas;

	public Biblioteca() {

		this.contas = new ArrayList<Livro>();
	}

	public void adicionarNovaLivro(Integer totalPaginas, String titulo, String autor, String anoPublicacao, String editora) {

		Livro conta = new Livro(totalPaginas, titulo, autor, anoPublicacao, editora);
		this.contas.add(conta);
	}

	public void verificarDisponivel(String titulo) {

		for (Livro conta : contas) {

			if (conta.getTitulo().equals(titulo)) {

				conta.verificarDisponibilidade();
				break;
			}
		}
	}

	public void realizarEmpresta(String titulo, Integer data) {

		for (Livro conta : contas) {

			if (conta.getTitulo().equals(titulo)) {

				conta.realizarEmprestimo(data);
				break;
			}
		}
	}

	public void realizarDevolve(String titulo, Integer data) {

		for (Livro conta : contas) {

			if (conta.getTitulo().equals(titulo)) {

				conta.realizarDevolucao(data);
				break;
			}
		}
	}
}
	

