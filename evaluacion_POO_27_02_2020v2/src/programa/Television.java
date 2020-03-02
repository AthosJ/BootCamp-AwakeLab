package programa;

public class Television extends Electrodomestico 
{

	
	static int resolucion =20; // Definicion de atributos de la clase Television
	static boolean sintonizadorTDT = false;
	 static int pfr =0;
	 static int pfs =0;
	
	
	public Television() // Constructor vacio
	{
		super();
	}
	
	

	public Television(int precio, int peso) // Constructor con los atributos precio y peso
	{
		super(precio, peso);
	}
	
	
	
	public Television(int precio, char consumoengertico, String color, int peso, int resolucion, // Constructor con todos los atributos
			boolean sintonizadorTDT) 
	{
		super(precio, consumoengertico, color, peso);
		Television.resolucion = resolucion;
		Television.sintonizadorTDT = sintonizadorTDT;
	}
	
	//Getters y Setters
	
	public int getResolucion() 
	{
		return resolucion;
	}



	public void setResolucion(int resolucion) 
	{
		Television.resolucion = resolucion;
	}



	public boolean isSintonizadorTDT() 
	{
		return sintonizadorTDT;
	}



	public void setSintonizadorTDT(boolean sintonizadorTDT)
	{
		Television.sintonizadorTDT = sintonizadorTDT;
	}

	
	
	// METODOS
	

	public int precioFinal() 
	{
		if (resolucion>40) 
		{
			pfr = precio+((int)(precio*0.3));

			if (sintonizadorTDT == true) 
			{
				pfs = pfr+50000;
				
				System.out.println("Precio Final Televisor(es): "+pfs);
				
				
			}
				else 
				{
					pfs = pfr;
					System.out.println("Precio Final Televisores(es): "+ pfs);
					
				}
			
		}
			else 
			{
				pfs = precio;
				System.out.println("Precio Final: "+pfs);
			}
		return pfs;
	}
	
	
	/*public void precioFinal() 
	{
		if (resolucion>40) 
		{
			pfr = precio+((int)(precio*0.3));

			if (sintonizadorTDT == true) 
			{
				pfs = pfr+50000;
				
				System.out.println("Precio Final Televisor(es): "+pfs);
				
				
			}
				else 
				{
					System.out.println("Precio Final Televisores(es): "+ pfr);
					
				}
			
		}
			else 
			{
				System.out.println("Precio Final: "+precio);
			}
	}*/
	
	
}


