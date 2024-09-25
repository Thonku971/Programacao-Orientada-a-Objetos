package lista3;

import java.util.Scanner;

public class FuncionariosTeste {

	
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		
		Funcionarios funcionario1 = new Funcionarios();
		
		int dia;
		int mes;
		int ano;
		String rua;
		String numero;
		String cidade;
		String estado;
		String bairro;
		int sexo;
		
		System.out.println("Informe o número de registro");
		funcionario1.numeroRegistro = entrada.nextLine();
		System.out.println("Informe o nome");
		funcionario1.nome = entrada.nextLine();
		System.out.println("Informe o setor");
		funcionario1.setor = entrada.nextLine();
		System.out.println("Informe o telefone");
		funcionario1.telefone = entrada.nextLine();
		System.out.println("Qual é o sexo?  0 - Masculino / 1 - Feminino .");
		sexo = entrada.nextInt();
		
		if(sexo == 0)
		{
			funcionario1.sexo = false;
		}
		else if(sexo == 1)
		{
			funcionario1.sexo = true;
		}
		
		entrada.nextLine();
		
		System.out.println("Informe o Endereço : ");
		System.out.println("Informe o estado");
		estado = entrada.nextLine();
		funcionario1.getEstado();
		funcionario1.setEstado(estado);
		System.out.println("Informe a cidade");
		cidade = entrada.nextLine();
		funcionario1.getCidade();
		funcionario1.setCidade(cidade);
		System.out.println("Informe o bairro");
		bairro = entrada.nextLine();
		funcionario1.getBairro();
		funcionario1.setBairro(bairro);
		System.out.println("Informe a rua");
		rua = entrada.nextLine();
		funcionario1.getRua();
		funcionario1.setRua(rua);
		System.out.println("Informe o número");
		numero = entrada.nextLine();
		funcionario1.getNumero();
		funcionario1.setNumero(numero);
		
		System.out.println("Informe a data de nascimento .");
		System.out.println("Informe o dia");
		dia = entrada.nextInt();
		System.out.println("Informe o mes");
		mes = entrada.nextInt();
		System.out.println("Informe o ano");
		ano = entrada.nextInt();
		
		funcionario1.Nascimento(dia, mes, ano);
		
		System.out.println(funcionario1);
		
		entrada.close();
		
	}
}
