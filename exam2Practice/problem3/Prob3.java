package problem3;

public class Prob3 {

	public static void main(String[] args) {
		String str = reverseWords("Hello World Again");
		System.out.println(str);
	}
	
	public static String reverseWords(String str) {
		String newStr = "";
		
		// Get length of array by counting spaces
		int length = 1;
		int count;
		for (count = 0; count < str.length(); count++) {
			if (str.charAt(count) == ' ') {
				length++;
			}
		}
		
		// Return itself if there is only 1 word in str
		if (length == 1) {
			return str;
		}
		
		// Construct array by iterating left-to-right through str
		String[] array = new String[length];
		String word = "";
		int index;
		int arrIndex = 0;
		
		for (index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ' ') {
				array[arrIndex] = word;
				word = "";
				arrIndex++;
			} else {
				word += str.charAt(index);
			}
		}
		array[length-1] = word;
		
		// Turn array back into string by reading right-to-left
		int index2;
		for (index2 = array.length-1; index2 >= 0; index2--) {
			newStr += array[index2] + ' ';
		}
		
		// Trim last " " character at the end of the string
		return newStr.substring(0, newStr.length()-1);
	}
}