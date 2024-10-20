package ejercicio3;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		//Crear el directorio
		new File("NUEVODIR").mkdir();
		
		//Crear el fichero1
		File fichero1 = new File("NUEVODIR/fichero1.txt");        
        try {
            fichero1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //Crear fichero2
        File fichero2 = new File("NUEVODIR/fichero2.txt");        
        try {
            fichero2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //Renombrar fichero1
        new File("NUEVODIR/fichero1.txt").renameTo(new File("NUEVODIR/fichero1-Renombrado.txt"));    
        
        //Borrar fichero2
        fichero2.delete();
       
	}
}
