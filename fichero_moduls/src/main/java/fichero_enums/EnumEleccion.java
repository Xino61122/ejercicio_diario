package fichero_enums;

public enum EnumEleccion {

	ESCRIBIRDIARIO 		(1, "Escribir diario"),
	LEERDIARIO 			(2, "Leer diario"),
	ELIMINARDIARIO		(3, "Eliminar diario"),
	SALIR				(0, "Salir"),
	FINESCRIBIRDIARIO	(null, "FIN");
	
	private Integer numEleccion;
	private String textEleccion;
	
	private EnumEleccion(Integer numEleccion, String textEleccion) {
		this.numEleccion = numEleccion;
		this.textEleccion = textEleccion;
	}

	public String getTextEleccion() {
		return textEleccion;
	}

	public int getNumEleccion() {
		return numEleccion;
	}
	
}
