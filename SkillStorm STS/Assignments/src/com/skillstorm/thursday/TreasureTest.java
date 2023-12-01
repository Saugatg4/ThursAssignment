package com.skillstorm.thursday;

import java.util.Arrays;

public class TreasureTest {
	
	public static void main(String[] args) {
		Treasure treasure1 = new Treasure ("18 carat gold ring", "a ring with 18 carat gold", 22436.00);
		Treasure treasure2 = new Treasure ("gold brooch", "a brooch made of gold", 984.00);
		Treasure treasure3 = new Treasure ("sapphire diamond", "a diamond with a sapphire", 22436.00);
		
		TreasureChest chest = new TreasureChest();
		
		chest.setContents(new Treasure[]{treasure1, treasure2, treasure3});
		chest.setLocked(true);
		System.out.println(chest);
		
		Treasure[] chestContents = chest.getContents();
		System.out.println(Arrays.toString(chestContents));
		
		chest.setLocked(false);
		System.out.println(chest);
		
		chestContents = chest.getContents();
		if (chestContents != null) {
			for (Treasure treasure : chestContents) {
				System.out.println(treasure);
			}
		}
		
		
		
		
		
	}
	 


}
