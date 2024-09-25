package aula08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PessoaTeste {

	
	public static void main(String args[])
	{
		
		Scanner entrada = new Scanner(System.in);
		
		Pessoa pessoa1 = new Pessoa();
		Integer a;
		String b;

		
		try
		{
			System.out.println("Informe o nome");
			b = entrada.nextLine();
			pessoa1.setNome(b);
			System.out.println("Informe a idade");
			a = entrada.nextInt();
			pessoa1.setIdade(a);
			entrada.nextLine();
			System.out.println("Informe o cpf");
			a = entrada.nextInt();
			pessoa1.setCpf(a);
			entrada.nextLine();
			System.out.println("Informe o logradouro");
			b = entrada.nextLine();
			pessoa1.setLogradouro(b);
			System.out.println("Informe o número");
			a = entrada.nextInt();
			pessoa1.setNumero(a);
			entrada.nextLine();
			System.out.println("Informe o bairro");
			b = entrada.nextLine();
			pessoa1.setBairro(b);
			System.out.println("Informe a cidade");
			b = entrada.nextLine();
			pessoa1.setCidade(b);
			System.out.println("Informe o estado");
			b = entrada.nextLine();
			pessoa1.setEstado(b);
			System.out.println("Informe o cep");
			a = entrada.nextInt();
			pessoa1.setCep(a);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Entrada inválida");			
		}
		catch(Exception e)
		{
			System.out.println("Ocorreu um ERRO");
		}
		finally
		{
			System.out.println("Bora");
			System.out.println(pessoa1);
	    }
		
		entrada.close();
		
	}
	
}
