package CodingBat.Recursion1;

public class NoX {
    public String noX(String str) {
        if(!str.contains("x")) return str;

        if(str.charAt(0)=='x'){
            return "" +noX(str.substring(1));
        }else{
            return str.charAt(0)+noX(str.substring(1));
        }
    }
}
