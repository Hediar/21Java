package ch06_01;

import java.util.ArrayList;

public class DotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();   //문자열 입력받음
        DotCom theDotCom = new DotCom();    //객체

        int randomNum = (int) (Math.random() * 5);
        int[] locations ={randomNum, randomNum + 1, randomNum + 2};    //일련의 숫자 3개

        ArrayList<String> l2= new ArrayList<String>();   //locations를 문자로 바꿈

        for(int x:locations){
            l2.add(String.valueOf(x));
        }

        theDotCom.setLocationCells(l2);

        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive=false;
                System.out.println("You took " + numOfGuesses + "guesses");
            }//close if
            else{
                System.out.println(result);
            }
        }//close while
        System.out.println("이세령_2021250005");
    }// close main
}
