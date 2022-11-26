package chapters.chapter12.Exercises12.Exercise13;

import java.io.File;
import java.util.Scanner;

public class Exercise12_13 {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Please check your file name");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("There is no file named " + args[0]);
            System.exit(2);
        }
        int lines = 0;
        int characters = 0;
        int words = 0;
        try (
                Scanner input = new Scanner(file);
        ){
            while(input.hasNext()){
                lines++;
                String line = input.nextLine();
                characters += line.length();
                words += countWords(line);
            }
        }
        System.out.println("File " + file.getName() + " has:");
        System.out.println(characters + " characters");
        System.out.println(words + " words");
        System.out.println(lines + " lines");
    }
    public static int countWords(String s){
        String[] wordArray = s.split(" ");
        return wordArray.length;
    }
}
