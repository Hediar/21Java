package ch04_04;

public class Solution {
    public int solution(int x, int y, int z) {
        int answer=0;
        if (x*x > (y*y + z*z)){
            answer = 1;
        }
        else if (x*x == (y*y + z*z)){
            answer = 2;
        }
        else if (x*x < (y*y + z*z)){
            answer = 3;
        }
        return answer;
    }
}