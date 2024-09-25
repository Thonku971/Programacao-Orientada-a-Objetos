package lista6;


public class BibliotecaTeste {

	public static void main(String[] args) {

		Biblioteca b1 = new Biblioteca();
	
		b1.adicionarNovaLivro(111, "Ab1111C", "João da Silva", "11-12-12", "Aoba");
		b1.adicionarNovaLivro(222, "AbC2222", "Judicreide", "11-04-12", "Batarde");
		b1.adicionarNovaLivro(333, "AbCrf4e33333dws", "José", "11-11-09", "Banoite");
		b1.adicionarNovaLivro(44, "Absxs4444444444C", "Janete", "10-11-12", "Aoba2");

		// conta 111 - João da Silva
		b1.verificarDisponivel("Ab1111C");
		b1.verificarDisponivel("AbC2222");
		b1.verificarDisponivel("AbCrf4e33333dws");
		b1.verificarDisponivel("Absxs4444444444C");
		
		b1.realizarEmpresta("Ab1111C", 2);
		b1.realizarEmpresta("AbC2222", 3);
		b1.realizarEmpresta("AbCrf4e33333dws", 4);
		b1.realizarEmpresta("Absxs4444444444C", 6);

		b1.realizarEmpresta("AbCrf4e33333dws", 4);
		b1.realizarEmpresta("Absxs4444444444C", 6);
		
		

		b1.verificarDisponivel("Ab1111C");
		b1.verificarDisponivel("AbC2222");
		b1.verificarDisponivel("AbCrf4e33333dws");
		b1.verificarDisponivel("Absxs4444444444C");

		b1.realizarDevolve("Ab1111C", 0);
		b1.realizarDevolve("AbC2222", 20);
		b1.realizarDevolve("AbCrf4e33333dws", 7);
		b1.realizarDevolve("Absxs4444444444C", 2);
		
		
		
		

		b1.verificarDisponivel("Ab1111C");
		b1.verificarDisponivel("AbC2222");
		b1.verificarDisponivel("AbCrf4e33333dws");
		b1.verificarDisponivel("Absxs4444444444C");
		}
	
}
