package Lab6CollectionFramework;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SecondSmallest {
      
       public int getSecondSmallest(int[] arr){
              List<Integer> intList = new ArrayList<Integer>();
              for(int i: arr){
                     intList.add(i);
              }
              Collections.sort(intList);
              return intList.get(1);
       }
       public static void main(String[] args) {
    	   SecondSmallest  p = new SecondSmallest();
              int arr[] = {68,34,69,86,32,46,87,43,66,7,2,60,54,53};
              int i = p.getSecondSmallest(arr);
              System.out.println(i);
       }

}

