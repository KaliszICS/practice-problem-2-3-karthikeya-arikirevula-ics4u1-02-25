public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void bubbleSortString(String[] strings) {
		boolean swap = true;
		int k = strings.length;

		for(int i = 0; i < k - 1 && swap; i ++) {
			
			for(int j = 0; j < k - i - 1; j++) {
				if(strings[j].toLowerCase().compareTo(strings[j+1].toLowerCase()) > 0) {
					//swap
					String temp = strings[j];
					strings[j] = strings[j+1];
					strings[j+1] = temp;
					swap = true;
				}
			}
		}
	}
}