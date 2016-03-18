import java.util.Random;

/*
 * RandomAnalyzer.java
 * Author(s): Anthony Fighter / Johnathan Stiles
 * 
 * This class holds methods to be used for testing.
 */
public class RandomAnalyzer {

    public static void main(String[] args) {
        int success = 0;
        double[] data = new double[50];
        int[] seeds = new int[50];
        seeds[0] = 151;
        double[] probability = new double[50];

        for (int i = 0; i < 50; i++) {//perform 50 sets of tests.
            data[i] = countJavaRandomGcds(10000, seeds[i]);//stores number of successes
            probability[i] = data[i]/10000;
            System.out.println("seed:  " + seeds[i] + "  count:  " + data[i]);
            
            if(seeds[i] != seeds[49]){
        	seeds[i+1] = seeds[i]+10;
            }
        }
    }

    //Given the number of random pairs to generate and the seed to seed the random number generator with,
    //count up the number of relatively prime pairs of random numbers, and return the total count.
    public static int countJavaRandomGcds(int numberOfPairsToGenerate, int seed) {
        Random rand = new Random(seed);
        int total = 0;

        for (int i = 0; i < numberOfPairsToGenerate; i++) {
            //Generate two random numbers, and check for relative primeness
            if (gcd(rand.nextInt(), rand.nextInt()) == 1) {
                total++;
            }
        }

        return total;
    }

    //Given two numbers, return the greatest common denominator of the two.
    private static int gcd(int num1, int num2) {
        //Extended Euclidian Algorithm
	//Base case, remainder is zero, return quotient.
        if (num2 == 0) {
            return num1;
        } 
        //Recursive case, move quotient over to the left hand side of equation
        //and move reminder to the quotient.
        else {
            return gcd(num2, num1 % num2);
        }
    }
}