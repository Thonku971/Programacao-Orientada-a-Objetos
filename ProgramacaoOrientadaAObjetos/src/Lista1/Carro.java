package Lista1;

import java.util.Scanner;

public class Carro {

	
	public static void main(String []args)
	{
		CarroTeste carro1 = new CarroTeste();
		CarroTeste carro2 = new CarroTeste();
		CarroTeste carro3 = new CarroTeste();
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o modelo do carro1");
		carro1.modelo = entrada.nextLine();
		System.out.println("Informe a marca do carro1");
		carro1.marca = entrada.nextLine();
		System.out.println("Informe a cor do carro1");
		carro1.cor = entrada.nextLine();
		System.out.println("Informe o chassi do carro1");
		carro1.chassi = entrada.nextLine();
		System.out.println("Informe a placa do carro1");
		carro1.placa = entrada.nextLine();
		System.out.println("Informe o ano do carro1");
		carro1.ano = entrada.nextInt();
		System.out.println("Informe o renavam do carro1");
		carro1.renavam = entrada.nextInt();
		
		entrada.nextLine();
		

		System.out.println("Informe o modelo do carro2");
		carro2.modelo = entrada.nextLine();
		System.out.println("Informe a marca do carro2");
		carro2.marca = entrada.nextLine();
		System.out.println("Informe a cor do carro2");
		carro2.cor = entrada.nextLine();
		System.out.println("Informe o chassi do carro2");
		carro2.chassi = entrada.nextLine();
		System.out.println("Informe a placa do carro2");
		carro2.placa = entrada.nextLine();
		System.out.println("Informe o ano do carro2");
		carro2.ano = entrada.nextInt();
		System.out.println("Informe o renavam do carro2");
		carro2.renavam = entrada.nextInt();
		
		entrada.nextLine();

		System.out.println("Informe o modelo do carro3");
		carro3.modelo = entrada.nextLine();
		System.out.println("Informe a marca do carro3");
		carro3.marca = entrada.nextLine();
		System.out.println("Informe a cor do carro3");
		carro3.cor = entrada.nextLine();
		System.out.println("Informe o chassi do carro3");
		carro3.chassi = entrada.nextLine();
		System.out.println("Informe a placa do carro3");
		carro3.placa = entrada.nextLine();
		System.out.println("Informe o ano do carro3");
		carro3.ano = entrada.nextInt();
		System.out.println("Informe o renavam do carro3");
		carro3.renavam = entrada.nextInt();
		
		entrada.nextLine();
		
		entrada.close();
		
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
		
		carro1.Ligar();
		carro1.Acelerar();
		carro1.Frear();
		carro1.Desligar();
		
		carro2.Ligar();
		carro2.Acelerar();
		carro2.Frear();
		carro2.Desligar();
		
		carro3.Ligar();
		carro3.Acelerar();
		carro3.Frear();
		carro3.Desligar();
	}
}
