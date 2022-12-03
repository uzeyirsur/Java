package chapters.chapter13.CheckPoints13;

interface CheckPoint16 {
   void m1();
}
class B implements CheckPoint16{
    @Override
   public void m1(){
        System.out.println("m1");
    }
}
