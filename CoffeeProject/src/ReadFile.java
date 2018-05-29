/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mizzu
 */
public class ReadFile {
    private String path;
    
    public ReadFile(String file_path){
        path = file_path;
    }
    
    public String[] OpenFile() throws IOException{
        FileReader fr = new FileReader(path);
        String[] textData;
        try (BufferedReader textReader = new BufferedReader(fr)) {
            int numberOfLines = readLines();
            textData = new String[numberOfLines];
            int i;
            for(i=0;i<numberOfLines;i++){
                textData[i] = textReader.readLine();
            }
        }
        return textData;
    }
    
    int readLines() throws IOException{
        FileReader file_to_read = new FileReader(path);
        int numberOfLines;
        try (BufferedReader bf = new BufferedReader(file_to_read)) {
            String aLine;
            numberOfLines = 0;
            while((aLine=bf.readLine())!=null){
                numberOfLines++;
            }
        }
        return numberOfLines;
    }


}
