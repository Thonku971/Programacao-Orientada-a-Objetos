package lista3;

import java.util.Scanner;

public class BancoTeste {

	public static void main(String Args[])
	{
		Scanner entrada = new Scanner(System.in);
		
		String numeroAgencia;
		String conta;
		float saldo;
		float valor;
		int opcao = 0;
		
		System.out.println("Informe o n�mero da ag�ncia.");
		numeroAgencia = entrada.nextLine();
		System.out.println("Informe o n�mero da conta.");
		conta = entrada.nextLine();
		System.out.println("Informe o saldo atual.");
		saldo = entrada.nextFloat();
		
		Banco banco1 = new Banco(numeroAgencia, conta, saldo);
		
		while(opcao != 4)
		{
			System.out.println("Informe a opera��o que deseja.");
			System.out.println("1 - Consultar dados.");
			System.out.println("2 - Fazer um dep�sito.");
			System.out.println("3 - Fazer um saque.");
			System.out.println("4 - Sair.");
			opcao = entrada.nextInt();
			
			switch(opcao)
			{
			case 1:
				System.out.println(banco1);
				break;
				
			case 2:
				System.out.println("Informe o valor a ser somado.");
				valor = entrada.nextFloat();
				banco1.Deposito(valor);
				break;
	
			case 3:
				System.out.println("Informe o valor a ser subtra�do.");
				valor = entrada.nextFloat();
				banco1.Saque(valor);
				break;

			case 4:
				System.out.println("Obrigado por utilizar.");
				break;

			default:
				System.out.println("Op��o inv�lida, por favor tente novamente");
				break;
				
			}
		}
		
		entrada.close();
	}
	
}
