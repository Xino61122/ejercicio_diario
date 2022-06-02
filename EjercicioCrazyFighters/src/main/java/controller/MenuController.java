package controller;


import java.util.Scanner;

import enums.ErrorInt;
import enums.MenuCrazyFighters;
import service.TryService;
import view.FightView;
import view.MenuView;

public class MenuController {
	public static Scanner sc = new Scanner(System.in);
	public static void electionController() {
		String text = sc.next();
		int election = TryService.tryInt(text);
		
		if(election == MenuCrazyFighters.FIGHT.getElection()) {
			FightView.electionFighter();
		}else if(election == MenuCrazyFighters.FIGHTRANDOM.getElection()) {
			
		}else if(election == MenuCrazyFighters.SHOWFIGHTERS.getElection()) {
			
		}else if(election == MenuCrazyFighters.NEWFIGHTER.getElection()) {
			
		}else if(election == MenuCrazyFighters.EXIT.getElection()) {
			
		}else if(election == ErrorInt.ERRORINT.getNumError()) {
			MenuView.printElectionErrorInt();
		}else {
			MenuView.printElectionNotFound();
		}
		
		
	}
	
}
