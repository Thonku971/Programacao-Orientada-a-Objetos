package lista4;

public class DataTeste {

	public static void main(String args[])
	{
		Data data1 = new Data(1, 4, 2010);
		
		System.out.println(data1);
		
		Data data2 = new Data(5, 1990);
		
		System.out.println(data2);
		
		Data data3 = new Data(5);
		
		System.out.println(data3);
		
		Data data4 = new Data();
		
		System.out.println(data4);
		
		Feriado feriado1 = new Feriado();
		
		System.out.println(feriado1);
		
		Feriado feriado2 = new Feriado("Páscoa");
		
		System.out.println(feriado2);
		
		Feriado feriado3 = new Feriado(1, 8, 2019, "aeeeeeee");
		
		System.out.println(feriado3);
	}
	
}
