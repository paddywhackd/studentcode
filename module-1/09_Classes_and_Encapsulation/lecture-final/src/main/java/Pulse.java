import java.util.HashMap;
import java.util.Map;

public class Pulse {
    public static void main(String[] args) {

        Map<Integer, Integer> mymap = new HashMap<>();
        mymap.put(1,1);
        mymap.put(2,2);

        for (Map.Entry<Integer, Integer> entry : mymap.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

        int[] array = null;
        for(int index=0; index < array.length; index++) {
            int theValue = array[index];
            // do something useful
        }

        for (int theValue : array) {

        }



    }
}
