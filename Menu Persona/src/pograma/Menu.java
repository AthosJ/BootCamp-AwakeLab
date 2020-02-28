package pograma;


public class Menu extends Persona 
{
	static Persona objeto1 = new Persona();
	static Persona objeto2 = new Persona();
	static Persona objeto3 = new Persona();
	
	
	public static void main(String[] args) 
	{	
		System.out.println("MENU PRINCIPAL");
		System.out.println("---------------");
	
		do 
		{
			System.out.println("Ingrese su RUT");
			RUT = sc.nextLine();
			objeto1.setRUT(RUT);
			
			if (Persona.validarRut(RUT)==false) {
				System.out.println("Rut Invalido");
			}
		}
		while (Persona.validarRut(RUT)==false);
		
		System.out.println("Ingrese su Nombre");
		nombre = sc.next();
		objeto1.setNombre(nombre);
		
		System.out.println("Ingrese su Edad");
		edad = sc.nextInt();
		objeto1.setEdad(edad);
		
		System.out.println("Ingrese su Sexo (H o M)");
		sexo = sc.next();
		objeto1.setSexo(sexo);
		
		System.out.println("Ingrese su peso");
		peso = sc.nextInt();
		objeto1.setPeso(peso);
		
		System.out.println("Ingrese su Altura");
		altura = sc.nextFloat();
		objeto1.setAltura(altura);
		imc = (float) Persona.determinarIMC(edad, altura);
		
			if(Persona.esMayorDeEdad()==false) 
			{
			System.out.println("Es menor de edad");
			}
				else 
				{
					System.out.println("Es mayor de edad");
				}
		System.out.println("Informacion ingresada: ");
		System.out.println("---------------------");
		System.out.println("Persona 1");
		System.out.println("Rut: "+ objeto1.getRUT());
		System.out.println("Nombre: "+ objeto1.getNombre());
		System.out.println("Edad: "+ objeto1.getEdad());
		
		if(Persona.comprobarSexo(sexo)==true) 
		{
			if(objeto1.getSexo().equalsIgnoreCase("H")) 
				{
					System.out.println("Sexo Ingresado: Hombre");
				}
					else 
					{
						System.out.println("Sexo Ingresado: Mujer");
					}
		}
		System.out.println("Peso: "+ objeto1.getPeso());
		System.out.println("Altura: "+ objeto1.getAltura());
		
			if(imc==-1) 
			{
				System.out.println("IMC: Bajo Peso");
			}
				else if(imc==0)
				{
					System.out.println("IMC: Peso Normal");
					
				}
					else if(imc==1) 
					{
						System.out.println("IMC: Sobre Peso");
					}
			System.out.println("---------------");
			do 
			{
				System.out.println("Ingrese su RUT");
				RUT = sc.nextLine();
				objeto2.setRUT(RUT);
				
				if (Persona.validarRut(RUT)==false) {
					System.out.println("Rut Invalido");
				}
			}
			while (Persona.validarRut(RUT)==false);
			
			System.out.println("Ingrese su Nombre");
			nombre = sc.next();
			objeto2.setNombre(nombre);
			
			System.out.println("Ingrese su Edad");
			edad = sc.nextInt();
			objeto2.setEdad(edad);
			
			System.out.println("Ingrese su Sexo (H o M)");
			sexo = sc.next();
			objeto2.setSexo(sexo);
			
			System.out.println("Ingrese su peso");
			peso = sc.nextInt();
			objeto2.setPeso(peso);
			
			System.out.println("Ingrese su Altura");
			altura = sc.nextFloat();
			objeto2.setAltura(altura);
			imc = (float) Persona.determinarIMC(edad, altura);
			
				if(Persona.esMayorDeEdad()==false) 
				{
				System.out.println("Es menor de edad");
				}
					else 
					{
						System.out.println("Es mayor de edad");
					}
			System.out.println("Informacion ingresada: ");
			System.out.println("---------------------");
			System.out.println("Persona 1");
			System.out.println("Rut: "+ objeto2.getRUT());
			System.out.println("Nombre: "+ objeto2.getNombre());
			System.out.println("Edad: "+ objeto2.getEdad());
			
			if(Persona.comprobarSexo(sexo)==true) 
			{
				if(objeto2.getSexo().equalsIgnoreCase("H")) 
					{
						System.out.println("Sexo Ingresado: Hombre");
					}
						else 
						{
							System.out.println("Sexo Ingresado: Mujer");
						}
			}
			System.out.println("---------------");
			do 
			{
				System.out.println("Ingrese su RUT");
				RUT = sc.nextLine();
				objeto3.setRUT(RUT);
				
				if (Persona.validarRut(RUT)==false) {
					System.out.println("Rut Invalido");
				}
			}
			while (Persona.validarRut(RUT)==false);
			
			System.out.println("Ingrese su Nombre");
			nombre = sc.next();
			objeto3.setNombre(nombre);
			
			System.out.println("Ingrese su Edad");
			edad = sc.nextInt();
			objeto3.setEdad(edad);
			
			System.out.println("Ingrese su Sexo (H o M)");
			sexo = sc.next();
			objeto3.setSexo(sexo);
			
			System.out.println("Ingrese su peso");
			peso = sc.nextInt();
			objeto3.setPeso(peso);
			
			System.out.println("Ingrese su Altura");
			altura = sc.nextFloat();
			objeto3.setAltura(altura);
			imc = (float) Persona.determinarIMC(edad, altura);
			
				if(Persona.esMayorDeEdad()==false) 
				{
				System.out.println("Es menor de edad");
				}
					else 
					{
						System.out.println("Es mayor de edad");
					}
			System.out.println("Informacion ingresada: ");
			System.out.println("---------------------");
			System.out.println("Persona 1");
			System.out.println("Rut: "+ objeto3.getRUT());
			System.out.println("Nombre: "+ objeto3.getNombre());
			System.out.println("Edad: "+ objeto3.getEdad());
			
			if(Persona.comprobarSexo(sexo)==true) 
			{
				if(objeto3.getSexo().equalsIgnoreCase("H")) 
					{
						System.out.println("Sexo Ingresado: Hombre");
					}
						else 
						{
							System.out.println("Sexo Ingresado: Mujer");
						}
			}
			System.out.println("Peso: "+ objeto3.getPeso());
			System.out.println("Altura: "+ objeto3.getAltura());
			
				if(imc==-1) 
				{
					System.out.println("IMC: Bajo Peso");
				}
					else if(imc==0)
					{
						System.out.println("IMC: Peso Normal");
						
					}
						else if(imc==1) 
						{
							System.out.println("IMC: Sobre Peso");
						}
	}
}
