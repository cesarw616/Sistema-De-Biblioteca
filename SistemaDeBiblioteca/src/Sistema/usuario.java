package Sistema;

public class usuario {

	private String nome;
	private livro livroAlugado;
	
	
	public usuario(String nome) {
		this.nome = nome;
		this.livroAlugado = null;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public livro getLivroAlugado() {
		return livroAlugado;
	}


	public void setLivroAlugado(livro livroAlugado) {
		this.livroAlugado = livroAlugado;
	}
	
	public void alugarLivro(livro livro) {
		if (livro.isDisponivel()) {
			livroAlugado = livro;
			livro.setDisponivel(false);
			System.out.println(nome + "alugou o livro: " + livro.getTitulo());
		}else {
			System.out.println("O livro " + livro.getTitulo() + "não está disponivel.");
		}
	}
	
	public void devolverLivro() {
		if (livroAlugado != null) {
			livroAlugado.setDisponivel(true);
			System.out.println(nome + "desvolveu o livro: " + livroAlugado.getTitulo());
			livroAlugado = null;
		}else {
			System.out.println(nome + "não tem nunhum livro para devolver.");
		}
		
		
	}
	
	
}
