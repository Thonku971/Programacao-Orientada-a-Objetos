package Aula01;

import java.util.Scanner;

public class MaiorValor
{
	
	public static void main (String args[])
	{
		
		
		System.out.println("Informe o primeiro valor : ");
		try (Scanner scanner = new Scanner (System.in)) {
			int valor1 = scanner.nextInt();
			
			System.out.println("Informe o segundo valor : ");
			
			int valor2 = scanner.nextInt();
			
			System.out.println("Informe o terceiro valor : ");
			
			int valor3 = scanner.nextInt();
			
			System.out.println("Primeiro : " + valor1);
			System.out.println("Segundo : " + valor2);
			System.out.println("Terceiro : " + valor3);

			
			if(valor1 >  valor2 && valor1 > valor3)
			{
				System.out.println("O maior é o primeiro valor : " + valor1);
			}
			else if (valor2 > valor1 && valor2 > valor3)
			{
				System.out.println("O maior é o segundo valor : " + valor2);
			}
			else if (valor3 > valor1 && valor3 > valor2)
			{
				System.out.println("O maior é o terceiro valor : " + valor3);
			}
			else if(valor1 == valor2 && valor1 > valor3)
			{
				System.out.println("Os maiores valore são o primeiro: " + valor1 + " e o segundo : " + valor2);
			}
			else if(valor1 == valor3 && valor1 > valor2)
			{
				System.out.println("Os maiores valores são o primeiro : " + valor1 + " e o terceiro : " + valor3);
			}
			else if(valor2 == valor3 && valor2 > valor1)
			{
				System.out.println("Os maiores são o segundo : " + valor2 + " e o terceiro : " + valor3);
			}
			else
			{
				System.out.println("Os valores são iguais primeiro : " + valor1 + " segundo : " + valor2 + " terceiro : " + valor3);
			}
		}
		
	}
	
}