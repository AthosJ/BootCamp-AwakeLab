package programa;

public class Lavadora extends Electrodomestico
{
	

	static int carga = 5; //Definicion de atributo de la clase Lavadora
	static int pfc =0;
	
	
	public Lavadora() // Constructor vacio
	{
		super();
			
	}
	
	
	public Lavadora(int precio, int peso) //Constructor con atributos precio y peso
	{
		super(precio, peso);
		
	}
	
	
	public Lavadora(int precio, char consumoengertico, String color, int peso, int carga) //Constructor con todos los atributos
	{
		super(precio, consumoengertico, color, peso);
		Lavadora.carga = carga;
	}
	
	//Getters y Setters
	
	public int getCarga()
	{
		return carga;
	}


	public void setCarga(int carga) 
	{
		Lavadora.carga = carga;
	}
	
	//METODO
	
	
	

	public int precioFinal() 
	{
		
		if (carga>(peso=30)) 
		{
			pfc = precio+50000;
			System.out.println("Precio Final Lavadora(s): "+ pfc);
			
		}
			else
			{
				pfc=precio;
				System.out.println("Precio Final Lavadora(s): "+ pfc);
				
			}
		return pfc;
	}
	
	/*public void precioFinal() 
	{
		
		if (carga>(peso=30)) 
		{
			pfc = precio+50000;
			System.out.println("Precio Final Lavadora(s): "+ pfc);
			
		}
			else
			{
				System.out.println("Precio Final Lavadora(s): "+ precio);
				
			}
	}*/
	
}
