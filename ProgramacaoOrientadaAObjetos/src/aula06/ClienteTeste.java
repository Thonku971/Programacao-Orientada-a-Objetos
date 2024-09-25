package aula06;

public class ClienteTeste {

	public static void main (String args[])
	{
		
		Cliente cliente1 = new Cliente();
		
		cliente1.getCodigo();
		cliente1.setCodigo(123);
		cliente1.getData();
		cliente1.setData("11/09/2000");
		cliente1.getEstadoCivil();
		cliente1.setEstadoCivil(ClienteEnum.Solteiro);
		cliente1.getNome();
		cliente1.setNome("Thomas Krevey Derkascz");
		
		System.out.println(cliente1);
		
		cliente1.getEstadoCivil();
		cliente1.setEstadoCivil(ClienteEnum.Casado);
		
		System.out.println(cliente1);
		
		cliente1.getEstadoCivil();
		cliente1.setEstadoCivil(ClienteEnum.Divorciado);
		
		System.out.println(cliente1);
		
		cliente1.getEstadoCivil();
		cliente1.setEstadoCivil(ClienteEnum.Viúvo);
		
		System.out.println(cliente1);

	}
	
}
