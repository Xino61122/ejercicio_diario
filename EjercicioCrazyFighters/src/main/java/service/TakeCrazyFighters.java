package service;

import java.util.List;

import entity.FighterPJ;

public class TakeCrazyFighters {

	public static List<FighterPJ> fighters = InitCreatePJ.init();

	public static String getAllFighters(int bloqueado) {
		String text = "";
		for (int i = 0; i < InitCreatePJ.init().size(); i++) {
			if (bloqueado == i) {
				text += (i + 1) + "-" + fighters.get(i).getName() + "(Nv " + fighters.get(i).getLevel()
						+ ") (BLOQUEADO)\n";
			} else {
				text += (i + 1) + "-" + fighters.get(i).getName() + "(Nv " + fighters.get(i).getLevel() + ")\n";
			}
		}

		return text;
	}

	public static String preparateFighters(int myFighterNumber, int oponentFighterNumber) {
		FighterPJ myFighter = fighters.get(myFighterNumber);
		FighterPJ oponentFighter = fighters.get(oponentFighterNumber);
		double startBattle = Math.random();
		String text = "";
		if (startBattle > 0.5) {
			text = battleFighters(oponentFighter, myFighter);
		} else {
			text = battleFighters(myFighter, oponentFighter);
		}

		return text;
	}

	private static String battleFighters(FighterPJ firstFighter, FighterPJ secondFighter) {
		String text = "";
		int contador = 0;
		int damage = 0;
		
		while (firstFighter.getActualLivePoints() > 0 || secondFighter.getActualLivePoints() > 0) {
			contador++;
			damage = firstFighter.attackPower();
			secondFighter.actualLivePoints(damage);
			text += "\nTurno " + contador + "\n " + firstFighter.getName() + " : " + firstFighter.getActualLivePoints();
			text += "\n " + secondFighter.getName() + " : " + secondFighter.getActualLivePoints();
			text += "\n" + firstFighter.getName() + "ataca a " + secondFighter.getName() + "con un poder de "
					+ damage + " puntos.";
			if(secondFighter.getActualLivePoints() <= 0) {
				firstFighter.levelUp();
				text += "\n\n El ganador es " + firstFighter.getName()+", sube a nivel "+firstFighter.getLevel();
				break;
			}
			contador++;
			damage = secondFighter.attackPower();
			firstFighter.actualLivePoints(damage);
			text += "\nTurno " + contador + "\n " + firstFighter.getName() + " : " + firstFighter.getActualLivePoints();
			text += "\n " + secondFighter.getName() + " : " + secondFighter.getActualLivePoints();
			text += "\n" + firstFighter.getName() + "ataca a " + secondFighter.getName() + "con un poder de "
					+ damage + " puntos.";
			if(firstFighter.getActualLivePoints() <= 0) {
				secondFighter.levelUp();
				text += "\n\n El ganador es " + secondFighter.getName()+", sube a nivel "+secondFighter.getLevel();
				break;
			}
		}
		return text;
	}

}
