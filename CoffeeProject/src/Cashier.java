
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PepperBurst
 */
public class Cashier {
    private String name;
    private String password;
    private String path;
    
    public Cashier(String inPath){
        path = inPath;
        try{
            ReadFile file_read = new ReadFile(path);
            String[] aryLines = file_read.OpenFile();
            name = aryLines[0];
            password = aryLines[1];
        }catch(IOException e){
            System.out.println("Error:\n" + e);
        }
    }
    
    public String getName(){
        return name;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setName(String inName){
        name = inName;
    }
    
    public void setPassword(String inPassword){
        password = inPassword;
    }
    
    public void updateCredentials(){
        WriteFile data = new WriteFile(path);
        try{
            data.writeToFile(name + "\r\n" + password);
        }catch(IOException e){
            System.out.println("Error:\n" + e);
        }   
    }
}
