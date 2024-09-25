package Lista1;

import java.util.Scanner;

public class Aluno {
	 
	 
	 public static void main (String []args)
	 {
		
		 Scanner entrada = new Scanner(System.in);
		 
		 AlunoTeste aluno1 = new AlunoTeste();
		 AlunoTeste aluno2= new AlunoTeste();
		 AlunoTeste aluno3 = new AlunoTeste();
		 int opcao = 1;
		 String nome;
		 
		 System.out.println("Informe o RA do primeiro aluno ");
		 aluno1.ra = entrada.nextLine();
		 System.out.println("Informe o nome do primeiro aluno ");
		 aluno1.nome = entrada.nextLine();
		 System.out.println("Informe o turno do primeiro aluno ");
		 aluno1.turno = entrada.nextLine();
		 System.out.println("Informe o período do primeiro aluno ");
		 aluno1.periodo = entrada.nextLine();
		 System.out.println("Informe a situação do primeiro aluno ");
		 aluno1.situacao = entrada.nextLine();
		 System.out.println("Informe o coeficiente do primeiro aluno ");
		 aluno1.coeficiente = entrada.nextDouble();

		 entrada.nextLine();

		 System.out.println("Informe o RA do segundo aluno ");
		 aluno2.ra = entrada.nextLine();
		 System.out.println("Informe o nome do segundo aluno ");
		 aluno2.nome = entrada.nextLine();
		 System.out.println("Informe o turno do segundo aluno ");
		 aluno2.turno = entrada.nextLine();
		 System.out.println("Informe o período do segundo aluno ");
		 aluno2.periodo = entrada.nextLine();
		 System.out.println("Informe a situação do segundo aluno ");
		 aluno2.situacao = entrada.nextLine();
		 System.out.println("Informe o coeficiente do segundo aluno ");
		 aluno2.coeficiente = entrada.nextDouble();

		 entrada.nextLine();		 
		 
		 System.out.println("Informe o RA do terceiro aluno ");
		 aluno3.ra = entrada.nextLine();
		 System.out.println("Informe o nome do terceiro aluno ");
		 aluno3.nome = entrada.nextLine();
		 System.out.println("Informe o turno do terceiro aluno ");
		 aluno3.turno = entrada.nextLine();
		 System.out.println("Informe o período do terceiro aluno ");
		 aluno3.periodo = entrada.nextLine();
		 System.out.println("Informe a situação do terceiro aluno ");
		 aluno3.situacao = entrada.nextLine();
		 System.out.println("Informe o coeficiente do terceiro aluno ");
		 aluno3.coeficiente = entrada.nextDouble();
	 
		 
		 while(opcao != 2)
		 {
			 entrada.nextLine();
			 System.out.println("Informe o nome do aluno que deseja consultar");
			 nome = entrada.nextLine();
			 switch (opcao)
			 {
			 case 1:
				 
				 if(nome.equals(aluno1.nome))
				 {
					 System.out.println(aluno1);
				 }
				 else if(nome.equals(aluno2.nome))
				 {
					 System.out.println(aluno2);
				 }
				 else if(nome.equals(aluno3.nome))
				 {
					 System.out.println(aluno3);
				 }
				 else
				 {
					 System.out.println("Aluno não encontrado");
				 }
				 
				 System.out.println("Deseja consultar outro aluno ?");
				 System.out.println(" 1 = Sim");
				 System.out.println("2 = não");
				 opcao = entrada.nextInt();
				 break;
				 
			 case 2:
				 System.out.println("Obrigado por utilizar!");
				 break;
				 
			 default:
				 System.out.println("Opção inválida.");
				 break;
			 }
			 
		 }
		 
		 
		 entrada.close();
	 }
}
