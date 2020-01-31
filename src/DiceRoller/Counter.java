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
    private int minNum;

    public Counter(int rollsTilPrint, int Max, int Min) {
        numberRolled = new int[Max];
        rollsTillPrint = rollsTilPrint;
        minNum = Min;
    }

    public void addData(int data) {
        numberRolled[data - 1]++;
        roll++;
        if (roll % rollsTillPrint == 0) {
            print();
        }
    }

    public void print() {
        System.out.println("");
        System.out.println("");
        System.out.println(roll + " many rolls have been conducted");
        for (int i = minNum; i < numberRolled.length; i++) {
            System.out.println((i + 1) + " has been rolled " + numberRolled[i] + " times, which is " + (((double) numberRolled[i] / roll) * 100 + "% "));
        }

    }
}
