package ch05_04;

public class RPSGame {
    int k;
    String com=" ";

    void start(){
        System.out.println("<<가위 바위 보 게임>>");
        System.out.println("이세령_2021250005");
    }
    void end(){
        System.out.println("수고했습니다!");

    }
    String getsetting(){
        if(k==0){
            com = "가위"; }
        else if(k==1){
            com = "바위";
        }
        else if (k==2){
            com = "보";
        }
        return com;
    }
    int getComrandom(){
        k=(int) (Math.random() * 2);
        return k;
    }
}
