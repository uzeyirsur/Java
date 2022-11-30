package chapters.chapter12.Exercises12.Exercise26;

import java.io.File;
import java.util.Scanner;

public class Exercise12_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a directory name to create:");

        File dir = new File(input.next());

    if(dir.exists()){
        System.out.println(dir.getName() + " is already exists");
        System.exit(1);
    }
    if(dir.mkdirs()){
        System.out.println("Directory created successfully");
    }else{
        System.out.println("Directory already exists");
    }

    }
}
