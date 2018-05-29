import javax.swing.JOptionPane;
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
public class Products {
    private int qty_tall;
    private int qty_grande;
    private int price_tall;
    private int price_grande;
    private String img_path;
    
    public Products(String path){
        try{
            ReadFile file_read = new ReadFile(path);
            String[] aryLines = file_read.OpenFile();
            qty_tall = Integer.parseInt(aryLines[0]);
            qty_grande = Integer.parseInt(aryLines[1]);
            price_tall = Integer.parseInt(aryLines[2]);
            price_grande = Integer.parseInt(aryLines[3]);
            img_path = aryLines[4];
        }catch(IOException e){
            System.out.println("Error:\n" + e);
        }
    }
    
    public int getQuantity(int type){
        if(type==0){
            return qty_tall;
        }else{
            return qty_grande;
        }
    }
    
    public int getPrice(int type){
        if(type==0){
            return price_tall;
        }else{
            return price_grande;
        }
    }
    
    public String getImgPath(){
        return img_path;
    }
    
    public void setQuantity(int type, int quantity){
        if(type==0){
            qty_tall = quantity;
        }else{
            qty_grande = quantity;
        }
    }
    
    public void setPrice(int type, int price){
        if(type==0){
            price_tall = price;
        }else{
            price_grande = price;
        }
    }
    
    public void setImgPath(String path){
        img_path = path;
    }
}
