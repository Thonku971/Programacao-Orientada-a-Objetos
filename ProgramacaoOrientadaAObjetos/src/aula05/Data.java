package aula05;

public class Data {

	int ano;
	int mes;
	int dia;
	
	public Data(int ano, int mes, int dia)
	{
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		
	}
	
	public Data(int ano, int mes)
	{
		this(ano, mes, 1);
	}
	
	public Data(int dia)
	{
		this(2010, 1, dia);
	}
	
	public Data()
	{
		this(2010, 1, 1);
	}

	@Override
	public String toString() {
		return "Data : " + dia + "/" + mes + "/" + ano;
	}
	
}
