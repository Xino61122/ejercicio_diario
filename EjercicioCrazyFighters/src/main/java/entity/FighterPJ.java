package entity;

public class FighterPJ extends FighterSuper  {

	public FighterPJ(String name, int level, int livePoints, int attackPoints) {
		super(name, level, livePoints, attackPoints);
	}

	public FighterPJ() {
		super();
	}
	
	public int attackPower() {
		return (int) (this.attackPoints+(Math.round(Math.random()*5))*this.level);
	}
	
}
