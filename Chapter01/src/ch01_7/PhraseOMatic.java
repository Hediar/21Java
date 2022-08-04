package ch01_7;

public class PhraseOMatic {
    public static void main(String[] args) {

        String[] wordListOne = {"24/7","multi-Tier","30,000 foot","B-to-B",
                "win-win","front-end","web-based","prevasive","smart","six-sigma",
                "critical-path","dynamic"};
        String[] wordListTwo = {"empowerd","sticky","valued-added","oriented","centric",
                "distributed","clustered","branded","outside-the-box","positioned","networked",
                "focused","leveraged","aligned","targeted","shared","cooperative","accelerated"};
        String[] wordListThree = {"process","tipping-point","solution","architecture","core competency",
                "strategy","mindshare","portal","space","vision","paradigm","mission"};
        int oneLength = wordListOne.length;
        int TwoLength = wordListOne.length;
        int ThreeLength = wordListOne.length;
        int rand1 = (int)(Math.random() * oneLength);
        int rand2 = (int)(Math.random() * TwoLength);
        int rand3 = (int)(Math.random() * ThreeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Waht we need is a " + phrase);
    }
}
