package weeks.week_14;

public class TestHome {
    public static void main(String[] args) {
        Home home1 = new Home();
        home1.print();
        Home home2 = new Home(120,2,6,true,200_000,1000,"Kuzey",2016);
        System.out.println("__________________________________________________________________\n");
        home2.print();
    }
}
