package Sistema;

public class livro {

	private String titulo;
	private String autor;
	private boolean disponivel;
	
	public livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	@Override
	public String toString() {
		return "livro{" + "titulo='" + titulo +'\'' + ", autor='" + autor + '\'' + ", disponivel=" + disponivel + '}';
	}
	
}
