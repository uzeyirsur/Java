
package chapters.chapter11.CheckPoints11.CheckPoint4b;

public class CheckPoint11_20 {
    public static void main(String[] args) {
        Integer[] list1 ={12,24,55,1};
        Double[] list2 = {12.2,24.1,45.2};
        int[] list3 = {1,2,3};
        printArray(list1);
        printArray(list2);
       // printArray(list3); list3 is not a class.It is primitive type.
    }
    public static void printArray(Object[] list){
        for(Object o:list){
            System.out.print(o +  " ");

        }
        System.out.println();
    }
}
