package enums;

public enum MenuCrazyFighters {

	FIGHT			(1, "LUCHA"),
	FIGHTRANDOM		(2, "LUCHA RANDOM"),
	SHOWFIGHTERS	(3, "MOSTRAR LUCHADORES"),
	NEWFIGHTER		(4, "NUEVO LUCHADOR"),
	EXIT			(5, "SALIR");
	
	
	
	private int election;
	private String text;
	
	
	private MenuCrazyFighters(int election, String text) {
		this.election = election;
		this.text = text;
	}


	public int getElection() {
		return election;
	}


	public String getText() {
		return text;
	}
	
	
	
}
