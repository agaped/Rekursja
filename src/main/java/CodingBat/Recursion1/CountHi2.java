package CodingBat.Recursion1;

public class CountHi2 {

    public int countHi2(String str) {
        if(!str.contains("hi")) return 0;

        if(str.charAt(0)=='x' && str.charAt(1)=='h' && str.charAt(2)=='i'){
            return countHi2(str.substring(3));
        }

        if(str.charAt(0)=='h' && str.charAt(1)=='i'){
            return 1+ countHi2(str.substring(2));
        }

        return countHi2(str.substring(1));

    }
}
