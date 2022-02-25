package ru.edu.lecture3;

import java.io.*;
import java.util.*;

public class FileHelperSymbolsStatistics {

    public static Map<Character, Integer> readFile(String fileName){

        Map<Character, Integer> number = new TreeMap<>();

        try(FileInputStream fis = new FileInputStream(fileName);
            BufferedReader is = new BufferedReader(new InputStreamReader(fis))) {
            List<Character> list = new ArrayList<>();

            int ch = is.read();
            while (ch != -1) {
                char symbol = (char) ch;
                list.add(symbol);
                ch = is.read();
            }
            for (char ww: list) {
                if (Character.isAlphabetic(ww)) {
                    if (number.containsKey(ww)) {
                        number.put(ww, number.get(ww) + 1);
                    } else {
                        number.put(ww, 1);
                    }
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return number;
    }
}
