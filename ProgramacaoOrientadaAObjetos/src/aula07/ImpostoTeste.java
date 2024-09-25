package aula07;

import java.util.Scanner;

public class ImpostoTeste {

	public static void main(String args[])
	{
		
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		double valor1;
		int valor2;
		double valor3;
		int opcao;
		
		Imposto imposto1 = null;
		
		System.out.println("Informe a op��o");
		System.out.println("1 - Pessoa F�sica ");
		System.out.println("2 - Pessoa Jur�dica ");
		System.out.println("3 - Sair ");
		opcao = entrada.nextInt();

		entrada.nextLine();
		
		
		switch(opcao)
		{
		
		case 1:
			System.out.println("Informe o nome");
			nome = entrada.nextLine();
			System.out.println("Informe a renda anual ");
			valor1 = entrada.nextDouble();
			System.out.println("Informe o gasto com sa�de ");
			valor3 = entrada.nextDouble();
			imposto1 = new PessoaFisica(nome, valor1, valor3);
			imposto1.ValorTotal();
			imposto1.ValorArrecadado();
			System.out.println(imposto1);
			break;
			
		case 2:
			System.out.println("Informe o nome");
			nome = entrada.nextLine();
			System.out.println("Informe a renda anual ");
			valor1 = entrada.nextDouble();
			System.out.println("Informe o n�mero de funcion�rios ");
			valor2 = entrada.nextInt();
			imposto1 = new PessoaJuridica(nome, valor1, valor2);
			imposto1.ValorTotal();
			imposto1.ValorArrecadado();
			System.out.println(imposto1);
			break;
			
		case 3:
			System.out.println("Saindo");
			break;
	
		default:
			System.out.println("Inv�lido");
			break;
		}
		
		
		
		entrada.close();
		
	}
	
}	
	

