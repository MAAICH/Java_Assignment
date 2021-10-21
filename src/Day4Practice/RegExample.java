package Day4Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExample {
	public static void main(String[] args) {
		String str2 = "1860 233 1407";
		String pattern = "";
		// System.out.println(Pattern.matches("[0-9]{4} [0-9]{3} [0-9]{4}",str2));
		Pattern p1 = Pattern.compile("pattern");
		Matcher m1 = p1.matcher(str2);
		System.out.println(m1.matches());
		System.out.println(m1.group(0));
		System.out.println(m1.group(1));
		System.out.println(m1.group(2));
		System.out.println(m1.group(3));
		if (m1.group(3).equals("1407")) {
			System.out.println("Success");
		} else {
			System.out.println("Failure");
		}
	}
}