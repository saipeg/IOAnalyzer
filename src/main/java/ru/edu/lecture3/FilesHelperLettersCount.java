package ru.edu.lecture3;

import java.io.*;

public class FilesHelperLettersCount {

    public static Integer readFile(String fileName){

        int result = 0;
        try(FileInputStream fis = new FileInputStream(fileName);
            InputStreamReader is = new InputStreamReader(fis)) {

            int ch = is.read();
            while (ch != -1){
                result++;
                ch = is.read();
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
}
