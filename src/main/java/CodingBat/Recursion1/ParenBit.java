package CodingBat.Recursion1;

public class ParenBit {

    public String parenBit(String str) {
        if(!str.contains("(")) return str.substring(0,str.indexOf(")")+1);
        if(str.startsWith(")")) return str.substring(0,1);

        if(str.charAt(0)=='('){
            return str.charAt(0)+parenBit(str.substring(1,str.indexOf(")")+1));
        }
        return parenBit(str.substring(1));
    }

}
