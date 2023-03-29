package com.Project1.PlayerInfo;

import java.util.Scanner;
import com.Project1.Events.Senario;

public class Player {
	
	private String name;
	private int strength;
	private int carisma;
	private int vision;
	private Player[] players;
	private int score;
	private int numPlayers=0;
	
	public Player() {
		players = new Player[5];
		this.numPlayers++;
	}	
	
	public Player createNewPlayer(Player user,Scanner in) {
		Player temp = new Player();
		boolean cont = false;
		int choice = 0;
		starLine();
		System.out.println("\n Would you like to change your name?");
		System.out.println(" Please enter (1) for YES (2) for NO");
		do {
		user.enterChoice();
		try {
			choice = Integer.parseInt(in.nextLine().trim());
		}catch(NumberFormatException ex) {
			user.useNumbers();
			createNewPlayer(user , in);
		}
		if(choice == 1) {
			gameStart(temp, in);
			cont = false;
		}else if(choice == 2) {
			temp.setName(user.getName());
			chooseCharacter(temp, in);
			cont = false;
		}else 
			useOneOrTwo();
			cont = true;
		}while(cont);
		return temp;
	}
	
	public void gameStart(Player user , Scanner in) {
		String name = " ";
		do{
			System.out.print("\n Lets get started! \n Please input your username:");
			name = in.nextLine();
		}while(name.isEmpty());
		user.setName(name.trim());
		starLine();
		chooseCharacter(user , in);
	}

	public void chooseCharacter(Player user, Scanner in) {
		int choice=0;
		boolean cont = false;
		System.out.print("\n Please choose you character: "
				+ "\n 1)Mr.Carismatic able to convince anyone \n to do anything"
				+ "\n 2)Eagle Eyes not Strong but who needs \n strength when you can see Everything"
				+ "\n 3)Buff BOI not the smartest and can't \n see to well but can walk through anything");
		do {
			System.out.print("\n Please choose using NUMBERS only: ");
			try {
			choice = Integer.parseInt(in.nextLine());
			}catch(NumberFormatException ex) {
				useNumbers();
				chooseCharacter(user,in);
			}
		}while(choice < 1 && choice > 3 );
		if(choice == 1) {
			user.setStats(5, 10, 3);
		}else if (choice == 2) {
			user.setStats(3, 5, 10);
		}else if (choice == 3){
			user.setStats(10, 3, 5);
		}else{
			useOneToThree();
			chooseCharacter(user, in);
		}
		starLine();
		System.out.println("\n Your current Stats are: \n" + user);
		do {
		System.out.print(" Please enter (1) to Start OR (2) to Change Characters:");
		try {
		choice = Integer.parseInt(in.nextLine().trim());
		}catch(NumberFormatException ex) {
			cont = true;
			useNumbers();
		}
		}while(cont);
		System.out.println();
		if(choice == 1) {
//			savePlayer(user);
			runGame(user,in);
		}else if(choice == 2) {
			System.out.println("\n*********** Please rechoose your character: *************");
			chooseCharacter(user, in);
		}else {
			useOneOrTwo();
			chooseCharacter(user, in);
		}	
	}
	
	public void setStats(int strength, int carisma , int vision) {
		setStrength(strength);
		setCarismatic(carisma);
		setVision(vision);
	 }
	
	public void runGame(Player user , Scanner in) {
		Senario readyToPlay = new Senario();
		readyToPlay.generateSenarios(user, in);
	}
	
//	public void savePlayer(Player user){
//		for(int i=0 ; i<players.length ; i++) {
//			if(i == numPlayers-1) 
//				players[i] = user;
//		}
//	}
//	
//	public void printPlayers() {
//		for(int i = 0 ; i < numPlayers-1 ; i++ ) {
//				System.out.println(players[i]);	
//		}
//	}
	
//Common Phrases
	
	public void starLine() {
		System.out.print("\n******************************************************************************************************\n");
		System.out.print("***********************************************LOADING************************************************\n");
		System.out.print("******************************************************************************************************\n");
	}
	
	public void useNumbers() {
		System.out.println("\n***********************PLEASE ONLY USE NUMBERS****************************");
	}
	
	public void useOneOrTwo() {
		System.out.println("\n*********** Please enter a number 1 or 2 *************");
	}
	
	public void useOneToThree() {
		System.out.println("\n*********** Please enter a number 1 through 3 *************");
	}
	
	public void enterChoice() {
		System.out.print("\n Please enter your choice:");
	}

	
//Getters and Setters
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public  int getStrength() {
		return this.strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getCarisma() {
		return this.carisma;
	}
	public void setCarismatic(int carisma) {
		this.carisma = carisma;
	}
	public int getVision() {
		return this.vision;
	}
	public void setVision(int vision) {
		this.vision = vision;
	}
	public int getScore() {
		return this.score;
	}
	public void setScore(int score) {
		this.score=score;
	}
	
	@Override
	public String toString() {
		return String.format(" [Player: name = %s , strength = %d , carisma = %d , vision = %d , Score = %d] \n",
				this.name, this.strength , this.carisma , this.vision, this.score);
	}
}