package CodingBat.Recursion1;

public class ChangeXY {

    public String changeXY(String str) {
        if(!str.contains("x")) return str;

        if(str.charAt(0)=='x'){
            return "y"+changeXY(str.substring(1));
        }else{
            return str.charAt(0)+changeXY(str.substring(1));
        }


    }
}
