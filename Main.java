package rpgPackage;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import rpgPackage.Player;

public class Main {
	//Initiating the main player
	static Player mainPlayer = new Player();
	static dmgItem dmgItem = new dmgItem();
	public static String sendText;

	
	public static void main(String[] args){
		startUp();
	}
	
	
	//function to set up some things before we start with the game
	@SuppressWarnings("resource")
	private static void startUp(){
		//Setting the player name
		System.out.println("Main.java startup.");
		Scanner startUpScan = new Scanner(System.in);
		RpgWindow.printOnScreen("What is your name adventurer.");
		//System.out.println("What is your name adventurer?");
		String mainPlayerName = startUpScan.nextLine();
		mainPlayer.setName(mainPlayerName);
		testGen();
	}

	
	static void testGen(){
		double random = Math.random();
		//System.out.println(random);
		if(random<0.16){
			sendText = "One room has been generated.";
			//System.out.println("One room has generated.");
		}else if(0.45>random && random>0.16){
			sendText = "Three rooms has been generated.";
			//System.out.println("Three rooms have generated.");
		}else if(random<1.0 && random>0.45){
			sendText = "Two rooms has been generated.";
			//System.out.println("Two rooms have generated.");
		}
		
	}

	
		
	


}
