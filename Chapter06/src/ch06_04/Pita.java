package ch06_04;

public class Pita {
    public static void main(String[] args) {
        int a, b, c, k = 0;
        for (a = 1; a < 100; a++) {
            for (b = 1; b < 100; b++) {
                for (c = 1; c < 100; c++) {
                    if(a*a + b*b == c*c){
                        System.out.println("a : "+a+", b : "+b+" ,c : "+c);
                        k++;
                    }
                }
            }
        }
        System.out.println("cnt = "+k);
        System.out.println("이세령_2021250005");
    }
}
