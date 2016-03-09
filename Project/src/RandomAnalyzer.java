/*
 * RandomAnalyzer.java
 * Author(s):
 * 
 * This class does stuff
 */
public class RandomAnalyzer {
    public static void main(String[] args) {
	System.out.println(gcd(3600, 1800));
    }
    
    private static int countRandomGcds(int numberOfPairsToGenerate, int seed, RandomMode mode) {
	return 15;
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
    
    private enum RandomMode {
	MathRandom,
	RandomObject
    }
}
