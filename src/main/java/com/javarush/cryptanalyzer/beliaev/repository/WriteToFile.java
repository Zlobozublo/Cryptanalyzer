package com.javarush.cryptanalyzer.beliaev.repository;

import java.io.File;

public class WriteToFile {
    public static void writeTxtFile(){
        String path = "тут будет путь";
        File outPutFile = new File(path);

        try{
            boolean file = outPutFile.createNewFile();
            System.out.println("File created!");
        } catch (Exception E){
            System.out.println("ПОТРАЧЕНО");
        }
    }
}
