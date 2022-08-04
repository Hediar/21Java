package ch06_01;
import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;    // l2

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);   //값있으면 index 리턴, 없으면 -1
        if (index >= 0) {   // 있다는 뜻 -1은 아니기 때문에
            locationCells.remove(index);    //배열에서 그 값을 지움
            if (locationCells.isEmpty()) {  //비어있으면 kill
                result = "kill";
            } else {
                result = "hit";
            } //close if
        }//close outer if

        return result;
    }//close method
}//close class
