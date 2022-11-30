
package weeks.week_15;

public class Bus extends Vehicles{
    private int passengerSeat;

    public Bus() {
       super();
       this.passengerSeat = passengerSeat;
    }

    public Bus(String brand, String model, int wheels, int year, String color, boolean hasSunRoof, int passengerSeat) {
        super(brand, model, wheels, year, color, hasSunRoof);
        this.passengerSeat = passengerSeat;
    }
}
