package aula08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraTeste {

	
	public static void main(String args[])
	{
	
		Scanner entrada = new Scanner(System.in);
		
		Integer a;
		Integer b;
		
		Calculadora teste = new Calculadora();
		
		try
		{
			System.out.println("Informe o primeiro valor");
			a = entrada.nextInt();
			System.out.println("Informe o segundo valor");
			b = entrada.nextInt();
			
			teste.Soma(a, b);
			teste.Subtrai(a, b);
			teste.Multiplica(a, b);
			teste.Divide(a, b);
			teste.Potencia(a,b);
			teste.Inverso(a);
			teste.Raiz(a);
		}	
		catch(ArithmeticException ae)
		{
			System.out.println("Impossível dividir por 0");
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
