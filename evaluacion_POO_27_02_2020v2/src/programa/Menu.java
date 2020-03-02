package programa;
import java.util.Scanner;
public class Menu extends Electrodomestico
{
	
	
	public static void main(String[] args) 
	{
		int elec[] = new int[10];
		int E=0;
		int op = 0;
		Scanner sc = new Scanner(System.in);
		Television t = new Television(); // Objeto de Television para llamar al Set/Get
		Lavadora l = new Lavadora(); // Objeto de Lavadora para llamar al Set/Get
		int c = Lavadora.carga; // Asginacion de variable para 
		int r = Television.resolucion;
		Boolean ok = Television.sintonizadorTDT;
		int sn = 0;
		Electrodomestico a[] = new Electrodomestico[10];		
		Electrodomestico ele = new Electrodomestico();
	
			do 
			{
				System.out.println("---------Menu Principal------");
				System.out.println("-----------------------------");
				System.out.println("1. Ingresar Electrodomestico");
				System.out.println("2. Mostrar Precio Final");
				System.out.println("3. Salir");
				System.out.println("-----------------------------");
				op = sc.nextInt();
				
				for (int i=0;i<a.length;i++) 
				{
					
					switch (op) 
					{
					case 1:
						System.out.println("Ingrese el tipo de electrodomestico");
						System.out.println("1. Lavadora");
						System.out.println("2. Televisor");
						E = sc.nextInt();
						switch (E) 
						{
						case 1:
							System.out.println("Ingrese la carga de la Lavadora(Kg)");
							c= sc.nextInt();
							l.setCarga(c);
							
							
							break;
							
						case 2:
							
							System.out.println("Ingrese la resolucion de la Television (pulgadas)");
							r = sc.nextInt();
							t.setResolucion(r);
							
							System.out.println("Contiene un Sintonizador TDT?(true/false)");
							ok = sc.hasNextBoolean();
							if (ok==true) 
							{
								ok = sc.nextBoolean();
								t.setSintonizadorTDT(ok);
							}
							
							break;
							
						default:
							System.out.println("Ingrese una opcion valida");
						}
						break;
						
					case 2:
						
						ele.precioFinal();
						//l.precioFinal();
						//t.precioFinal();
						
						break;
					case 3:
						 System.out.println("Gracias por comprar en tiendas AthosMD");
						break;
					default:
						System.out.println("Ingrese una opcion valida");
					}		
					
				}
				
			}
			while (op!=3);
			
	}	

}
