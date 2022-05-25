package fichero_view;

import fichero_controller.DailyController;
import fichero_enums.EnumEleccion;
import fichero_main.MainFiles;

public class MenuDaily {

	public static void printMenuDaily() {

		System.out.println();
		System.out.println("########### DIARIO #############");
		System.out.println();
		System.out.println(EnumEleccion.ESCRIBIRDIARIO.getNumEleccion() + " - "
				+ EnumEleccion.ESCRIBIRDIARIO.getTextEleccion() + ".");
		System.out.println(
				EnumEleccion.LEERDIARIO.getNumEleccion() + " - " + EnumEleccion.LEERDIARIO.getTextEleccion() + ".");
		System.out.println(
				EnumEleccion.ELIMINARDIARIO.getNumEleccion() + " - " + EnumEleccion.ELIMINARDIARIO.getTextEleccion() + ".");
		System.out.println(
				EnumEleccion.SALIR.getNumEleccion() + " - " + EnumEleccion.SALIR.getTextEleccion() + ".");
		System.out.println();
		System.out.println("Tu elección");
		printEnterText();
		int election = DailyController.scanInt();
		DailyController.DailyMenuElection(election);

		MainFiles.main(null);

	}

	public static void printWriteInDaily() {
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("Escribe lo que deseas: (este proceso continuará hasta que pongas \"FIN\")");
	}

	public static void printNotFileSearch() {
		System.out.println();
		System.out.println("No se ha encontrado ningún texto en el diario.");
		System.out.println("Por favor, ingrese texto antes de leer el diario.");
	}
	
	public static void printReaderDaily(String textReader) {
		System.out.println(textReader);
	}

	public static void printEnterText() {
		System.out.print("--> ");
	}
	
	public static void printDeleteFile() {
		System.out.println();
		System.out.println("Diario eliminado.");
	}
	
	public static void printExitProgram() {
		System.out.println();
		System.out.println("Has salido del programa....");
		System.out.println("NOS VEMOS!!!!");
	}

}
