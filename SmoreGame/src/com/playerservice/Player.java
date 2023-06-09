package com.playerservice;

import java.util.Scanner;

import com.events.Senario;

public class Player {
	
	private String name;
	private int strength;
	private int carisma;
	private int vision;
	private int score;
	
	public Player() {
	}	
	
	public void createNewPlayer(Player user,Scanner in) {
		Player temp = new Player();
		boolean cont = false;
		int choice = 0;
		starLine();
		do {
		System.out.println("\n Would you like to change your name?");
		System.out.println(" Please enter (1) for YES (2) for NO");
		user.enterChoice();
		try {
			choice = Integer.parseInt(in.nextLine().trim());
		}catch(NumberFormatException ex) {
			user.useNumbers();
			createNewPlayer(user , in);
		}
		if(choice == 1) {
			gameStart(temp, in);
			return;
		}else if(choice == 2) {
			temp.setName(user.getName());
			chooseCharacter(temp, in);
			return;
		}else 
			useOneOrTwo();
		}while(cont);
	}
	
	public void gameStart(Player user , Scanner in) {
		String name = " ";
		System.out.print("\n Lets get started! \n Please input your username:");
		name = in.nextLine();
		if(name.trim().length()==0) {
			gameStart(user , in);
		}
		user.setName(name);
		starLine();
		chooseCharacter(user , in);
	}

	public void chooseCharacter(Player user, Scanner in) {
		int choice=0;
		boolean cont=false;
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
			choice=7;
			cont=false;
		}
		if(choice == 1) {
			user.setStats(5, 10, 3);
			cont=false;
		}else if (choice == 2) {
			user.setStats(3, 5, 10);
			cont=false;
		}else if (choice == 3){
			user.setStats(10, 3, 5);
			cont=false;
		}else {
			useOneToThree();
			cont=true;
		}
		}while(cont);	
		starLine();
		changeCharacter(user,in);
	}
	
	public void changeCharacter(Player user, Scanner in) {
		int choice = 0;
		boolean cont=false;
		System.out.println("\n Your current Stats are: \n" + user);
		do{
			System.out.print(" Please enter (1) to Start OR (2) to Change Characters:");
		try {
		choice = Integer.parseInt(in.nextLine().trim());
		}catch(NumberFormatException ex) {
			useNumbers();
			choice=5;
		}
		if(choice == 1) {
			runGame(user,in);
			cont=false;
		}else if(choice == 2) {
			System.out.println("\n*********** Please rechoose your character: *************");
			chooseCharacter(user, in);
			cont=false;
		}else {
			useOneOrTwo();
			cont=true;
		}	
		}while(cont);
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
	

//Common Phrases
	
	public void starLine() {
		System.out.print("\n ******************************************************************************************************\n");
		System.out.print(" ***********************************************LOADING************************************************\n");
		System.out.print(" ******************************************************************************************************\n");
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