/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIUtility;

import java.awt.Component;
import java.util.Hashtable;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sanket
 */
public class Utility {
    static public String checkEmptyField(Hashtable<String, String> data){
        String message = "";
        for (String key: data.keySet()){
            if(data.get(key).length() == 0 ){
                message = message+" please enter value for "+ key + "\n";
            }
        }
        return message;
    }
    
    static public Hashtable<String, String> readData(JPanel panel){
        Hashtable<String,String> data = new Hashtable<String, String>();
        
        for (Component comp : panel.getComponents()){
            if (comp instanceof JTextField){
                if(comp.getName() != null){
                    data.put(comp.getName(), ((JTextField) comp).getText());
                }
            }
        }
        return data;
    } 
    
    static public boolean checkIntegerInput(String num){
        boolean validInput;
        try {
            int number = Integer.parseInt(num);
            validInput = true;
        } 
        catch (Exception e) {
            validInput = false;
        }
        return validInput;
        }
    
    static public boolean checkDoubleValueInput(String value){
        boolean validInput;
        try{
            double dble = Double.parseDouble(value);
            validInput = true;
        }
        catch(Exception e){
            validInput = false;
        }
        return validInput;
    }
 }

