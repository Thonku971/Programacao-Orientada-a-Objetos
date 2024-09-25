package Aula02;

import java.util.Scanner;
public class PessoaEntrada {

	
	public static void main (String [] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		
		PessoaTeste pessoa1 = new PessoaTeste();
		PessoaTeste pessoa2 = new PessoaTeste();
		PessoaTeste pessoa3 = new PessoaTeste();
		PessoaTeste pessoa4 = new PessoaTeste();
		
		System.out.println("Informe o primeiro nome ");
		pessoa1.nome = entrada.nextLine();
		System.out.println("Informe a idade do/a:" + pessoa1.nome);
		pessoa1.idade = entrada.nextInt();
		System.out.println("Informe o peso do/a:" + pessoa1.nome);
		pessoa1.peso = entrada.nextDouble();
		
		entrada.nextLine();
		
		System.out.println("Informe o segundo nome ");
		pessoa2.nome = entrada.nextLine();
		System.out.println("Informe a idade do/a:" + pessoa2.nome);
		pessoa2.idade = entrada.nextInt();
		System.out.println("Informe o peso do/a:" + pessoa2.nome);
		pessoa2.peso = entrada.nextDouble();

		entrada.nextLine();

		System.out.println("Informe o terceiro nome ");
		pessoa3.nome = entrada.nextLine();
		System.out.println("Informe a idade do/a:" + pessoa3.nome);
		pessoa3.idade = entrada.nextInt();
		System.out.println("Informe o peso do/a:" + pessoa3.nome);
		pessoa4.peso = entrada.nextDouble();

		entrada.nextLine();

		System.out.println("Informe o quarto nome ");
		pessoa4.nome = entrada.nextLine();
		System.out.println("Informe a idade do/a:" + pessoa4.nome);
		pessoa4.idade = entrada.nextInt();
		System.out.println("Informe o peso do/a:" + pessoa4.nome);
		pessoa4.peso = entrada.nextDouble();		


		entrada.nextLine();

		entrada.close();
		
		System.out.println("Nome: " + pessoa1.nome + " tem idade igual a : " + pessoa1.idade + " e peso igual a : " + pessoa1.peso );
		System.out.println("Nome: " + pessoa2.nome + " tem idade igual a : " + pessoa2.idade + " e peso igual a : " + pessoa2.peso );
		System.out.println("Nome: " + pessoa3.nome + " tem idade igual a : " + pessoa3.idade + " e peso igual a : " + pessoa3.peso );
		System.out.println("Nome: " + pessoa4.nome + " tem idade igual a : " + pessoa4.idade + " e peso igual a : " + pessoa4.peso );
	}
}
