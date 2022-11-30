
package chapters.chapter07.CheckPoints_07;

public class CheckPoint_07_15 {
    public static void main(String[] args) {
        int [] list ={1,2,3,5,4};
        for(int i = 0, j = list.length - 1;i < 2 ; i++, j--){  //There was a problem because of duplicite control system.We plus one to i
            int temp = list[i];                                //while we extract one from j.
            list[i] = list[j];
            list[j] = temp;
        }
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
}
