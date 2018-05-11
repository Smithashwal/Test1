package abcd;

public class SubSequenceCalculator {

	public boolean hasSubString(String s1, String s2) {

		for (int i = 0; i < s1.length(); i++) {
			int j = 0, x = i;
			while (j < s2.length() && x < s1.length()) {

				if (s1.charAt(x) == s2.charAt(j)) {
					j++;
					x++;
				} else {
					break;
				}
				

			}
			if (j == s2.length()) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		if (new SubSequenceCalculator().hasSubString("smitha is a girl", "asa")) {
			System.out.println("It is");
		} else {
			System.out.println("It is not");
		}

	}

}
