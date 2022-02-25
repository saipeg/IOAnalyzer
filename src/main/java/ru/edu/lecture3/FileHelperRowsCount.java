package ru.edu.lecture3;

import java.io.*;

public class FileHelperRowsCount {

    public static Integer readFile(String fileName){

        int result = 0;
        try(FileInputStream fis = new FileInputStream(fileName);
            BufferedReader is = new BufferedReader(new InputStreamReader(fis))) {

            String line = is.readLine();
            while (line != null){
                result++;
                line = is.readLine();
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
}