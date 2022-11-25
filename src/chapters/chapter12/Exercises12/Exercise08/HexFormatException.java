package chapters.chapter12.Exercises12.Exercise08;

public class HexFormatException extends Exception {
    public HexFormatException(){
        super("It is not a hex formation.");
    }
    public HexFormatException(String s){
        super(s);
    }
}
