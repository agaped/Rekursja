package CodingBat.Recursion1;

public class StrCopies {

    public boolean strCopies(String str, String sub, int n) {
        if(n==0) return true;
        if(str.length()<sub.length()) return false;

        if(n>0 && str.startsWith(sub)){
            return strCopies(str.substring(1), sub, n-1);
        }
        return strCopies(str.substring(1), sub, n);
    }
}
