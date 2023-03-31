package com.events;

import java.util.Scanner;

import com.playerservice.Player;

public class Shed extends Senario {

	public void eventShed(Player user , Scanner in) {
		int choice = 0;
		System.out.println("\n Welcome to your SHED " + user.getName() + ". "
				+ "\n WOW you see that the shed has not been cleaned in SOME time "
				+ "\n Sad part is you only need to find a Marshmellow Pick and Lighter"
				+ "\n fluid but as you see this is going to be a long task ");
		System.out.println("\n What would you like to do? "
				+ "\n\n 1)Climb to the vary tippy top of the stack it looks risky but it is the best point "
				+ "\n for you to be able to see everything you can and if you can see it no reason to dig for it"
				+ "\n\n 2)The only way up is through, you know nothing is that heavy so you think just chucking it"
				+ "\n it all out of the shed would be the fastest way."
				+ "\n\n 3)Go and have a nice chat with your mother about it as you know it was someone's chore"
				+ "\n you think to yourself snitches get stiched but snitches also get S'Mores");
		choice = decisionTime(user , in);
		if (choice == 1) 
			choiceOne(user,in);
		else if(choice == 2)
			choiceTwo(user, in);
		else if (choice == 3)
			choiceThree(user, in);	
	}
	
	public void choiceOne(Player user ,Scanner in) {
		if(user.getVision() == 10) {
			System.out.println("\n You have precariously climbed to the tallest point in the Shed"
					+ "\n but all that climbing as paid off from the top you see in the corner the "
					+ "\n lighter fluid right next to it sticking out is your poker yayyy! "
					+ "\n\n You have successfully added Poker Stick and Lighter Fluid to your inventory.");
			inventory.add("Poker Stick");
			inventory.add("Lighter Fluid");
		}else {
			System.out.println("\n You climb up the heaps of Stuffs to try and get a better view but"
					+ "\n now all you can focus on is the long way down. You grab on to the rafters"
					+ "\n and yell for help eventually your sibilings bring you a ladder to get down.");
		}
	}
	
	public void choiceTwo(Player user ,Scanner in) {
			if(user.getStrength() == 10){
				System.out.println("\n You start your digging at the front and in no time at all you"
						+ "\n you being to see the lighter fluid and poker stick and you rush to yank "
						+ "\n them out as you get them free. You think aren't you glad the shed is not "
						+ "\n your chore this week." 
						+ "\n\n You have successfully added Poker Stick and Lighter Fluid to your inventory.");
				inventory.add("Poker Stick");
				inventory.add("Lighter Fluid");
			}else{
				System.out.println("\n You start trying to dig your way through the mound and as you do"
						+ "\n you notice how unstable the higher levels are looking, you figit with a couple more"
						+ "\n items and the top comes loose burying you in a load of trash you get up and see"
						+ "\n your new kicks are trashed, Ahhhh the travesty.");
			}
	}
	
	public void choiceThree(Player user,Scanner in) {
		if(user.getCarisma() == 10) {
			System.out.println("\n You go have a nice chat with your mother and she totally agrees that"
					+ "\n the shed should totally be kept in a neat and clean order. she quickly "
					+ "\n dispatched your siblings to the job and within a hour you go outside and "
					+ "\n see that the Ligther fluid and poker stick are nice and out and you are able to grab them"
					+ "\n Zero problem"	
					+ "\n\n You have successfully added Poker Stick and Lighter Fluid to your inventory.");
			inventory.add("Poker Stick");
			inventory.add("Lighter Fluid");
		}else {
			System.out.println("\n As you approach the subject with your mother she quickly agrees on the "
					+ "\n disarray of the shed and just as fast says if you have to to complain about it"
					+ "\n you have time to pick it up yourself, before you get a second thought you find"
					+ "\n yourself outside in front of the shed with a apron, gloves, and broom.");
		}
	}
}