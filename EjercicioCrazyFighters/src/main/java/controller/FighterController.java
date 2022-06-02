package controller;

import java.util.Scanner;

import enums.ErrorInt;
import service.InitCreatePJ;
import service.TakeCrazyFighters;
import service.TryService;
import view.FightView;
import view.MenuView;

public class FighterController {
	public static Scanner sc = new Scanner(System.in);
	private static int FighterElected = ErrorInt.ERRORINT.getNumError();

	public static void electionFighterController() {
		String text = sc.next();
		int election = TryService.tryInt(text);
		if (election > 0 && election <= InitCreatePJ.init().size() && FighterElected == ErrorInt.ERRORINT.getNumError()) {
			FighterElected = election-1;
			FightView.electionFighter();
		}else if(election > 0 && election <= InitCreatePJ.init().size()  && (election-1) != FighterElected){
			String battleText = TakeCrazyFighters.preparateFighters(FighterElected, (election-1));
			FightView.printBattleFight(battleText);
			MenuView.mainMenu();
		}else if (election == ErrorInt.ERRORINT.getNumError()) {
			MenuView.printElectionErrorInt();
			FightView.electionFighter();
		} else {
			MenuView.printElectionNotFound();
			FightView.electionFighter();
		}
	}

	public static String getFighters() {
		String text = TakeCrazyFighters.getAllFighters(FighterElected);
		return text;
	}

}
