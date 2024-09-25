package lista3;

import java.util.Scanner;

public class UtfTeste {

	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
	
		int opcao = 0;
		int velocidade = 0;
		Utf carro1 = new Utf(velocidade);
		
		
		while(opcao != 4)
		{
			System.out.println("Informe o que deseja .");
			System.out.println("1 - Mostrar a velociade .");
			System.out.println("2 - Aumentar a  velocidade .");
			System.out.println("3 - Diminuir a velocidade .");
			opcao = entrada.nextInt();
			
			switch(opcao)
			{
			   case 1:
				   System.out.println(carro1);
				   break;
				   
			   case 2:
				   System.out.println("O carro está acelerando .");
				   carro1.Acelera();
				   break;
				 
			   case 3:
				   System.out.println("O carro está acelerando .");
				   carro1.Frea();
				   break;

			   case 4:
				   System.out.println("Obrigado por utilizar !! .");
				   break;
				   
			   default:
				   System.out.println("Opção inválida, por favor tente novamente .");
				   break;
			}
		}
		
		entrada.close();
		
	}
	
}
