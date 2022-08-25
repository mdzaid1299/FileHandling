import java.io.*;
import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        TextAnalyzer textAnalyzer = new TextAnalyzer();
        //String fileData = textAnalyzer.readFile("C:\\Users\\Vaibhav.Diwan\\Desktop\\poem.txt");
        String fileData = textAnalyzer.readFile("resource/poem.txt");
        System.out.println(fileData);
        String fileName = "resource/output.txt";
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("enter some text");
        String content = scanner.nextLine();*//*
        System.out.println("enter fileName without space");
        fileName = scanner.nextLine();*/
        // adding resource path to it
        //fileName = "resource/".concat(fileName);
        //textAnalyzer.writeFile(fileData, fileName);



    }
    public String readFile(String poemFileName){
        String response = "";
        FileInputStream fileInputStream = null;
        int count = 0;
        try {
            fileInputStream = new FileInputStream(poemFileName);
            int data;
            do {
                data = fileInputStream.read();
                char readData = (char) data;
                response = response + readData;
                count++;
            }while(data !=  -1);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println(e);
        }
        System.out.println("count = " + count);
        return response;
    }

//    public void writeFile(String content, String fileName){
//        FileOutputStream fileOutputStream = null;
//        try {
//            fileOutputStream = new FileOutputStream(fileName);
//
//            for (int i = 0; i < content.length(); i++) {
//                char data = content.charAt(i);
//                int writeData = data;
//
//                fileOutputStream.write(writeData);
//                if(i == 150){
//                    fileOutputStream.close();
//                }
//            }
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            System.out.println(e);
//            e.printStackTrace();
//        }
//    }


}