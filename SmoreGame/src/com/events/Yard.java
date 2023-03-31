package com.events;

import java.util.Scanner;

import com.playerservice.Player;

public class Yard extends Senario{
	
	public void eventYard(Player user , Scanner in) {
		int choice = 0;
		System.out.println("\n Finally you get to your Back Yard " + user.getName() + "."
				+"\n you slowly clear the firepit to begin your S'mores your realize that there "
				+"\n is no more fire Wood you see branches here and there but its all spread out");
		System.out.println("\n What would you like to do? "
				+ "\n\n 1)Walk around the yard once gathering every stick in sight to build the fire"
				+ "\n and grab a couple dead branches and logs you see hanging off a tree."
				+ "\n\n 2)Go and tell your family your S'mores plan to see if they will pitch in to "
				+ "\n accomplish something great"
				+ "\n\n 3)Look and see where would be the best place to build your fire to have the easiest access"
				+ "\n to the most wood");
		choice = decisionTime(user , in);
		if (choice == 1) 
			choiceOne(user,in);
		else if(choice == 2)
			choiceTwo(user, in);
		else if (choice == 3)
			choiceThree(user, in);
	}
	
	public void choiceOne(Player user ,Scanner in) {
		if(user.getStrength() == 10) {
			System.out.println("\n You march around the yard picking up every stick and log you can"
					+ "\n find and haul them all off to the fire pit so you are able to begin the"
					+ "\n final step of your whole day being able to relax and enjoy a S'more"
					+ "\n\n You have successfully added Fire Wood to your inventory.");
			inventory.add("Fire Wood");
		}else {
			System.out.println("\n You begin to walk aroud gathering all the material you can, but"
					+ "\n you notice that this is going to be a much harder task than originally thought."
					+ "\n After an hour of gathering wood it gets starts getting dark and the mosquitos "
					+ "\n start biting. With no bug spray you decide to take a little break.");
		}
	}
	
	public void choiceTwo(Player user ,Scanner in) {
			if (user.getCarisma() == 10) {
				System.out.println("\n You bring your family together and dicuss the possibilities"
						+ "\n of S'mores and they get so excited they all rush to your help and before"
						+ "\n you know it you have a mound of fire wood all ready to start the fire" 
						+ "\n\n You have successfully added Fire Wood to your inventory.");
				inventory.add("Fire Wood");
			} else {
				System.out.println("\n You bring your family together and dicuss the possibilities"
						+ "\n of S'mores and they disregard you and say they are happy with their snacks"
						+ "\n so you disheartenly turn back outside and start the process of getting your"
						+ "\n own Firewood" );
			}
	}
	
	public void choiceThree(Player user,Scanner in) {
		if(user.getVision() == 10) {
			System.out.println("\n You see that there are allot of branches in the other corner of"
					+ "\n your yard. You decide to set the fire pit over there to give you the easiest"
					+ "\n access to this source of wood"	
					+ "\n\n You have successfully added Fire Wood to your inventory.");
					inventory.add("Fire Wood");
		}else {
			System.out.println("\n It is already starting to get dark and you cant really see where"
					+ "\n the best place would be to begin and set the fire pit to give you the best"
					+ "\n material. You are tired so you shrug your shoulders and think maybe tomorrow.");
		}
	}
}