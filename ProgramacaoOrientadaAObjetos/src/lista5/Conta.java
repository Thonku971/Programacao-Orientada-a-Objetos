package lista5;

public class Conta extends Cliente{

	private PratoEntrada entrada;
	private PratoPrincipal principal;
	private PratoSobremesa sobremesa;
	private Double valorFim;
	

	public Conta(String nome, String cpf, PratoEntrada entrada, PratoPrincipal principal, PratoSobremesa sobremesa)
	{
		super(nome, cpf);
		this.entrada= entrada;
		this.principal= principal;
		this.sobremesa = sobremesa;
		
	}
	
	
	public void Entrada(PratoEntrada entrada)
	{
		this.entrada = entrada;
	}
	
	public void Principal(PratoPrincipal principal)
	{
		this.principal = principal;
	}
	
	public void Sobremesa(PratoSobremesa sobremesa)
	{
		this.sobremesa = sobremesa;
	}
	
	public void FecharConta()
	{
		if(entrada.getTem() == true && principal.getTem() == true)
		{	
			if(sobremesa.getTem() == true)
			{
				valorFim = entrada.getPreco() + principal.getPreco() + sobremesa.getPreco();
				valorFim = valorFim + (valorFim *0.1);
				System.out.println("Entrada = " + entrada.getNome() + " pre�o = " + entrada.getPreco() + "Principal = " + principal.getNome() + " pre�o = " + principal.getPreco() + "Sobremesa = " + sobremesa.getNome() + " pre�o = " + sobremesa.getPreco() + "Valor final = " + valorFim);
		    }
			else
			{
				valorFim = entrada.getPreco() + principal.getPreco();
				valorFim = valorFim + (valorFim *0.1);
				System.out.println("Entrada = " + entrada.getNome() + " pre�o = " + entrada.getPreco() + "Principal = " + principal.getNome() + " pre�o = " + principal.getPreco() + "Sobremesa = Nulo "  + " pre�o = 0000" + "Valor final = " + valorFim);
			}
		}	
		
		else if(entrada.getTem() == true && sobremesa.getTem() == true)
		{	
			valorFim = entrada.getPreco() + sobremesa.getPreco();
			valorFim = valorFim + (valorFim *0.1);
				System.out.println("Entrada = " + entrada.getNome() + " pre�o = " + entrada.getPreco() + "Principal = Nulo"+ " pre�o = 000" + "Sobremesa = " + sobremesa.getNome() + " pre�o =" + sobremesa.getPreco() + "Valor final = " + valorFim);
		}
		 
		else if(principal.getTem() == true && sobremesa.getTem() == true)
		{
			valorFim = principal.getPreco() + sobremesa.getPreco();
			valorFim = valorFim + (valorFim *0.1);
			System.out.println("Entrada = Nulo " + " pre�o = 00000" + "Principal = " + principal.getNome() + " pre�o = " + principal.getPreco() + "Sobremesa = " + sobremesa.getNome() + " pre�o =" + sobremesa.getPreco() + "Valor final = " + valorFim);
		}
		else if (entrada.getTem() == true)
		{
			valorFim = entrada.getPreco() ;
			valorFim = valorFim + (valorFim *0.1);
				System.out.println("Entrada = " + entrada.getNome() + " pre�o = " + entrada.getPreco() + "Principal = Nulo"+ " pre�o = 000" + "Sobremesa = Nulo "  + " pre�o = 0000" + "Valor final = " + valorFim);
		}
		else if(principal.getTem() == true)
		{
			valorFim = principal.getPreco() ;
			valorFim = valorFim + (valorFim *0.1);
				System.out.println("Entrada = Nulo "  + " pre�o = 00000" + "Principal = " + principal.getNome() + " pre�o =" + principal.getPreco() + "Sobremesa = Nulo "  + " pre�o = 0000" + "Valor final = " + valorFim);

		}
		else
		{
			valorFim = sobremesa.getPreco() ;
			valorFim = valorFim + (valorFim *0.1);
				System.out.println("Entrada = Nulo" + " pre�o = 000000000"  + "Principal = Nulo"+ " pre�o = 000" + "Sobremesa = " + sobremesa.getNome() + " pre�o = " + sobremesa.getPreco() + "Valor final = " + valorFim);

		}
	}
	
}
