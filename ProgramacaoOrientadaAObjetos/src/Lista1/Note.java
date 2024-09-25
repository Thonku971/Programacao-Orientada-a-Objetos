package Lista1;

import java.util.Scanner;

public class Note {

	public static void main (String []args)
	{
		
		NoteTeste note1 = new NoteTeste();
		NoteTeste note2 = new NoteTeste();
		NoteTeste note3 = new NoteTeste();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a marca do primeiro notebook ");
	    note1.marca = entrada.nextLine();
		System.out.println("Informe o modelo do primeiro notebook ");
		note1.modelo = entrada.nextLine();
		System.out.println("Informe o processador do primeiro notebook ");
		note1.processador = entrada.nextLine();
		System.out.println("Informe a quantidade de memória RAM do primeiro notebook ");
		note1.memoria = entrada.nextInt();
		System.out.println("Informe a quantidade de armazenamento do primeiro notebook ");
		note1.armazenamento = entrada.nextInt();
		System.out.println("Informe o tamanho da tela do primeiro notebook ");
		note1.tela = entrada.nextDouble();
		
		entrada.nextLine();
		
		System.out.println("Informe a marca do segundo notebook ");
	    note2.marca = entrada.nextLine();
		System.out.println("Informe o modelo do segundo notebook ");
		note2.modelo = entrada.nextLine();
		System.out.println("Informe o processador do segundo notebook ");
		note2.processador = entrada.nextLine();
		System.out.println("Informe a quantidade de memória RAM do segundo notebook ");
		note2.memoria = entrada.nextInt();
		System.out.println("Informe a quantidade de armazenamento do segundo notebook ");
		note2.armazenamento = entrada.nextInt();
		System.out.println("Informe o tamanho da tela do segundo notebook ");
		note2.tela = entrada.nextDouble();
		
		entrada.nextLine();
		
		System.out.println("Informe a marca do terceiro notebook ");
	    note3.marca = entrada.nextLine();
		System.out.println("Informe o modelo do terceiro notebook ");
		note3.modelo = entrada.nextLine();
		System.out.println("Informe o processador do terceiro notebook ");
		note3.processador = entrada.nextLine();
		System.out.println("Informe a quantidade de memória RAM do terceiro notebook ");
		note3.memoria = entrada.nextInt();
		System.out.println("Informe a quantidade de armazenamento do terceiro notebook ");
		note3.armazenamento = entrada.nextInt();
		System.out.println("Informe o tamanho da tela do terceiro notebook ");
		note3.tela = entrada.nextDouble();
	
		entrada.nextLine();		
	
		entrada.close();
		
		System.out.println(note1);
		System.out.println(note2);
		System.out.println(note3);
		
		note1.Ligar();
		note1.Desligar();
		note1.Processar();
		note1.Conectar();
		
		note2.Ligar();
		note2.Desligar();
		note2.Processar();
		note2.Conectar();
		
		note3.Ligar();
		note3.Desligar();
		note3.Processar();
		note3.Conectar();
	}
}
