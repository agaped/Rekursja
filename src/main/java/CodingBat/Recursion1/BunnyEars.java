package CodingBat.Recursion1;

public class BunnyEars {

    public int bunnyEars(int bunnies) {
        if(bunnies==0){
            return 0;
        }
        if(bunnies==1){
            return 2;
        }

        return 2+bunnyEars(bunnies-1);

    }

}
