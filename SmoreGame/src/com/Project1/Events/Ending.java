package com.Project1.Events;

import java.util.Scanner;
import com.Project1.PlayerInfo.Player;

public class Ending extends Senario{
	
	public Ending() {}
	
	public void endGame(Player user, Scanner in) {
		lifechoice(user,in);
	}
	
	public void lifechoice(Player user,Scanner in) {
		user.setScore(inventory.size());
		System.out.println("\n At long you have completed the Game " + user.getName() + "\n Here is your inventory of"
		+" colected items. \n"+ inventory);
		if(user.getScore()==7) {
			user.starLine();
			makeSmore(user,in);
		}else if(inventory.contains("Marshmellow") && inventory.contains("Chocolate") && inventory.contains("Graham Cracker")){
			user.starLine();
			bakeSmore( user ,  in);
		}else if(inventory.contains("Lighter") && inventory.contains("Lighter Fluid") && inventory.contains("Fire Wood")){
			user.starLine();
			makeFire( user,  in);
		}else
			user.starLine();
			noSmore(user , in);	
	}
	
	public void makeSmore(Player user, Scanner in) {
		System.out.println("\n YAYYY you have success fully won the game!!!"
				+ "\n you gather all the required material and handled yourself"
				+ "\n in a way that let your strengths prevail. GO YOU!! I "
				+ "\n hope you are able to relax and enjoy the nice fire"
				+ "\n while toasting your S'more thinking of how nice of "
				+ "\n a day it turned out to be!!");
		replayGame(user,  in);
	}
	
	public void makeFire(Player user, Scanner in) {
		System.out.println("\n AHH you were so close, however you did manage to"
				+ "\n get enough supplies to be able to make a fire. so you "
				+ "\n decide to just sit and relax, while the fire warms you "
				+ "\n and lights up you night. Even with no S'more it still"
				+ "\n turned out to be a nice day!");
		replayGame(user,  in);
	}
	
	public void bakeSmore(Player user , Scanner in) {
		System.out.println("\n So somehow you managed to gather all the ingredients"
				+ "\n needed to make a S'more however you do not have the material"
				+ "\n to make a fire.... But wait you quickly consult Dr.Google"
				+ "\n and it turns out you can make S'Mores in the oven so after a"
				+ "\n a little help from your Mom, you in no time are eating S'mores."
				+ "\n If only you could enjoy it by the fire.");		
		replayGame(user,  in);
	}
	
	public void noSmore(Player user, Scanner in) {
		System.out.println("\n Tooo Bad you can make a S'more or have the warmth of"
				+ "\n a nice Fire. You lost but with every loss comes another"
				+ "\n chance to succeed maybe try again. Maybe think differently "
				+ "\n regarding your choices. Or try a whole new character. The"
				+ "\n whole world is yours if you take it one day at a time and "
				+ "\n FOCUS ON YOUR STRENGTHS ");;
		replayGame(user,  in);
	}

	
	public void replayGame(Player user, Scanner in) {
		inventory.clear();
		System.out.println("\n\n" + user + " Try again to beat your score!!");
		int choice = 0;
		boolean cont = false;
		System.out.print("\n You Have completed the Game!!! \n Would you like to play again?"
				+ "\n Please enter (1) for YES (2) for NO");
		do {
			user.enterChoice();
			try {
			choice = Integer.parseInt(in.nextLine().trim());
			}catch(NumberFormatException ex) {
				user.useNumbers();
				replayGame(user, in);
			}
			if(choice == 1) {
				user.createNewPlayer(user, in);
				cont = false;
			}else if(choice == 2) {
				endCredits();
				cont = false;
			}else 
				cont = true;
		}while(cont);	
	}
	
	public void endCredits() {
		System.out.println("\n\n\n\n Thank you for playing!!!This game is Copyright by Ziegler.LCC"
				+ "\n Any attempt to dublicate this code is a Felony which is considered to be an "
				+ "\n act of piracy and is punishable by 5 years in prison and up to a $500,000 fine");
	}
}
