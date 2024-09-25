package lista3;

import java.util.Scanner;

public class DisciplinasTeste {

	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		
		String codigo;
		String nome;
		String modalidade;
		float cargaHoraria;
		String conteudo;
		int opcao;

	
		System.out.println("Informe o conteúdo da disciplina .");
		conteudo = entrada.nextLine();
		System.out.println("Informe a carga horária da disciplina .");
		cargaHoraria = entrada.nextFloat();

		entrada.nextLine();

		Disciplinas disciplina1 = new Disciplinas(conteudo, cargaHoraria);
		
		System.out.println("Informe o código da disciplina");
		codigo = entrada.nextLine();
		disciplina1.getCodigo();
		disciplina1.setCodigo(codigo);

		System.out.println("Informe o nome da disciplina");
		nome = entrada.nextLine();
		disciplina1.getNome();
		disciplina1.setNome(nome);

		System.out.println("Informe a modalidade da disciplina   1 - Presencial    2 - EAD");
		opcao = entrada.nextInt();
		if(opcao == 1)
		{
			modalidade = "Presencial";
			disciplina1.getModalidade();
			disciplina1.setModalidade(modalidade);
		}
		else if (opcao == 2)
		{
			modalidade = "EAD";
			disciplina1.getModalidade();
			disciplina1.setModalidade(modalidade);
			
		}
		
		entrada.nextLine();
		
	
		
		
		entrada.close();
		
		System.out.println(disciplina1);
		
	}
	
}
