
package chapters.chapter12.Exercises12.Exercise24;

import java.io.File;
import java.io.PrintWriter;

//
public class Exercise12_24 {
    public static void main(String[] args) throws Exception {
        File file = new File("Salary.txt");
        PrintWriter output = new PrintWriter(file);
        for (int i = 1; i <= 1000; i++) {
            output.print("FirstName" + i + " LastName" + i + " ");
        int rank = (int)(Math.random() * 3);
            switch (rank){
            case 0: output.printf("assistant %2.3f" , (50_000 + (Math.random() * 30_000)));
            break;
                case 1: output.printf("associate %2.3f" , (60_000 + (Math.random() * 50_000)));
                break;
                case 2: output.printf("full %2.3f" , (75_000 + (Math.random() * 55_000)));
                break;
            }
output.println();
        }
        output.close();
    }
}
