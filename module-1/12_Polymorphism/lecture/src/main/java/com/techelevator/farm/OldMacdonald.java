package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {


		Chicken chicken = new Chicken();
		playVerse((chicken.getName(), chicken.getSound()));

	}

	public static void playVerse(String name, String sound) {
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
	}
}