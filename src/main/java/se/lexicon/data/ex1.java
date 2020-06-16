package se.lexicon.data;

import java.io.*;
import java.util.Scanner;

/**
        Create a textfile (.txt) and fill it with some text content. Tip: you can find random text here.
            a. In Java create a method that read in a String from file and return the String using FileReader.
 **/

public class ex1 {


    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {


    }

    public static String readFile() throws IOException{

      /*  System.out.print("Input filename: ");
        String file = inputText();*/
        StringBuilder stringBuilder = new StringBuilder();
        FileReader readFile = new FileReader("C:\\Java_Text\\test.txt");
            int i;
            while( (i = readFile.read()) != -1){
                char letters = (char) i;
                stringBuilder.append(letters);
        }
            readFile.close();
        return stringBuilder.toString();
    }

    public static void content() throws IOException {
        BufferedWriter out = null;
        String file = createFile();

        System.out.println("Enter text:");
        String string = inputText();

        try{
            File createFile = new File(file);
            out = new BufferedWriter(new FileWriter(createFile));
            out.write(string);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(out != null){
                out.close();
            }
        }
    }

    /** Create file **/
    public static String createFileName(){

        System.out.print("Enter filename:");
        String fileName = inputText()+".txt";
        return fileName;
    }
    public static String createDir(){
        System.out.println("(Default: C:\\Java_Text\\");
        System.out.print("Enter directory:");
        String dir = inputText();
        if(dir != "")
            dir = "C:\\Java_Text\\";
        return dir;
    }
    public static String createFile(){
        String dir = createDir();
        String fileName = createFileName();
        File newFile = null;
        String dirFile = null;
    try{
        newFile = new File(dir+fileName);
            if(newFile.createNewFile()){
                System.out.println("File created:"+newFile.getName());
            } else {
                System.out.println("File already exist");
            }
        }catch (IOException e){
        System.out.println("An error has occurred");
        e.printStackTrace();
    }
        return dir+fileName;
    }
    /** Create file end **/

    /** Input text **/
    public static String dummyText(){
        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor \n" +
                "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation\n" +
                " ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \n" +
                "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat\n" +
                " non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        return string;
    }
    public static String inputText(){
        return input.nextLine();
    }
    /** Input text end **/

    /** Print directory and filename **/
    public static String createFileDir(){
        String dir = "C:\\Java_Text\\";
        //System.out.println(dir);
        System.out.print("Enter Filename:");
        return dir+inputText();
    }
    public static void printDir(){
        String[] listFiles;
        File file = new File("C:\\Java_Text\\");
        listFiles =  file.list();
        System.out.println("FILES IN DIR: C:\\Java_Text\\");
        for(String printFiles : listFiles){
            System.out.println(printFiles);
        }
        System.out.println("--------------------------------");
    }
    public static void cmd(){
        System.out.println("CMD");

    }



}
