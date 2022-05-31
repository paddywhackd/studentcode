package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Weave {
    public static void main(String[] args) {

        List<Integer> one = new ArrayList<>()

    }

    public static List<Integer> interLeaveLists(List<Integer> listOne,List<Integer> listTwo){
        List<Integer> results = new ArrayList<>();

        int shortSize = listOne.size();
        if(listTwo.size() < listOne.size()) {
            shortSize = listTwo.size();
        }

        for(int index = 0; index < listOne.size(); index++) {
            results.add(listOne.get(index));
            results.add(listTwo.get(index));

        }

        List<Integer> longList = null;
        if (listOne.size() > listTwo.size()) {
            longList = listOne;
        } else {
            longList = listTwo;
        }

        for(int index = shortSize; index < longList.size(); index++) {
            results.add(longList.get(index));
        }

        return results;
    }



}
