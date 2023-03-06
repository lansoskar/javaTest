package assignment1;

import java.util.Collections;
import java.util.HashMap;

public class LogicsAndNumbersStuff {

    /**
     * This method returns the difference between a and b multiplied by c.
     * @param a The first number
     * @param b The second number
     * @param c The last number
     * @return The difference of a and b, multiplied by c.
     */
    public int diffMultipliedByC(int a, int b, int c)
    {
        //TODO Delete line below, and implement this method
        return (a - b) * c;
        //
    }

    /**
     * Returns true if you can stay in bed this morning. You can stay in bed if it is not a weekday, or if you are on vacation.
     * @param weekday True if its a weekday, false if it is not.
     * @param vacation True if you are on vacation, false if you are not.
     * @return True if you can stay in bed given the parameters.
     */
    public boolean canYouStayInBed(boolean weekday, boolean vacation)
    {
        //TODO Delete line below, and implement this method
        if (!weekday) {
            return true;
        } else if (weekday && vacation) {
            return true;
        } else return false;
        // retun true hvis det ikke er weekday og retun true hvis det er weekday og vacation
        //det er sådan jeg skrev det intellij kan simplificere det til 3 linjer
    }

    /**
     * This method returns the sum of all the given numbers
     * @param numbers The array containing all the numbers to calculate the sum of.
     * @return The sum of all integers in the numbers array.
     */
    public int sumOfNumbers(int[] numbers)
    {
        //TODO Delete line below, and implement this method
        int sum = 0;
        for (int x : numbers) {
            sum = x + sum;
        }
        return sum;
        // ini variable sum og iterate igennem arrayet og tilføj til sum
    }

    /**
     * This method returns the average of all the given numbers.
     * @param numbers The array containing all the numbers to calculate the average of.
     * @return The average of all the integers in the numbers array.
     */
    public double averageOfNumber(int[] numbers)
    {
        //TODO Delete line below, and implement this method
        int sum = 0;
        for (int x : numbers) {
            sum = x + sum;
        }
        return sum / numbers.length;
        //samme som i opgaven ovenfor bare return average af alle integers
    }

    /**
     * Finds the number in the array that occurs the most times.
     * Say that the array is [1,2,5,42,42,42] the the return value should be 42 since that number occurs 3 times.
     * If there is a tie, as with the array [42,42,1984,1984,1,2,3] where both 42 and 1984 occurs twice,
     * the number that appears first in the array must be the return value. So in that case 42 should be returned.
     * @param numbers The array of numbers.
     * @return The number that occurs most often in the array.
     */
    public int numberWithMostOccurrences(int[] numbers)
    {
        //TODO Delete line below, and implement this method
        HashMap<Integer, Integer>numberCounter = new HashMap<Integer, Integer>();
        for (int number : numbers) {
            if (!numberCounter.containsKey(number)){
                numberCounter.put(number, 1);
            } else if (numberCounter.containsKey(number)) {
                numberCounter.put(number, +1);
            }
        }
        int mostOccured = (Collections.max(numberCounter.values()));
        return mostOccured;
    }
    // virker ikke, tankegang:
    // 1. gå igennem numbers array og hvis tallet ikke er set før tilføj til hashmap, hvis tallet er set før
    // increase value associeret med key med +1.
    // 2. bruge collections max til at finde største value og returnere den

}
