/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiceRoller;

import java.util.Scanner;

/**
 *
 * @author wesley.mcmillen
 */
public class Roller {

    public Roller() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many dice?");
        int diceN = input.nextInt();
        Die[] dice = new Die[diceN];
        int sidesMax = 0;
        int sides;
        for (int i = 0; i < dice.length; i++) {
            System.out.print("How many sides to die" + i);
            sides = input.nextInt();
            sidesMax += sides;
            dice[i] = new Die(sides);
        }

        System.out.println("How many rolls til print?");
        int rolls = input.nextInt();
        Counter counter = new Counter(rolls, sidesMax, diceN);
    }
}
