package com.events;

import java.util.Scanner;

import com.playerservice.Player;

public class House extends Senario{
	
	public void eventHouse(Player user , Scanner in) {
		int choice = 0 ;
		System.out.println("\n Welcome to your Home " + user.getName() + ". "
				+ "\n You live here with your family so things get disorganised and can"
				+ "\n get mis-placed all the time here you need to find a couple more ingredients you need Graham"
				+ "\n Crackers and Chocolate you know you had both a couple days ago now you just need to find them");
		System.out.println("\n What would you like to do? "
				+ "\n\n 1)Call a family emergency and explain the utter importance of the reasoning behind you looking"
				+ "\n for these items, and have the family aid in your search of them"
				+ "\n\n 2)When did the house get so messy!!! You frustrated go through every room in the house "
				+ "\n tearing everything apart. Knowing that the sweet treats are there just hiding!"
				+ "\n\n 3)Scour every inch of your home looking everywhere for these delectible treats, knowing in your "
				+ "\n head that all you have to do is look hard enough\"");
		choice = decisionTime(user , in);
		if (choice == 1) 
			choiceOne(user,in);
		else if(choice == 2)
			choiceTwo(user, in);
		else if (choice == 3)
			choiceThree(user, in);
	}
	
	public void choiceOne(Player user ,Scanner in) {
		if(user.getCarisma() == 10) {
			System.out.println("\n WOW. who would have guessed that you could be so convincing!"
					+ "\n The whole famile got down on hands and knees to help in the search,"
					+ "\n After hours of searching they were finally located in a childs room "
					+ "\n apperantly they were someones midnight snack, But there is enough"
					+ "\n for us. "
					+ "\n\n Congradulations, Chocolate and Graham Crackers have been added to your "
					+ "\n inventory");
			inventory.add("Chocolate");
			inventory.add("Graham Cracker");
		}else {
			System.out.println(" You call the meating but your family see's right through your"
					+ "\n intentions of having them do the searching for you. So you go about your"
					+ "\n search only to discover the empty cartons of both. someone was  snacking "
					+ "\n while you were searching");
		}
	}
	
	public void choiceTwo(Player user ,Scanner in) {
			if (user.getStrength() == 10){
				System.out.println("\n As you tear through the house flinging couches and other "
						+ "\n furniture hither and yon . Your family watched agast as you put your"
						+ "\n your strength to the test. Actually nothing is a test when your ANRGY!"
						+ "\n You locate the goods in your sibilings room. After a beat down you trudge"
						+ "\n off Chocolate and Graham crakers in hand" 
						+ "\n\n Congradulations, Chocolate and Graham Crackers have been added to your "
						+ "\n inventory");
				inventory.add("Chocolate");
				inventory.add("Graham Cracker");
			}else{
				System.out.println("\n You march over to the couch and with one mighty tug NOTHING"
						+ "\n HAPPENS ahh. but not something is happening and is happening to your"
						+ "\n lower back. Ahh you think it is pulled so you wont be doing any more looking for the "
						+ "\n night.");
			}
	}
	
	public void choiceThree(Player user,Scanner in) {
		if(user.getVision() == 10) {
			System.out.println("\n You take a qick stroll throught the rooms of your house confidently"
					+ "\n knowing that nothing can stay hidden from you for long. just one brisk walk  "
					+ "\n through and you see see them in your sibilings room peaking out from behing their"
					+ "\n bed. You quickly snatch them up and add them you your own private stack of food"	
					+ "\n\n Congradulations, Chocolate and Graham Crackers have been added to your "
					+ "\n inventory");
			inventory.add("Chocolate");
			inventory.add("Graham Cracker");
		}else {
			System.out.println("\n You start your marching through the house not knowing where to even start "
					+ "\n looking. After six or seven time you can't even remember it feels so long"
					+ "\n you being to feel defeated and your mother yells at you to stop pacing and that "
					+ "\n ends your search for today");
			
		}
	}
}