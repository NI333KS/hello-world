/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nika.home.learnweb.utilities;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author NIKS
 */
public class FileUtility <T> {
    public static <T> void toTxt(T data) throws FileNotFoundException {
        
        PrintWriter out = new PrintWriter("C:\\Users\\NIKS\\Desktop\\test.txt");
        out.println(data);
        out.close();
    }
}
