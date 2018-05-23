package CodingBat.Recursion1;

public class CountX {

    public int countX(String str) {
        if(!str.contains("x")) return 0;
        if(str.length()==1) return 1;

        if(str.charAt(0)=='x'){
            return 1+countX(str.substring(1,str.length()));
        }else{
            return countX(str.substring(1,str.length()));
        }
    }
}
