package se.lexicon.data;

import java.io.*;

/**
 * Create a method that can copy a file using both BufferedInputStream and BufferedOutputStream.
 */

public class ex4 {

    public static void copyFile(){
        String copyFile = "C:\\Java_Text\\test.txt";
        String toFile = "C:\\Java_Text\\testCopy.txt";

    try(
            BufferedInputStream inFile = new BufferedInputStream(new FileInputStream(copyFile));
            BufferedOutputStream outFile = new BufferedOutputStream(new FileOutputStream(toFile));
    ){
            byte[] _byte = new byte[32*1024];
                int i;
                while( (i = inFile.read(_byte)) > 0 ) {
                    outFile.write(_byte, 0, i);
                    outFile.flush();
                }
                } catch (IOException e){
                    e.printStackTrace();
        }

    }
}

