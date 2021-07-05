package com.company;

import java.io.*;

public class BufferedReaderExample {
    public static void readInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an input");
        String input = br.readLine();
        System.out.println(input);
    }

    public static void readInputFile() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\drsh0\\OneDrive\\Desktop\\BlackBird_curriculum_dsa.docx"));
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }
}