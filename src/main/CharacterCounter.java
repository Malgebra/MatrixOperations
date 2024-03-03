package main;


public class CharacterCounter {

	public static void main(String[] args) {
		// Test A
		int howManyA = countOccurences("asdf;lkdasjf;lkdsjf;aksj", 'a', 0);
		System.out.println("There are " + howManyA + " occurances.");
		System.out.println("Expected: 3");
		// Test B
		int howManyB = countOccurences("", 'j', 3);
		System.out.println("There are " + howManyB + " occurances.");
		System.out.println("Expected: 0");
		// Test C
		int howManyC = countOccurences("John Mars man on moon", 'A', 0);
		System.out.println("There are " + howManyC + " occurances.");
		System.out.println("Expected: 0");
		// Test D
		int howManyD = countOccurences("hello has 5 letters", 'z', 20);
		System.out.println("There are "+ howManyD + " occurances.");
		System.out.println("Expected: 0");
		
		
	}

	// TODO: 1. Draw the control flow graph and calculate the cyclomatic complexity.
	// TODO: 2. Develop 'test cases', as the example provided in main(), to test
	// countOccurences.
	// As a test oracle, manually inspect the results to see if the behavior is as
	// expected.
	// Be sure to have test cases that reveal and don't reveal the fault (see #3).
	// TODO: 3. Identify the fault, but don't correct it, yet.
	// TODO: 4. Were/are your set of test cases good enough? Why or why not? How
	// would you improve them?
	// TODO: 5. Looking back on your test cases from #2 and tracing how each would
	// "execute" through
	// your control flow graph. Did your test cases trace every
	// path/node/edge/whatever in the graph?
	// Why or why not?
	// TODO 6. Looking back on the fault, what was its trace through the CFG?

	// Returns the number of occurrences of provided char starting at index
	public static int countOccurences(String someString, char someChar, int index) {

		int count = 0;

		for (int i = index; i < someString.length(); i++) {
			char aChar = someString.charAt(i);
			if (aChar == someChar) {
				count++;
			}
		}
		return count;
	}
}
