package Lab2;
import java.util.Arrays;
public class SortString {
	

		public static void main(String[] args) {

			String [] stringArray = {"ab", "aBC", "c", "0", "2", "1Ad", "a10"};
		    sortString(stringArray);

		}

		public static void sortString(String[] sArr)
		{
		    Arrays.sort(sArr);
		    System.out.println(Arrays.toString(sArr));
		}
	}

