package lista5;

public class SessaoTeste {

	public static void main(String args[])
	{
	
    	Filme filme1 = new Filme("11/07/2021", "20:30", 55, 4, 55, 125.5 , "A volta dos que não foram");
	
    	
    	filme1.setVenda(10);
    	filme1.Calcula();
    	
    	System.out.println(filme1);
    	
        filme1.setVenda(15);
        filme1.Calcula();
        
    	System.out.println(filme1);
    
    	
        filme1.setVenda(50);
        filme1.Calcula();
        
    	System.out.println(filme1);
	}
	
		
	
	
}
