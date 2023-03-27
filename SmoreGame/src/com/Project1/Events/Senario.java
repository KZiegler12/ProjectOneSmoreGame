package com.Project1.Events;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import com.project1.playerInfo.Player;

public class Senario  {

	static ArrayList<String> inventory = new ArrayList<String>();

	public Senario(){}
	
	Random rand = new Random();
	
	public void generateSenarios(Player user , Scanner in) {
		int choice = rand.nextInt(4-1)+1;
		if(choice == 1) {
			senarioOne( user ,  in);
		}else if(choice == 2) {
			senarioTwo(user , in);
		}else if(choice == 3) {	
			senarioThree(user , in);
		}
	}
	
	public void senarioOne(Player user , Scanner in) {
		welcomeSenario(user);
		makeStore().eventStore(user, in);
		user.starLine();
		makeHouse().eventHouse(user, in); 
		user.starLine();
		makeCar().eventCar(user, in);
		user.starLine();
		makeShed().eventShed(user, in);
		user.starLine();
		makeYard().eventYard(user, in);
		user.starLine();
		makeEnding().endGame(user, in);
	}
	
	public void senarioTwo(Player user , Scanner in) {
		welcomeSenario(user);
		makeShed().eventShed(user, in);
		user.starLine();
		makeCar().eventCar(user, in);
		user.starLine();
		makeHouse().eventHouse(user, in); 
		user.starLine();
		makeStore().eventStore(user, in);
		user.starLine();
		makeYard().eventYard(user, in);
		user.starLine();
		makeEnding().endGame(user, in);
	}
	
	public void senarioThree(Player user , Scanner in) {
		welcomeSenario(user);
		makeCar().eventCar(user, in);
		user.starLine();
		makeHouse().eventHouse(user, in); 
		user.starLine();
		makeShed().eventShed(user, in);
		user.starLine();
		makeStore().eventStore(user, in);
		user.starLine();
		makeYard().eventYard(user, in);
		user.starLine();
		makeEnding().endGame(user, in);
	}
	
	public int decisionTime(Player user , Scanner in) {
		int choice = 0;
		boolean cont = false;
		do {
			user.enterChoice();
			try {
			choice = Integer.parseInt(in.nextLine().trim());
			}catch(NumberFormatException ex) {
				user.useNumbers();
				decisionTime(user , in);
			}
			if(choice == 1){
				return 1;
			}else if(choice ==2){
				return 2;	
			}else if(choice == 3){
				return 3;
			}else {
				user.useOneToThree();
				cont=true;
			}
		}while(cont);
		return choice;
	}
	
	public void welcomeSenario(Player user) {
		System.out.println("\n WELCOME TO THE GAME " + user.getName() + " HAVE FUN!");
	}
	
	public Store makeStore() {
		Store store = new Store();
		return store;
	}
	public House makeHouse() {
		House house = new House();
		return house;
	}
	public Shed makeShed() {
		Shed shed = new Shed();
		return shed;
	}
	public Car makeCar() {
		Car car = new Car();
		return car;
	}
	public Yard makeYard() {
		Yard yard = new Yard();
		return yard;
	}
	public Ending makeEnding() {
		Ending ending = new Ending();
		return ending;
	}
}