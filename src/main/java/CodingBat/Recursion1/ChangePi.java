package CodingBat.Recursion1;

public class ChangePi {

    public String changePi(String str) {
        if(!str.contains("pi")) return str;

        if(str.charAt(0)=='p' && str.charAt(1)=='i'){
            return "3.14"+changePi(str.substring(2));
        }else{
            return str.charAt(0)+changePi(str.substring(1));
        }
    }
}
