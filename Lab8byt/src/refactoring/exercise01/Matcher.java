package refactoring.exercise01;
/*
* Program is supposed to compare two arrays 
* Items must be differed maximum the size of 'delta'
* Item from actual array should be smaller than clipLimit,If not item will be changed to clipLimit
* */


public class Matcher {
	//Seems to be not needed default constructor
	//public Matcher() {
	//}

	public boolean match(int[] expected, int[] actual, int clipLimit, int delta) {
         //Better to put this operation first ,because it will return false without doing operations which are not needed
		// Check for length differences
		if (actual.length != expected.length)
			return false;
		/*This can be done in the next loop, not to itarate twice
		// Clip "too-large" values
		for (int i = 0; i < actual.length; i++)
			if (actual[i] > clipLimit)
				actual[i] = clipLimit;
*/

		// Check that each entry within expected +/- delta
		//There is no guarantee that in the expected array items will be smaller than the Limit ,So probably better to check
		//Added method to check the Limit.
		for (int i = 0; i < actual.length; i++) {
			TooBig(actual,clipLimit,i);
		    TooBig(expected,clipLimit,i);
			if (Math.abs(expected[i] - actual[i]) > delta)
				return false;
		}
		return true;
	}
	private void TooBig(int[] arr, int clipLimit, int i) {
		if (arr[i] > clipLimit)
			arr[i] = clipLimit;
	}
}