package ch05_04;

import java.util.Scanner;

public class RPSGameDriver {
    public static void main(String[] args) {
        RPSGame g = new RPSGame();
        Scanner sc = new Scanner(System.in);
        g.start();
        while (true) {
            g.k=g.getComrandom();
            g.com=g.getsetting();
            System.out.print("가위(1), 바위(2), 보(3), 종료(0) 입력: ");
            int player = sc.nextInt();
            if (player == 0) {
                g.end();
                break;
            } else if (player == 1 || player == 2 || player == 3) {
                System.out.println("Computer value: " + g.com);
                if ((g.k + 1) == player) {
                    System.out.println("컴퓨터가 " + g.com + "를 냈습니다. 당신과 비겼습니다.");
                } else if ((g.k == 0 && player == 2) || (g.k == 1 && player == 3) || (g.k == 2 && player == 2)) {
                    System.out.println("컴퓨터가 " + g.com + "를 냈습니다. 당신이 이겼습니다.");
                } else if ((g.k == 0 && player == 3) || (g.k == 1 && player == 1) || (g.k == 2 && player == 1)) {
                    System.out.println("컴퓨터가 " + g.com + "를 냈습니다. 당신이 패배했습니다.");
                }
            }
            else {
                g.end();
                break;
            }
        }
    }
}
