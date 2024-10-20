package ejercicio2;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fichero = new File("pruebaFichero.txt");
		System.out.println("Nombre del fichero: " + fichero.getName());
		System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
		System.out.print("¿Se puede escribir? " + fichero.canWrite());
		System.out.println(", ¿Y leer? " + fichero.canRead());
		System.out.println("Tamaño: " + fichero.length() + " bytes");
		System.out.println("Directorio padre: " + fichero.getParent());
		
		if(fichero.isFile()) {
			System.out.println("Es un archivo");
		} else if(fichero.isDirectory()) {
			System.out.println("Es un directorio");
		}
		
		
	}

}
