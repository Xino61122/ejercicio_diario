package main;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

import view.MenuView;

public class crazyFightersMain {
	public static Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		logger.debug("entro en la clase main");
		MenuView.mainMenu();
		
	}

}
