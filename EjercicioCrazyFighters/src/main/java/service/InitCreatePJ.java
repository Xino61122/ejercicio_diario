package service;

import java.util.ArrayList;
import java.util.List;

import entity.FighterPJ;
import enums.primaryPJ;

public class InitCreatePJ {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<FighterPJ> init(){
		primaryPJ PJ1 = primaryPJ.CACTUSSURFERO;
		primaryPJ PJ2 = primaryPJ.CUERVOMORTIFERO;
		primaryPJ PJ3 = primaryPJ.BASTONCILLOAFILLADO;
		List<FighterPJ> fighters = new ArrayList();
		fighters.add(new FighterPJ(PJ1.getName(),PJ1.getLevel(),PJ1.getLivePoints(),PJ1.getAttackPoints()));
		fighters.add(new FighterPJ(PJ2.getName(),PJ2.getLevel(),PJ2.getLivePoints(),PJ2.getAttackPoints()));
		fighters.add(new FighterPJ(PJ3.getName(),PJ3.getLevel(),PJ3.getLivePoints(),PJ3.getAttackPoints()));
	
		return fighters;
	}

}
