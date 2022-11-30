
package chapters.chapter12.Listings12;

import java.io.*;


public class WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
        if(file.exists()){
            System.out.println("File already exists");
            return;
        }
        PrintWriter output = new PrintWriter(file);
        output.print("John T Smith");
        output.println(90);
        output.print("Eric");
        output.println(85);
        output.close();
    }
}
