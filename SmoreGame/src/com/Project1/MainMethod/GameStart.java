package com.Project1.MainMethod;

import java.util.Scanner;	
import com.Project1.PlayerInfo.Player;

public class GameStart {
	
	public static void main(String[] Args) {
		Scanner in = new Scanner(System.in);
		playGame(in);
		in.close();                                                       
	}
	
	public static void playGame(Scanner in) {
		Player user = new Player();
		int choice=0;
		boolean cont=false;
		System.out.println(" Welcome to Ziegler's Game! \n\n The obective is to make a S'more! "
				+ "\n\n There are hidden tools and objects you can \n find around the map that will help you"
				+ "\n Winning consists of: Making a S'more by a fire");		
		do{
			System.out.println("\n Would you like to play?");
			System.out.print("\n (1)To Play: \n (2)To Cancel");
			user.enterChoice();
			try {
			choice = Integer.parseInt(in.nextLine().trim());
			}catch(NumberFormatException ex) {
				user.useNumbers();
				cont = true;
			}
			if(choice == 1) {
				user.gameStart(user , in);
				cont = false;
			}else if (choice == 2){
				System.out.println("\n Sorry to see you go");
				cont = false;
			}else {
				user.useOneOrTwo();
				cont = true;
			}
		}while(cont);	
	}
}