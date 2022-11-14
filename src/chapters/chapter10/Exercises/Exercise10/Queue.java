package chapters.chapter10.Exercises.Exercise10;

public class Queue {
    private int[] elements;

    private int size;
    static final int DEFAULT_CAPACITY = 8;
    Queue(){
        elements = new int[DEFAULT_CAPACITY];
    }

    public void enqueue(int v){
       if((size) >= elements.length){
           int[] temp = new int[elements.length * 2];
           System.arraycopy(elements,0,temp,0,elements.length);
           elements = temp;
       }
        elements[size++] = v;
    }
    public int dequeue(){
       int result = 0;

       result = elements[0];
           size--;

        for (int i = 0; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
       return result;
    }
    public boolean empty(){
       return size == 0;
    }
    public int getSize(){
        return size;
    }
}
