package CodingBat.Recursion1;

public class Count11 {

    public int count11(String str) {
        if(!str.contains("11")) return 0;
        if(str.contains("11") && str.length()<3) return 1;

        if(str.startsWith("11")){
            return 1 + count11(str.substring(2));
        }

        return count11(str.substring(1));
    }
}
