import java.util.Scanner;

public class HolaUsuario {
	public static void main(String[] args) {
		String usuario = "Marta";
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Introduce tu nombre: ");
		
		usuario = leer.next();
		
		System.out.println("Hola, " + usuario);
	}
}