package ejercicio4;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File directorio = new File(".");
		contenidoDirectorio(directorio);
	}

	public static void contenidoDirectorio(File directorio) {
		try {
			File[] ficheros = directorio.listFiles();
			for (File fichero : ficheros) {
				if (fichero.isDirectory()) {
					System.out.println("DIRECTORIO --" + fichero.getCanonicalPath());
					contenidoDirectorio(fichero);
					
				} else {
					System.out.println("FICHERO ----" + fichero.getCanonicalPath());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
