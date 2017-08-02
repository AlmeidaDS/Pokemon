package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pikachu pikachu = new Pikachu();
        Raichu raichu = new Raichu();
        pikachu.quickAttack(raichu);
        raichu.lightingRod(pikachu);

        Pokemon p = new Pikachu();


        for (int i = 0; i < 10 ; i++) {
            raichu.thunderWave(pikachu);
            raichu.shockElectrico(pikachu);
        }
    }
}
