package com.Project1.Events;

import java.util.Scanner;
import com.Project1.PlayerInfo.Player;

public class Store extends Senario{

	public void eventStore(Player user , Scanner in) {
		int choice = 0;
		System.out.println("\n Welcome to the Store " + user.getName() + "."
				+"\n As you survey the store you see multiple aisles."
				+"\n Some of which will help you in your quest to find the ingredients "
				+"\n necessary to find make a S'more.");
		System.out.println("\n What would you like to do? "
				+ "\n\n 1)Convince a cashier to walk you all over the store to make sure you are able to find "
				+ "\n what you are looking for!"
				+ "\n\n 2)Look around to see if you can the items that you need all by yourself"
				+ "\n you don't need no help!"
				+ "\n\n 3)They have got to have what you need somewhere, just tear through every aisle"
				+ "\n making a mess as you go!");
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
			System.out.println("\n Congradulations, you not only had the cashier help you"
					+ "\n he also payed for all your Groceries. What luck, what confidence,"
					+ "\n what suave you have. "
					+ "\n\n You have successfully added MARSHMELLOWS to your inventory.");
			inventory.add("Marshmellow");
		}else if (user.getVision() == 10) {
			System.out.println("\n As you approach the cashier he sees you GLARING at him"
					+ "\n your eyes see into his soul and he is only able to studder as you quesion"
					+ "\n him. he was of no help.");
		}else {
			System.out.println("\n You Charge the cashier, who stands like a deer in the headlight, "
					+ "\n as you get closer, he lets out a childish SHRIEK and darts out of "
					+ "\n view and leaves you huffing at the counter, unsatisfied");
		}
	}
	
	public void choiceTwo(Player user ,Scanner in) {
			if(user.getVision() == 10) {
				System.out.println("\n You LOOK around and with one glace you see them. Breeming"
						+ "\n there aisle 7 middle self you casually jaunt over and get them. Having "
						+ "\n sucessfully completed your mission you head to the counter." 
						+ "\n\n You have successfully added MARSHMELLOWS to your inventory.");
				inventory.add("Marshmellow");
			}else{
				System.out.println("\n As you trudge aisle to aisle, you swear you have seen everything"
						+ "\n but what you are here for. You cant seem to spot it. and to think"
						+ "\n How hard is it to find marshmellows. Fustrated and disappointed you decide to leave"
						+ "\n Defeated");
			}
	}
	
	public void choiceThree(Player user,Scanner in) {
		if(user.getStrength() == 10) {
			System.out.println("\n You feel your Muscles buldge as you think where could this delectible"
					+ "\n food be. Fustrated you Charge the nearest aisle food flying around you as "
					+ "\n you hit aisle 7 you STOP and see the there next to the Twinkies"	
					+ "\n\n You have successfully added MARSHMELLOWS to your inventory.");
			inventory.add("Marshmellow");
		}else {
			System.out.println("\n You confidently size up the closest aisle. Beeming of"
					+ "\n Self-Confidence you charge with all your might and ****WHAM****"
					+ "\n YOU ARISE not sure what just happened but you are on your back with an aisle"
					+ "\n TOWERING over you.");
		}
	}
}
