package view;


import controller.MenuController;
import enums.MenuCrazyFighters;

public class MenuView {

	public static void mainMenu() {
		
		System.out.println("CRAZY FIGHTERS");
		System.out.println();
		System.out.println(MenuCrazyFighters.FIGHT.getElection()+"-"+MenuCrazyFighters.FIGHT.getText());
		System.out.println(MenuCrazyFighters.FIGHTRANDOM.getElection()+"-"+MenuCrazyFighters.FIGHTRANDOM.getText());
		System.out.println(MenuCrazyFighters.SHOWFIGHTERS.getElection()+"-"+MenuCrazyFighters.SHOWFIGHTERS.getText());
		System.out.println(MenuCrazyFighters.NEWFIGHTER.getElection()+"-"+MenuCrazyFighters.NEWFIGHTER.getText());
		System.out.println(MenuCrazyFighters.EXIT.getElection()+"-"+MenuCrazyFighters.EXIT.getText());		
		System.out.println();
		System.out.print("-->");
		MenuController.electionController();
		
	}

	public static void printElectionNotFound() {
		System.out.println();
		System.out.println("Debe elegir una opción correcta.");
	}
	
	public static void printElectionErrorInt() {
		System.out.println();
		System.out.println("Debe elegir un número.");
	}
	
}
