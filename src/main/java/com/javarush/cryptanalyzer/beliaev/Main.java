package com.javarush.cryptanalyzer.beliaev;

import com.javarush.cryptanalyzer.beliaev.constants.Alphabet;
import com.javarush.cryptanalyzer.beliaev.repository.ReadToFile;
import com.javarush.cryptanalyzer.beliaev.service.Coder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {
    public static void main(String[] args) throws IOException {

/*        ReadToFile rtf = new ReadToFile();
        rtf.readTxtFile;

        считывание файла
        выбрать прогон через шифратор или дешифратор
        Coder cod = new Coder;
        //cod.coder(rtf); мы берем наш файл
        вытаскиваем из него по символу циклом
        ищем символ в алфавите
        создаем новый файл
        записываем в файл по новому символ
*/
                //читаем файл - строку
        Scanner console = new Scanner(System.in);
        String vvod = console.nextLine();
        char[] vyvod = new char[vvod.length()];
            // шифруем ее
        int step = 2;
        for (int i = 0; i < vvod.length(); i++) {
            char buffer = vvod.charAt(i);                   //берем символ под индексом i
            int index = Alphabet.alphabet.indexOf(buffer);  //ищем в алфавите символ
            vyvod[i] = Alphabet.alphabet.charAt(index + step);
        }

        String vyvod2 = new String(vyvod);
        //запись в файл

        Path path = Path.of("testfile");
        if(Files.notExists(path)) {
            Files.createFile(path); //создаем файл
        }
        Files.writeString(path, vyvod2);


        System.out.println(Alphabet.alphabet);
        System.out.println(vyvod);
        System.out.println(vyvod2);
    }
}