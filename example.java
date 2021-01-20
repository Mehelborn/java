public class example {
    public static void main(String[] args) {
        int beernum = 99;
        String word = "botles (botle)";

        while (beernum > 0) {
            if(beernum == 1) {
                word = "botle";
            }
            System.out.println(beernum + " " + word + " of beer on wall.");
            System.out.println(beernum + " " + word + " of beer.");
            System.out.println("Take a botle.");
            System.out.println("Let go in the circle.");
            beernum = beernum - 1;
            if (beernum > 0) {
                System.out.println(beernum + " " + word + " of beer on wall.");
            } else {
                System.out.println("No more beer on wall");
            }
        }

    }
}