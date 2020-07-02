import java.io.*;
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner c= new Scanner(System.in);
    String fileName=c.nextLine();
    File source= new File(fileName);
    if(!source.exists()){
      System.out.println("File doesn't exists!");
      System.exit(2);
    }
    try{
    Scanner sc = new Scanner(source);
    System.out.println("File opened");
    String line;
    int characterCount=0;
    int wordsCount=0;
    int linesCount=0;
    while(sc.hasNextLine()){
      line=sc.nextLine();
      linesCount++;
      String[] words= line.split(" ");
      wordsCount +=words.length;
      for(String token: words){
        characterCount +=token.length();
      }
    }
    System.out.println("Number of words: "+wordsCount);
    System.out.println("Number of characters: "+characterCount);
    System.out.println("Number of Lines: "+linesCount);
    }
    catch ( FileNotFoundException e ) {
        System.out.println("Could not find file: ");
    }
  }
}