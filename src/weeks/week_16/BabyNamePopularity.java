package weeks.week_16;

import java.io.File;
import java.util.Scanner;

public class BabyNamePopularity {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = input.nextInt();
        System.out.println("Enter the gender F/M:");
        String gender = input.next();
        System.out.println("Enter the name:");
        String name = input.next();


        File file = new File("babynameranking" + year + "s.txt");

        if(!file.exists()){
            System.out.println("File does not exists");
            System.exit(1);
        }

        try(
                Scanner in = new Scanner(file)
                ){
            while(in.hasNext()){
                int rank = in.nextInt();
                String maleName = in.next();
            }
        }

    }
}
