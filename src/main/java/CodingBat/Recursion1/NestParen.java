package CodingBat.Recursion1;

public class NestParen {

    public boolean nestParen(String str) {
        if(str.length()==2 &&str.charAt(0)=='(' && str.charAt(str.length()-1)==')') return true;
        if(str.isEmpty()) return true;
        if(str.length()<=2) return false;

        if(str.charAt(0)=='(' && str.charAt(str.length()-1)==')'){
            return nestParen(str.substring(1, str.length()-1));
        }

        return nestParen(str.substring(1));
    }
}
