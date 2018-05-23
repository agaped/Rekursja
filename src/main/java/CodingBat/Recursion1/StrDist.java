package CodingBat.Recursion1;

public class StrDist {

    public int strDist(String str, String sub) {
        if(str.length()<sub.length()) return 0;
        if(!str.contains(sub)) return 0;

        if(str.startsWith(sub) && str.endsWith(sub)){
            return str.length();
        }
        if(str.startsWith(sub) && !str.endsWith(sub)){
            return strDist(str.substring(0, str.length()-1), sub);
        }
        if(!str.startsWith(sub) && str.endsWith(sub)){
            return strDist(str.substring(1, str.length()), sub);
        }

        return strDist(str.substring(1, str.length()-1), sub);
    }
}
