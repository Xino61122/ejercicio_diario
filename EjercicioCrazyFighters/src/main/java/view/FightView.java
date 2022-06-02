package view;

import controller.FighterController;

public class FightView {

	public static void electionFighter() {
		
		System.out.println("Seleccione un luchador disponible");
		System.out.println();
		System.out.println(FighterController.getFighters());
		System.out.println();
		System.out.print("-->");
		FighterController.electionFighterController();
	}

	public static void printBattleFight(String battleText) {
		System.out.println();
		System.out.println(battleText);		
	}
	
}
