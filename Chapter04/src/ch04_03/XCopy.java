package ch04_03;

public class XCopy {
    public static void main(String [] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y+"이세령_2021250005");
    }

    int go(int arg) {
        arg = arg * 2;

        return arg;
    }
}
