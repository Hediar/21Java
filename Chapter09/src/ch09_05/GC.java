package ch09_05;

public class GC {
    public static GC doStuff(){
        GC newGC = new GC();
        doStuff2(newGC);
        return newGC;
    }

    public static void main(String[] args) {
        GC gc1;
        GC gc2 = new GC();
        GC gc3 = new GC();
        GC gc4 = gc3;
        gc1 = doStuff();

        /*
        copyGC = null; X
        gc2 = null; O
        newGC = gc3; X
        gc1 = null; O
        newGC = null; X
        gc4 = null; X
        gc3 = gc2; X
        gc1 = gc4; O
        gc3 = null; X
        */
        //call more methods
    }

    public static void doStuff2(GC copyGC) {
        GC localGC = copyGC;
    }
}
