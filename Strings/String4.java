/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings;
import java.util.*;
public class String4 {
    public static void main(String[] args) {
        StringBuilder ab=new StringBuilder("Tony");
        System.out.println(ab);
        System.out.println(ab.charAt(0));
        // replace the char
        ab.setCharAt(0,'p');
        ab.insert(2, 'n');
        System.out.println(ab);
        // delete
        ab.delete(2, 3);
        System.out.println(ab);
        
    }
    
}
