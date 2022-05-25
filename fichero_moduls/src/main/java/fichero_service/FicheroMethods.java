package fichero_service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import fichero_enums.EnumEleccion;

public class FicheroMethods {

	private static Scanner sc = new Scanner(System.in);
	
	public static int convertToInt() {
		String selection = sc.next();
		try {
			int numElection = Integer.parseInt(selection);
			return numElection;
		} catch (Exception e) {
			return 0;
		}
	}
	
	public static String writeText(String textWriteUser) {
		textWriteUser = sc.nextLine();		
		textWriteUser += "\n";
		return textWriteUser;		
	}

	public static String replaceEndText(String textWriteUser) {
		return textWriteUser.replace(EnumEleccion.FINESCRIBIRDIARIO.getTextEleccion(), "");
	}
	
	public static String writeDateText(String textWriteUser) {
		LocalDate nowDay = LocalDate.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		textWriteUser += "~"+nowDay.format(format)+"~\n";		
		return textWriteUser;
	}
	
	
}
