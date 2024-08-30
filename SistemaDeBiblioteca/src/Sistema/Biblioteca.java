package Sistema;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<usuario> usuarios;
	private ArrayList<livro> livros;
	
	public Biblioteca() {
		livros = new ArrayList<livro>();
		usuarios = new ArrayList<usuario>();
	}

	public ArrayList<usuario> getUsuario() {
		return usuarios;
	}

	public void setUsuario(ArrayList<usuario> usuario) {
		this.usuarios = usuario;
	}

	public ArrayList<livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<livro> livros) {
		this.livros = livros;
	}
	
	public void adicionarLivro(livro livro) {
		
		livros.add(livro);
		System.out.println("livro adicionado: " + livro.getTitulo());
		
	}
	
	public void adicionarUsuario(usuario usuario) {
		
		usuarios.add(usuario);
		System.out.println("usuario cadastrado: " + usuario.getNome());
		
	}
	
	public livro buscarLivro(String titulo) {
		
		for (livro livro: livros) {
			if (livro.getTitulo().equals(titulo)) {
				return livro;
			}
		}
		
		return null;
	}
	
	public usuario buscarUsuario(String nome) {
		
		for (usuario usuario: usuarios) {
			if (usuario.getNome().equals(nome)) {
				return usuario;
			}
		}
		
		return null;
	}
	
}
