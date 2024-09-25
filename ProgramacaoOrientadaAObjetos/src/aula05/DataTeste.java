package aula05;

import java.util.Scanner;

public class DataTeste {

	public static void main(String args[])
	{
		
		Scanner entrada= new Scanner(System.in);
		
		Data data1 = new Data();
		Data data2 = new Data();
		Data data3 = new Data();
		Data data4 = new Data();
		
		System.out.println("Informe o ano ");
		data1.ano = entrada.nextInt();
		System.out.println("Informe o mes ");
		data1.mes = entrada.nextInt();
		System.out.println("Informe o dia ");
		data1.dia = entrada.nextInt();
		
		System.out.println(data1);

		System.out.println("Informe o ano ");
		data2.ano = entrada.nextInt();
		System.out.println("Informe o mes ");
		data2.mes = entrada.nextInt();
		
		System.out.println(data2);

		System.out.println("Informe o dia ");
		data3.dia = entrada.nextInt();
		
		System.out.println(data3);

		
		System.out.println(data4);

		
		
		entrada.close();
	}
	
}
