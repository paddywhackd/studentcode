package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class LastTwo {
    public static void main(String[] args) {
        System.out.println(LastTwo.last2("hixxhi"));
        System.out.println(LastTwo.last2("xaxxaxaxx"));
        System.out.println(LastTwo.last2("axxxaaxx"));
        System.out.println(LastTwo.last2(""));
        System.out.println(LastTwo.last2(null));

    }

    public static int last2(String str) {
        int count = 0;

        if (str == null || str.length() < 2) {
            return count;
        }
        String lastTwo = str.substring(str.length() - 2);

        for (int index = 0; index < str.length() - 2; index++) {

            if (str.substring(index, index + 2).equals(lastTwo)) {
                count++;
            }
        }

        return count;

    }

    public static Map<String, Integer> last2Revisited(String[] words) {

        Map<String, Integer> counts = new HashMap<>();
    for (String word : words) {
        counts.put(word, LastTwo.last2(word));



    }
        return counts;

    }


}
