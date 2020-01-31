/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiceRoller;

/**
 *
 * @author wesley.mcmillen
 */
public class Die {

    private int sides;

    public Die(int x) {
        sides = x;
        Roller roller = new Roller();
    }

    public int roll() {
        return (int) (sides * Math.random()) + 1;
    }
}
