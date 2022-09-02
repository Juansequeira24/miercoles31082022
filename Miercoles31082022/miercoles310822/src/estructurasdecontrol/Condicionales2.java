package estructurasdecontrol;

public class Condicionales2 {
	public static void main(String[] args) {
       //Condicional if (simple)
		
		byte edad = 100;
		String nombre = "Luis";
		boolean gameOver = true;
		
		if(!gameOver) {
			//Se ejecuta esto si la expresion es verdadera
			
			System.out.println(nombre + " Tiene " + edad + " anios de edad ");
	}
			//Condicional if else (doble)
			gameOver = false;
			String avenger = "Ironman";
			
			if (nombre == avenger) {
				System.out.println("Fin Del Juego");
			}else { 
				System.out.println("Pasa ala condicional anidada.");
			}
			
			//Condicional if else if (anidada)
			char semaforo = 'n';
			if (semaforo == 'r') {
				System.out.println("ALTO");
			} else if (semaforo == 'a') {
				System.out.println("PASE CON PRECAUCION");
				
			} else  if (semaforo == 'v') {
				System.out.println("SIGA");
			} else {
				System.out.println("NO HAY ENERGIA - SEMAFARO APAGADO");
				
			
			}
			
		}
}

