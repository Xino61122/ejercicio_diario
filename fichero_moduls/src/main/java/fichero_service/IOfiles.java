package fichero_service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import fichero_enums.enumDoDaily;

public class IOfiles {

	private static final File indexFile = new File("C://Users/user/GIT_pruebas/fichero_moduls/src/main/resources/diario.txt");

	public static void writeFile(enumDoDaily eleccion, String text) {

		if (eleccion == enumDoDaily.CONTINUARDIARIO) {
			try {
				FileWriter writeInFile = new FileWriter(indexFile, true);
				writeInFile.write(text);
				writeInFile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (eleccion == enumDoDaily.BORRARDIARIO) {
			System.out.println("Borrar Diario");
			// TODO borrar diario
		}
	}

	public static String readFile() {

		try {
			FileReader reader = new FileReader(indexFile);
			BufferedReader textTxt = new BufferedReader(reader);
			String textDiary = "";
			String aux = textTxt.readLine();
			while (aux != null) {
				textDiary += aux + "\n";
				aux = textTxt.readLine();
			}
			textTxt.close();
			return textDiary;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static void deleteFile() {
		try {			
			indexFile.delete();
		}catch (Exception e) {
			System.out.println("error");
		}
	}
	
}