/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author mizzu
 */
public class WriteFile {
    private String path;
    private boolean append_to_file = false;
    
    public WriteFile (String file_path){
        path = file_path;
    }
    
    public WriteFile( String file_path , boolean append_value ) {
        path = file_path;
        append_to_file = append_value;
    }
    
    public void writeToFile( String textLine ) throws IOException {
        FileWriter write = new FileWriter( path , append_to_file);
        try (PrintWriter print_line = new PrintWriter( write )) {
            print_line.printf("%s"+"%n", textLine);
        }
    }
}
