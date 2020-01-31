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
public class Counter {

    private int[] numberRolled;
    private int rollsTillPrint;
    private int roll;

    public Counter(int rollsTilPrint, int Max, int Min) {
        numberRolled = new int[Max];
        rollsTillPrint = rollsTilPrint;
    }

    public void addData(int data) {
        numberRolled[data]++;
        if (roll % rollsTillPrint==0) {
            
        }
    }
    public void print(){
        System.out.println("what where you saying");
    }
}
