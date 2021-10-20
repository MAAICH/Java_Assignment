package Day3ClassWork;

public class StringBuilderDemo {
	public static void main(String[] args) {
		
	
	StringBuilder sbr1 = new StringBuilder("Hello");
	StringBuilder sbr2 = new StringBuilder("Hello");

	System.out.println();
	System.out.println(sbr1==sbr2); //reference - false
	System.out.println(sbr1.equals(sbr2)); //reference - false

	System.out.println(sbr1.capacity()); // 21
	System.out.println(sbr1.length()); // 5
	System.out.println(sbr1.append("manoj"));
	System.out.println(sbr1.length()); // 10
	System.out.println(sbr1.capacity()); // 44
}
}
