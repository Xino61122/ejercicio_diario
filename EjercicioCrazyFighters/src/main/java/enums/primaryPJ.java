package enums;

public enum primaryPJ {

	CACTUSSURFERO 			("Cactus Surfero", 1, 180, 13),
	CUERVOMORTIFERO			("Cuervo Mortífero", 2, 150, 18),
	BASTONCILLOAFILLADO		("Bastoncillo Afilado", 5, 160, 10);

	private String name;
	private int level;
	private int livePoints;
	private int attackPoints;
	
	private primaryPJ(String name, int level, int livePoints, int attackPoints) {
		this.name = name;
		this.level = level;
		this.livePoints = livePoints;
		this.attackPoints = attackPoints;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public int getLivePoints() {
		return livePoints;
	}

	public int getAttackPoints() {
		return attackPoints;
	}
	
	
	
}
