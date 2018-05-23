package CodingBat.Recursion1;

public class CountHi {

    public int countHi(String str) {
        if(!str.contains("hi")) return 0;
        if(str.length()==0) return 0;

        if(str.charAt(0)=='h' && str.charAt(1)=='i'){
            return 1 +countHi(str.substring(1));
        }
        return countHi(str.substring(1));


    }

}
