package estructurasdecontrol;

import java.util.Scanner;

public class EjercicioPractico {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		
		int edad;
		String  genero=""  , armas = "si";
		
		System.out.println("Ingrese su Edad");
		edad=entrada.nextInt();
		System.out.println("Que Genero es Femenino  o Masculino");
		genero=entrada.nextLine();
		System.out.println("Porta alguna Arma de fuego o Corto Punsante");
		armas=entrada.nextLine();
		
		
		if(armas == "si") {
			System.out.println("No puede Entrar al Establecimiento");
		}if ( ) {
	}
		
			
		
		
		

	}

}
