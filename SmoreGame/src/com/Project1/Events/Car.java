package com.Project1.Events;

import java.util.Scanner;
import com.Project1.PlayerInfo.Player;

public class Car extends Senario{
	
	public void eventCar(Player user , Scanner in) {
		int choice = 0;
		System.out.println("\n Welcome to the Family Car " + user.getName() + "."
				+ "\n You were told that this Hunk 'o' Junk might hold only the most valuable piece of the "
				+ "\n puzzle, the lighter. As you go outside to the car you give the door a hard tug only"
				+ "\n to look inside and see the keys left inside and your dad had the other set but "
				+ "\n you dont know when he will get back from the store with milk.");
		System.out.println("\n What would you like to do? "
				+ "\n\n 1)If the door is locked all needs is a little more gumbtion to open it, so "
				+ "\n you brace your self against the car and pull with a 110%% you can"
				+ "\n\n 2)See if you can see something on the street that could help you un-lock the car"
				+ "\n the \"old\" fashioned way with a pry bar and a little leverage to slide it through"
				+ "\n the door "
				+ "\n\n 3)See if your old buddy who was friends with a lock smith come and take a look at"
				+ "\n it locksmiths should be able to do unlock anything they even lock in their first name.");
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
			System.out.println("\n  With all your might you pull and pull angainst the door, it slowly begins"
					+ "\n to creak under your strength as you continue to pull the lock gives way and the door  "
					+ "\n flys open and sure enough laying there in the center concsole was the lighter you"
					+ "\n needed. "
					+ "\n\n You have successfully added a lighter to your inventory.");
			inventory.add("Lighter");
		}else if (user.getCarisma() == 10) {
			System.out.println("\n You heave against the metal door, of course your family vehicle is "
					+ "\n an oldie. The metal doesn't budge and now here you are feet against the car "
					+ "\n pulling with all your might and still nothing, but you might go"
					+ "\n viral as you let go you see the neighbors were filming your whole struggle");
		}else {
			System.out.println("\n You go over to the vehicle and there the keys are just on the inside "
					+ "\n you give the door a firm tug and think there is no way im getting this open"
					+ "\n you humbly sit down and begin the long wait for you father to get home...");
		}
	}
	
	public void choiceTwo(Player user ,Scanner in) {
			if(user.getVision() == 10) {
				System.out.println("\n As you look for something to help you in open the door you see out of the "
						+ "\n corner of you eyes you notice the the left the back door open you laugh to"
						+ "\n yourself thinking about what you were going to do if you didnt see that."
						+ "\n You saved yourself from that embarassment" 
						+ "\n\n You have successfully added a Lighter to your inventory.");
				inventory.add("Lighter");
			}else{
				System.out.println("\n You look doen the street and see a slim metal shim on the cement you"
						+ "\n run over to it and grab it thinking this shim just saved you life as you begin"
						+ "\n to slide it in the door your hand twitches and the metal falls inside the car"
						+ "\n you are now back to square one \"NOWHERE\" ");	
			}
	}
	
	public void choiceThree(Player user,Scanner in) {
		if(user.getCarisma() == 10) {
			System.out.println("\n You give your buddy and call and it just so happens the locksmith was"
					+ "\n right down the road and he will be able to stop by within 10 minutes "
					+ "\n As you are there chatting it up with your friend the lock smith shows up"	
					+ "\n and withing 10 minutes the door is open you have the keys and LIGHTER!"
					+ "\n\n You have successfully added a Lighter to your inventory.");
			inventory.add("Lighter");
		}else {
			System.out.println("\n You call and your friend picks up but you forgot that you"
					+ "\n owed him money and so now here you are with no lighter and also"
					+ "\n on the phone with someone who is lecturing you about finances."
					+ "\n You think to yourself there is no place worse for you to be.");
			
		}
	}
}