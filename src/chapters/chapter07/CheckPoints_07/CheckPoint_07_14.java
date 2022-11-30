
package chapters.chapter07.CheckPoints_07;

public class CheckPoint_07_14 {
    public static void main(String[] args) {
        int[] myList;
        myList = new int[10];
        for (int e: myList) {
            System.out.print(e);
        }
        System.out.println();
        myList = new int[20];
        for(int e : myList){
            System.out.print(e);
        }
        //It creates a new count at heap memory instead of resizing it.
    }
    }
