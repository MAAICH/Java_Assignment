package Day3ClassWork;

import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
String str="flyingreturn.base@airindia.in"	;
//String str1="star.retros@airindia.in";
System.out.println(Pattern.matches("\\w{3,}@\\w{2,}\\.*",str));
String str2= "1860 233 1407";
System.out.println(Pattern.matches("[0-9]{4} [0-9]{3} [0-9]{4}",str2));
String str3= "020-26231407";
System.out.println(Pattern.matches("[0-9]{3}-[0-9]{6,8}",str3));
String str4="0930 hrs - 1730 hrs";
System.out.println(Pattern.matches("[0-9]{4} \\w -[0-9]{4} \\w",str4));
String str5="MTNL / BSNL";
//System.out.println(Pattern.matches(""));
	}

}
