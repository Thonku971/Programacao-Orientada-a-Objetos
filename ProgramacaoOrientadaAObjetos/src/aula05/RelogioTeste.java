package aula05;

import java.util.Scanner;

public class RelogioTeste {

	public static void main(String args[])
	{
		
		Scanner entrada = new Scanner(System.in);
		
		Relogio relogio1 = new Relogio();
		String marca;
		int hora;
		int minuto;
		int opcao = 0;
		
		System.out.println("Informe a marca do rel�gio. ");
		marca = entrada.nextLine();
		
		relogio1.getMarca();
		relogio1.setMarca(marca);
		while (opcao == 0) 
		{
			System.out.println("Informe a hora");
			hora = entrada.nextInt();
			
			relogio1.getHora();
			relogio1.setHora(hora);
			
			System.out.println("Informe os minutos");
			minuto = entrada.nextInt();

			relogio1.getMinuto();
			relogio1.setMinuto(minuto);

			System.out.println(relogio1);
			
			System.out.println("Informe se deseja alterar o hor�rio do rel�gio");
			System.out.println("0 - Sim");
			System.out.println("Valor diferente de 0 - N�o");
			opcao = entrada.nextInt();
		}
			
		
		
		entrada.close();
	}
	
}
