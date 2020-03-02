package programa;

//import java.util.Scanner;

public class Electrodomestico 
{
	
	 static int precio = 100000;						//Definicion de atributos constantes
	 static char consumoenergetico = 'F';
	 static String color = "Blanco";
	 static int peso = 5;
	 
	 //static Scanner sc = new Scanner(System.in);
	 

	 
	 static int pfl =0;
	 static int pft =0;
	 static int pf =0;
	 
	 
	 
	 
	public Electrodomestico() // Constructor vacio
	{
		super();
		
		
	}
	
	
	public Electrodomestico(int precio, int peso) // Constructor con atributos precio y peso
	{
		super();
		Electrodomestico.precio = precio;
		Electrodomestico.peso = peso;
	}
	

	public Electrodomestico(int precio, char consumoengertico, String color, int peso) // Constructor con todos los atributos
	{
		super();
		Electrodomestico.precio = precio;
		Electrodomestico.consumoenergetico = consumoengertico;
		Electrodomestico.color = color;
		Electrodomestico.peso = peso;
	}

	
	public static int getPrecio() // Getters y Setters de la Superclase
	{
		return precio;
	}

	public static void setPrecio(int precio) 
	{
		Electrodomestico.precio = precio;
	}

	public static char getConsumoengertico() 
	{
		return consumoenergetico;
	}

	public static void setConsumoengertico(char consumoengertico)
	{
		Electrodomestico.consumoenergetico = consumoengertico;
	}

	public static String getColor()
	{
		return color;
	}

	public static void setColor(String color) 
	{
		Electrodomestico.color = color;
	}

	public static int getPeso() 
	{
		return peso;
	}

	public static void setPeso(int peso)
	{
		Electrodomestico.peso = peso;
	}
	
	//Metodos//
	//////////
	/////////
	////////
	///////
	//////
	/////
	////
	///
	//
	
	
	public void comprobarConsumoEnergetico (char letra) 
	{
		boolean ok = false;
		
			switch(letra) {
				case 'A':
				ok = true;
				precio = 100000;
				break;
			case 'B':
				ok = true;
				precio = 80000;
			break;
			case 'C':
				ok = true;
				precio = 60000;
			break;
			case 'D':
				ok= true;
				precio = 50000;
			break;
			case 'E':
				ok = true;
				precio = 30000;
			break;
			case 'F':
				ok = true;
				precio = 10000;
			break;
		}
		
		if(ok) {
			consumoenergetico = letra;
		}
	}

	
	public void comprobarColor(String color) 
	{
		if(color == "Negro" || color == "Azul"
				|| color == "Gris" || color == "Rojo") {
				Electrodomestico.color = color;
			} else {
				color = "Blanco";
			}		
	}
	
	public int precioFinal() 
	{
		Television te = new Television();
		Lavadora la = new Lavadora();
		int laar = la.precioFinal();
		int teer = te.precioFinal();
			
		pf = teer+laar;
		

		System.out.println("Precio Final: "+pf );
		return pf;
	}
	
	/*public void precioFinal() 
	{
		
		
		pf = (Lavadora.pfc)+(Television.pfr)+(Television.pfs)+precio;
		

		System.out.println("Precio Final: "+pf );
	}*/
	
	
	
	
}


