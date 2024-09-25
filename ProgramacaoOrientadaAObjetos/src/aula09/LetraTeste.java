package aula09;

import java.util.InputMismatchException;
import java.util.Scanner;


public class LetraTeste {

	public static void main(String args[])
	{
	
		Scanner entrada = new Scanner(System.in);
		
		String a;
		String b;
		
		Letra teste = new Letra();
		
		try
		{
			System.out.println("Informe a primeira string");
			a = entrada.nextLine();
			System.out.println("Informe a segunda string");
			b = entrada.nextLine();
			
			teste.Compara(a, b);
			teste.Conta(a);
			teste.ConverteMin(a);
			teste.ConverteMai(a);
			teste.Conta(b);
			teste.ConverteMin(b);
			teste.ConverteMai(b);
	
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
	    }
	
		entrada.close();
		
	}
}

	
