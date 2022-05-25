package fichero_controller;

import fichero_enums.EnumEleccion;
import fichero_enums.enumDoDaily;
import fichero_service.FicheroMethods;
import fichero_service.IOfiles;
import fichero_view.MenuDaily;

public class DailyController {

	public static void DailyMenuElection(int election) {

		if (election == EnumEleccion.ESCRIBIRDIARIO.getNumEleccion()) {
			MenuDaily.printWriteInDaily();
			String text = "";
			text += FicheroMethods.writeDateText(text);
			while (!text.contains(EnumEleccion.FINESCRIBIRDIARIO.getTextEleccion())) {
				text += FicheroMethods.writeText(text);
			}
			text = FicheroMethods.replaceEndText(text);
			IOfiles.writeFile(enumDoDaily.CONTINUARDIARIO, text);

		} else if (election == EnumEleccion.LEERDIARIO.getNumEleccion()) {
			String textDaily = IOfiles.readFile();
			MenuDaily.printReaderDaily(textDaily);
		} else if (election == EnumEleccion.ELIMINARDIARIO.getNumEleccion()) {
			IOfiles.deleteFile();
			MenuDaily.printDeleteFile();
		} else if (election == EnumEleccion.SALIR.getNumEleccion()) {
			MenuDaily.printExitProgram();
			System.exit(0);
		} else {
			return;
		}

	}

	public static int scanInt() {
		int scIntElection = FicheroMethods.convertToInt();
		return scIntElection;
	}

}
