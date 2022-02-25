package ru.edu.lecture3;

import java.io.*;
import java.util.*;

public class FileHelperTopNPopularSymbols {

    public static List<Character> readFile(Map<Character, Integer> methodSearch, int n) {

        Map<Integer, List<Character>> numberToChars = new HashMap<>();

        for (Map.Entry<Character, Integer> entry : methodSearch.entrySet()) {

            Character key = entry.getKey();
            int value = entry.getValue();

            if (!numberToChars.containsKey(value)) {
                numberToChars.put(value, new ArrayList<>());
            }
            List<Character> zdesDrugoiSpisok = numberToChars.get(value);
            zdesDrugoiSpisok.add(key);

        }

        System.out.println("numberToChars = " + numberToChars);

        List<Character> finalyList = new ArrayList<>();
        for (int i = 1; i < numberToChars.size(); i++) {
            Collections.reverse(numberToChars.get(i));
        }

        Collection<List<Character>> values = numberToChars.values();


        for (List<Character> spisok : values) {
            finalyList.addAll(spisok);
        }
        System.out.println("finalList = " + finalyList);
        Collections.reverse(finalyList);

        List<Character> result = new ArrayList<>();
        for (int i = 0; i <n; i++) { //cut list to current size
            result.add(finalyList.get(i));
        }

        return result;
    }
}
