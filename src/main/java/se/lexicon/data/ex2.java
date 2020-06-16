package se.lexicon.data;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
    Create a textfile (.txt) and fill it with lines of names.
        a. In Java create a method that read in the lines into a Collection of your choice using BufferedReader.
           One line for each element in the Collection.
 **/

public class ex2 {

    public static void ex2(){


    }
    public static List<String> listName(){

        List<String> nameList = Arrays.asList(
                "Name1","Name2","Name3","Name4","Name5","Name6","Name7","Name8","Name9","Name10"
        );
        return nameList;
    }
    public static List<String> listOfNameFileSave(){
        String file = ex1.createFile();

        try(BufferedWriter print = new BufferedWriter(new FileWriter(file))){
            for( String toPrint : listName() ){
                print.write(toPrint.trim());
                print.newLine();
            }
            print.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listName();
    }
    public static void listOfNameFileRead(){
        // Print all the files in the dir
        ex1.printDir();
        String file = ex1.createFileDir();
        List<String> strings = new ArrayList<>();

    try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String lines;
            while( (lines = reader.readLine()) != null ){
                strings.add(lines);
            }
    } catch (IOException e){
        e.printStackTrace();
    }
        strings.forEach(System.out::println);
    }

}
