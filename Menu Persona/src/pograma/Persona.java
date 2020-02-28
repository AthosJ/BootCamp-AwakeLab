package pograma;
import java.util.Scanner;
public class Persona 
{
	static protected String RUT;
	static protected String nombre;
	static protected int edad;
	static protected int peso;
	static protected float altura;
	static protected String sexo;
	static protected float imc=0;
	static Scanner sc = new Scanner(System.in);
	
	public Persona() 
	{
		super();
		
	}
	
	
	public Persona(String rUT, String nombre, int edad, String sexo)
	{
		super();
		RUT = rUT;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona(String rUT, String nombre, int edad, String sexo, int peso, float altura)
	{
		super();
		RUT = rUT;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		
	}
	


	public static String getRUT() {
		return RUT;
	}

	public static void setRUT(String rUT) {
		RUT = rUT;
	}

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Persona.nombre = nombre;
	}

	public static int getEdad() {
		return edad;
	}

	public static void setEdad(int edad) {
		Persona.edad = edad;
	}

	public static int getPeso() {
		return peso;
	}

	public static void setPeso(int peso) {
		Persona.peso = peso;
	}

	public static double getAltura() {
		return altura;
	}

	public static void setAltura(float altura) {
		Persona.altura = altura;
	}

	public static String getSexo() {
		return sexo;
	}

	public static void setSexo(String sexo) {
		Persona.sexo = sexo;
	}

	//METODOS
	////////////////////////////////
	///////////////////////////////
	/////////////////////////////
	//METODOS
	
	
	
	public static double determinarIMC(int peso, float altura) 
	{
		imc=(float) (peso/ Math.pow(altura, 2));
		if (imc<20) 
		{
			return -1;
		}
			else if (imc>=20 && imc <=25)
			{
				return 0;
			}
				else 
				{
					return 1;
				}
		
	}
	

	public static boolean esMayorDeEdad()
	{		
		if (edad>=18)
			return true;
		else
			return false;		
	}
	
	
	public static boolean comprobarSexo(String sexo)
	{
		if(sexo.equalsIgnoreCase("H")||sexo.equalsIgnoreCase("M"))
		{
			return true;
		}
			else 
			{
				return false;
			}		
	}
	
	
	
	public static boolean validarRut(String rut) 
	{

		boolean validacion = false;
		try 
		{
		rut =  rut.toUpperCase();
		rut = rut.replace(".", "");
		rut = rut.replace("-", "");
		int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

		char dv = rut.charAt(rut.length() - 1);

		int m = 0, s = 1;
			for (; rutAux != 0; rutAux /= 10) 
			{
				s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
			}
				if (dv == (char) (s != 0 ? s + 47 : 75)) 
				{
				validacion = true;
				}

		} catch (java.lang.NumberFormatException e) 
		{
		} catch (Exception e) 
		{
		}
		return validacion;
	}
	
	
	
	public static String toString(String rut, String nombre, int edad, String sexo, int peso, float altura) 
	{
		return rut;
	}
	
}
