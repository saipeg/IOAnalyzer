package ru.edu.lecture3;

import java.io.*;
import java.util.*;

public class FileAnalyserImpl implements FileAnalyser {


    private String text;

    public FileAnalyserImpl() {
    }

    public FileAnalyserImpl(String filePath) {
        text = filePath;
    }

    @Override
    public String getFileName() {
        File file = new File(text);
        return file.getName();
    }

    @Override
    public int getRowsCount() {
        FileHelperRowsCount read = new FileHelperRowsCount();
        int zas = read.readFile(text);
        return zas;
    }

    @Override
    public int getLettersCount() {
        FilesHelperLettersCount read = new FilesHelperLettersCount();
        int numberSumbol = read.readFile(text);
        return numberSumbol;
    }

    @Override
    public Map<Character, Integer> getSymbolsStatistics() {
        FileHelperSymbolsStatistics read = new FileHelperSymbolsStatistics();
        Map<Character, Integer> vyvod = read.readFile(text);
        System.out.println("vyvod from super method= " + vyvod);
        return vyvod;
    }

    @Override
    public List<Character> getTopNPopularSymbols(int n) {
//        Map<Character, Integer> methodSearch = getSymbolsStatistics();

        FileHelperTopNPopularSymbols fileHelperTopNPopularSymbols = new FileHelperTopNPopularSymbols();
        List<Character> resultPopularSymbols = fileHelperTopNPopularSymbols.readFile(getSymbolsStatistics(), n);
        return resultPopularSymbols;
    }

    @Override
    public void saveSummary(String filePath) {
        Map<String, Object> objectObjectHashMap = new HashMap<>();
    }
}
