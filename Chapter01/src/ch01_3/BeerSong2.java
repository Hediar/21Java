package ch01_3;

public class BeerSong2 {
    public static void main(String[] args){
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0){
            if(beerNum == 1){
                word = "bottle";//singular, as in ONE bottle.
            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("pass it around.");
            beerNum = beerNum - 1;

            if(beerNum < 1){
                System.out.println("No more bottles of beer on the wall");
            }
        }//end while loop
        System.out.println("이세령_2021250005");
    }//end main method
}//end class
