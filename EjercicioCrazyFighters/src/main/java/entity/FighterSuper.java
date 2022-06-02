package entity;

public abstract class FighterSuper {

	protected String name;
	protected int level;
	protected int livePoints;
	protected int actualLivePoints;
	protected int attackPoints;

	protected FighterSuper(String name, int level, int livePoints, int attackPoints) {
		this.name = name;
		this.level = level;
		this.livePoints = (livePoints + 20) * this.level;
		this.attackPoints = attackPoints;
		this.actualLivePoints = this.livePoints;
	}

	public FighterSuper() {

	}

	public void actualLivePoints(int attack) {
		this.actualLivePoints -= attack;
	}

	public void levelUp() {
		this.level += 1;
		this.livePoints += 20;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLivePoints() {
		return livePoints;
	}

	public void setLivePoints(int livePoints) {
		this.livePoints = livePoints;
	}

	public int getAttackPoints() {
		return attackPoints;
	}

	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}

	public int getActualLivePoints() {
		return actualLivePoints;
	}

	public void setActualLivePoints(int actualLivePoints) {
		this.actualLivePoints = actualLivePoints;
	}

}
