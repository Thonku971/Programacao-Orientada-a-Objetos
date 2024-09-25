package Lista2;

import java.util.Scanner;

public class Biblioteca {

	public static void main(String [] args)
	{
		String nome;
		int opcao = 1;
		
		BibliotecaTeste livro1 = new BibliotecaTeste();
		BibliotecaTeste livro2 = new BibliotecaTeste();
		BibliotecaTeste livro3 = new BibliotecaTeste();
		BibliotecaTeste livro4 = new BibliotecaTeste();
		BibliotecaTeste livro5 = new BibliotecaTeste();
		
		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("Informe o t�tulo do primeiro livro .");
		livro1.titulo = entrada.nextLine();
		System.out.println("Informe o autor do primeiro livro .");
		livro1.autor = entrada.nextLine();
		System.out.println("Informe a editora do primeiro livro .");
		livro1.editora = entrada.nextLine();
		System.out.println("Informe o n�mero de p�ginas do primeiro livro .");
		livro1.numPags = entrada.nextInt();
		System.out.println("Informe o ano de publica��o do primeiro livro .");
		livro1.anoPubli = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Informe o t�tulo do segundo livro .");
		livro2.titulo = entrada.nextLine();
		System.out.println("Informe o autor do segundo livro .");
		livro2.autor = entrada.nextLine();
		System.out.println("Informe a editora do segundo livro .");
		livro2.editora = entrada.nextLine();
		System.out.println("Informe o n�mero de p�ginas do segundo livro .");
		livro2.numPags = entrada.nextInt();
		System.out.println("Informe o ano de publica��o do segundo livro .");
		livro2.anoPubli = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Informe o t�tulo do terceiro livro .");
		livro3.titulo = entrada.nextLine();
		System.out.println("Informe o autor do terceiro livro .");
		livro3.autor = entrada.nextLine();
		System.out.println("Informe a editora do terceiro livro .");
		livro3.editora = entrada.nextLine();
		System.out.println("Informe o n�mero de p�ginas do terceiro livro .");
		livro3.numPags = entrada.nextInt();
		System.out.println("Informe o ano de publica��o do terceiro livro .");
		livro3.anoPubli = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Informe o t�tulo do quarto livro .");
		livro4.titulo = entrada.nextLine();
		System.out.println("Informe o autor do quarto livro .");
		livro4.autor = entrada.nextLine();
		System.out.println("Informe a editora do quarto livro .");
		livro4.editora = entrada.nextLine();
		System.out.println("Informe o n�mero de p�ginas do quarto livro .");
		livro4.numPags = entrada.nextInt();
		System.out.println("Informe o ano de publica��o do quarto livro .");
		livro4.anoPubli = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Informe o t�tulo do quinto livro .");
		livro5.titulo = entrada.nextLine();
		System.out.println("Informe o autor do quinto livro .");
		livro5.autor = entrada.nextLine();
		System.out.println("Informe a editora do quinto livro .");
		livro5.editora = entrada.nextLine();
		System.out.println("Informe o n�mero de p�ginas do quinto livro .");
		livro5.numPags = entrada.nextInt();
		System.out.println("Informe o ano de publica��o do quinto livro .");
		livro5.anoPubli = entrada.nextInt();
		
		entrada.nextLine();
		
		
		while(opcao != 4)
		{
			System.out.println("Informe a op��o que deseja .");
			System.out.println(" 1 - Emprestar Livro");
			System.out.println(" 2 - Devolver Livro");
			System.out.println(" 3 - Mostrar informa��es do Livro");
			System.out.println(" 4 - SAIR");
			opcao = entrada.nextInt();
			
			entrada.nextLine();
			switch(opcao)
			{
			case 1:
				System.out.println("Informe o nome do do livro que deseja emprestar .");
				nome = entrada.nextLine();
				if(nome.equals(livro1.titulo))
				{
					livro1.Empresta();
				}
				else if(nome.equals(livro2.titulo))
				{
					livro2.Empresta();
				}
				else if (nome.equals(livro3.titulo))
				{
					livro3.Empresta();
				}
				else if (nome.equals(livro4.titulo))
				{
					livro4.Empresta();
				}
				else if (nome.equals(livro5.titulo))
				{
					livro5.Empresta();
				}
				else
				{
					System.out.println("Livro n�o encontrado");
				}
				break;
				
			case 2:
				System.out.println("Informe o nome do do livro que deseja devolver .");
				nome = entrada.nextLine();
				if(nome.equals(livro1.titulo))
				{
					livro1.Devolve();
				}
				else if(nome.equals(livro2.titulo))
				{
					livro2.Devolve();
				}
				else if (nome.equals(livro3.titulo))
				{
					livro3.Devolve();
				}
				else if (nome.equals(livro4.titulo))
				{
					livro4.Devolve();
				}
				else if (nome.equals(livro5.titulo))
				{
					livro5.Devolve();
				}
				else
				{
					System.out.println("Livro n�o encontrado");
				}
				break;
				
			case 3:
				System.out.println("Informe o nome do do livro que deseja consultar .");
				nome = entrada.nextLine();
				if(nome.equals(livro1.titulo))
				{
					System.out.println(livro1);
				}
				else if(nome.equals(livro2.titulo))
				{
					System.out.println(livro2);
				}
				else if (nome.equals(livro3.titulo))
				{
					System.out.println(livro3);
				}
				else if (nome.equals(livro4.titulo))
				{
					System.out.println(livro4);
				}
				else if (nome.equals(livro5.titulo))
				{
					System.out.println(livro5);
				}
				else
				{
					System.out.println("Livro n�o encontrado");
				}
				break;
				
			case 4:
				System.out.println("Obrigado por utilizar !!");
				break;
				
			default:
				System.out.println("Op��o inv�lida, tente novamente");
				break;
			}
		}
		
		
		entrada.close();
	}
	
}
