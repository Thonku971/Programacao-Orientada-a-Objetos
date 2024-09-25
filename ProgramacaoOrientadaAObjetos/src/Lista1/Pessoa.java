package Lista1;

import java.util.Scanner;

public class Pessoa {

	public static void main (String []args)
	{
		PessoaTeste pessoa1 = new PessoaTeste();
		PessoaTeste pessoa2 = new PessoaTeste();
		PessoaTeste pessoa3 = new PessoaTeste();
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe o nome da pessoa1:");
		pessoa1.nome = entrada.nextLine();		
		System.out.println("Informe o sexo da pessoa1:");
		pessoa1.sexo = entrada.nextLine();
		System.out.println("Informe o cpf da pessoa1:");
		pessoa1.cpf = entrada.nextInt();
		System.out.println("Informe a idade da pessoa1:");
		pessoa1.idade = entrada.nextInt();
		System.out.println("Informe a altura da pessoa1:");
		pessoa1.altura = entrada.nextDouble();
		System.out.println("Informe o peso da pessoa1:");
		pessoa1.peso = entrada.nextDouble();
		
		entrada.nextLine();
		
		System.out.println("Informe o nome da pessoa2:");
		pessoa2.nome = entrada.nextLine();		
		System.out.println("Informe o sexo da pessoa2:");
		pessoa2.sexo = entrada.nextLine();
		System.out.println("Informe o cpf da pessoa2:");
		pessoa2.cpf = entrada.nextInt();
		System.out.println("Informe a idade da pessoa2:");
		pessoa2.idade = entrada.nextInt();
		System.out.println("Informe a altura da pessoa2:");
		pessoa2.altura = entrada.nextDouble();
		System.out.println("Informe o peso da pessoa2:");
		pessoa2.peso = entrada.nextDouble();
		
		entrada.nextLine();

		System.out.println("Informe o nome da pessoa3:");
		pessoa3.nome = entrada.nextLine();		
		System.out.println("Informe o sexo da pessoa3:");
		pessoa3.sexo = entrada.nextLine();
		System.out.println("Informe o cpf da pessoa3:");
		pessoa3.cpf = entrada.nextInt();
		System.out.println("Informe a idade da pessoa3:");
		pessoa3.idade = entrada.nextInt();
		System.out.println("Informe a altura da pessoa3:");
		pessoa3.altura = entrada.nextDouble();
		System.out.println("Informe o peso da pessoa3:");
		pessoa3.peso = entrada.nextDouble();

		entrada.nextLine();
		
		entrada.close();
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);

		pessoa1.Andar();
		pessoa1.Correr();
		pessoa1.Falar();
		pessoa1.Dormir();
		
		pessoa2.Andar();
		pessoa2.Correr();
		pessoa2.Falar();
		pessoa2.Dormir();
		
		pessoa3.Andar();
		pessoa3.Correr();
		pessoa3.Falar();
		pessoa3.Dormir();
		
	}
}
