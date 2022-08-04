package ch10_05;

import java.util.*;


public class Lotto {
    public static void main(String[] args) {
        Set lottoSet= new HashSet();
        int num;
        while (lottoSet.size() != 6) {
            num = (int)(Math.random()*45 + 1);
            lottoSet.add(num);
        }
        System.out.println("로또 번호는 " + lottoSet);
        System.out.println("이세령_2021250005");
    }

}

