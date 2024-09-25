package lista4;

public class Data {

	protected int dia;
	protected int mes;
	protected int ano;
	
	protected Data(int dia, int mes, int ano)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	protected Data (int mes, int ano)
	{
		this(1, mes, ano);
	}
	
	protected Data (int dia)
	{
		this(dia, 01, 2019);
	}
	
	protected Data()
	{
		this(01, 01, 2019);
	}


	@Override
	public String toString() {
		return "Data :" + dia + "/" + mes + "/" + ano ;
	}

	
}

