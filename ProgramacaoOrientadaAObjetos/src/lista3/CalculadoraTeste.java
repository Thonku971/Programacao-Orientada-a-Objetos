package lista3;

import java.util.Scanner;

public class CalculadoraTeste {

	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		
		String marca;
		String modelo; 
		String memoria;
		int opcao = 1;
		int valorA;
		int valorB;
		float valorAA;
		float valorBB;
		int resultado;
		float resultadoB;
		
		System.out.println("Informe a marca da calculadora.");
		marca = entrada.nextLine();
		System.out.println("Informe o modelo da calculadora.");
		modelo = entrada.nextLine();
		System.out.println("Informe a memoria da calculadora.");
		memoria = entrada.nextLine();
		
		Calculadora calculadora1 = new Calculadora(marca, modelo, memoria);
		
		while (opcao != 6)
		{
			System.out.println("Informe a operação que deseja.");
			System.out.println("1 - Informar as informações da calculadora.");
			System.out.println("2 - Somar.");
			System.out.println("3 - Subtrair.");
			System.out.println("4 - Multiplicar.");
			System.out.println("5 - Dividir.");
			System.out.println("6 - SAIR.");
			opcao = entrada.nextInt();
			
			switch(opcao)
			{
			case 1:
				System.out.println(calculadora1);
				break;
				
			case 2:
				System.out.println("Informe o primeiro valor");
				valorA = entrada.nextInt();
				System.out.println("Informe o segundo valor");
				valorB = entrada.nextInt();
				resultado = calculadora1.Soma(valorA, valorB);
				System.out.println("O resultado é : " + resultado);
				break;
				
			case 3:
				System.out.println("Informe o primeiro valor");
				valorA = entrada.nextInt();
				System.out.println("Informe o segundo valor");
				valorB = entrada.nextInt();
				resultado = calculadora1.Subtracao(valorA, valorB);
				System.out.println("O resultado é : " + resultado);
				break;
				
			case 4:
				System.out.println("Informe o primeiro valor");
				valorA = entrada.nextInt();
				System.out.println("Informe o segundo valor");
				valorB = entrada.nextInt();
				resultado = calculadora1.Multiplicacao(valorA, valorB);
				System.out.println("O resultado é : " + resultado);
				break;
				
			case 5:
				System.out.println("Informe o primeiro valor");
				valorAA = entrada.nextFloat();
				System.out.println("Informe o segundo valor");
				valorBB = entrada.nextFloat();
				resultadoB = calculadora1.Divisao(valorAA, valorBB);
				System.out.println("O resultado é : " + resultadoB);
				break;
				
			case 6:
				System.out.println("Obrigado por utilizar !!!");
				break;
			
			default:
				System.out.println("A opção inserida é inválida, por favor tente novamente");
				break;
				
			}
		}
		
		
		entrada.close();
		
	}
	
}
