import java.util.Random;

/*
 * RandomAnalyzer.java
 * Author(s):
 * 
 * This class does stuff
 */
public class RandomAnalyzer {
    public static void main(String[] args) {
	System.out.println(countRandomGcds(5000, 1));
	System.out.println(countRandomGcds(5000, 500));
    }
    
    private static int countRandomGcds(int numberOfPairsToGenerate, int seed) {
	Random rand = new Random(seed);
	int total = 0;
	
	for (int i = 0; i < numberOfPairsToGenerate; i++) {
	    if (gcd(rand.nextInt(), rand.nextInt()) == 1) {
		total++;
	    }
	}
	
	return total;
    }
    
    private static int gcd(int num1, int num2) {
	//Extended Euclidian Algorithm
	if (num2 == 0) {
	    return num1;
	}
	else {
	    return gcd(num2, num1 % num2);
	}
    }
}
