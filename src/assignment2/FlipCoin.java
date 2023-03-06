package assignment2;

import java.util.Random;

public class FlipCoin {

    /**
     * 
     * @return a random 0 or 1
     * Value must be random
     */
    public int flipCoin() {
        //TODO Delete line below, and implement this method
        Random num = new Random();
        return num.nextInt(2);
    } //laver nyt random object og kalder et tal mellem 0 og 1
}
