/*
 * RandomAnalyzer.java
 * Author(s):
 * 
 * This class does stuff
 */
public class RandomAnalyzer {
    public static void main(String[] args) {
	System.out.println(countRandomGcds(5000, 1, RandomMode.MathRandom));
	System.out.println(countRandomGcds(5000, 500, RandomMode.RandomObject));
    }
    
    private static int countRandomGcds(int numberOfPairsToGenerate, int seed, RandomMode mode) {
	return 15;
    }
    
    private enum RandomMode {
	MathRandom,
	RandomObject
    }
}
