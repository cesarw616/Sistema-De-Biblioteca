package Sistema;
import java.util.Scanner;


public class Main {

	public Main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Scanner scanner = new Scanner (System.in);
		
		biblioteca.adicionarLivro(new livro ("O hobbit", "j.r.r. tolkien"));
		biblioteca.adicionarLivro(new livro ("1984", "George orwell"));
		biblioteca.adicionarUsuario(new usuario("alice"));
		biblioteca.adicionarUsuario(new usuario("Bob"));
		
		while (true) {
			System.out.println("1. alugar livro");
			System.out.println("2. devolver livro");
			System.out.println("3. sair");
			System.out.println("escolha uma opção:");
			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			if (opcao == 1) {
				System.out.print("digite o nome do usuario: ");
				String nomeUsuario = scanner.nextLine();
				usuario usuario = biblioteca.buscarUsuario(nomeUsuario);
				
				if (nomeUsuario != null) {
					System.out.println("digite o titulo do livro: ");
					String tituloLivro = scanner.nextLine();
					livro livro = biblioteca.buscarLivro(tituloLivro);
					
					if (livro != null) {
						usuario.alugarLivro(livro);
					}else {
						System.out.println("livro não encontrado. ");
					}
				}else {
					System.out.println("usuario não encontrado.");
				}
			}else if (opcao == 2) {
				System.out.print("digite o nome do usuario");
				String nomeUsuario = scanner.nextLine();
				usuario usuario = biblioteca.buscarUsuario(nomeUsuario);
				
				if (usuario != null) {
					usuario.devolverLivro();
				}else {
					System.out.println("usuario não encontrado.");
				}
			}else if (opcao == 3) {
				System.out.println("saindo...");
				break;
			}else {
				System.out.println("opção invalida.");
			}
			
		}
		
		scanner.close();
		
	}
	
}
