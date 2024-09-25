package Aula04;

import java.util.Scanner;

public class ExercicioMathTeste {

	
	public static void main(String args[])
	{
		
		Scanner entrada = new Scanner(System.in);
		
		ExercicioMath valor = new ExercicioMath();
		
		int opcao1 = 1;
		int opcao2 = 1;
		
		while(opcao1 != 2)
		{
			System.out.println("Deseja informar um valor ?");
			System.out.println(" 1 - Sim . ");
			System.out.println(" 2 - Não . ");
			opcao1 = entrada.nextInt();

			if(opcao1 == 1)
			{
	    		System.out.println("Informe o primeiro valor");
	    		valor.a = entrada.nextInt();
	    		System.out.println("Informe o segundo valor");
	    		valor.b = entrada.nextInt();
	    		
		    	while(opcao2 != 4)
			    {
		    		
		    		System.out.println("Informe a operação desejada");
		    		System.out.println("1 - Descobrir qual é o maior valor . ");
		    		System.out.println("2 - Descobrir a raiz quadrada do primeiro valor");
		    		System.out.println("3 - Descobrir o valor da potência (primeiro elevado ao segundo)");
		    		System.out.println("4 - SAIR!");
		    		opcao2 = entrada.nextInt();
				
		    		switch(opcao2)
		    		{
		    		  
	     	    		case 1 : 
	     	    			valor.Maior();
	     	    			break;
	     	    		
	     	    		case 2 :
	     	    			valor.Raiz();
	     	    			break;
	     	    			
	     	    		case 3 :
	     	    			valor.Potencia();
	     	    			break;
	     	    		
	     	    		case 4 :
	    		    		System.out.println("Obrigado por utilizar !");
	    		    		break;
	    		    		
	    		    	default :
	    		    		System.out.println("Insira uma opção válida . ");
	     	    			
		    		}
		    		
			    }
			}
			
			else
			{
				System.out.println("Obrigado por utilizar !");
			}
		}
		
		
		
		entrada.close();

	}
	
}
