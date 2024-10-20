package ejercicio1;

import java.io.File;
import java.io.IOException;

public class Main {
    static int totalDirectorios = 0;
    static int totalFicheros = 0;

    public static void main(String[] args) {
        File directorio = new File(".");
        
        if(directorio.isDirectory()) {
            System.out.println("================================");
        	System.out.println(directorio + " es un directorio");
        	contenidoDirectorio(directorio);
            System.out.println("================================");
            System.out.println("DIRECTORIOS " + totalDirectorios);        
            System.out.println("FICHEROS " + totalFicheros);
        } else {
        	System.out.println(directorio + " no es un directorio");
        }
        
        
    }

    public static void contenidoDirectorio(File directorio) {
        try {
            File[] ficheros = directorio.listFiles();
            for (File fichero : ficheros) {
                if (fichero.isDirectory()) {
                    System.out.println("  DIRECTORIO --" + fichero.getCanonicalPath());
                    totalDirectorios++;
                    contenidoDirectorio(fichero);
                } else {
                    System.out.println("FICHERO ----" + fichero.getCanonicalPath());
                    totalFicheros++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
