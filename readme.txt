==============  Readme  ==============

Authors : Anthony Fighter & Johnathan Stiles

Files:
RandomAnalyzer.java

Compile with javac *.java

Run program with command java RandomAnalyzer

When started, the program will generate 50 sets of 10000 pairs of random numbers. Each
pair of random numbers will be compared to find the greatest common denominator of the
pair. The program will output the number of pairs whose greatest common denominator 
was one, or in other words, the number of pairs that were relatively prime. The 
program will also output the seed initially given to the random number generator.

In addition, the random.org simple client, found at https://github.com/marsG/random.org-simpleclient
was used to interface, and pull, a large sample of truly random numbers from random.org.