package chapters.chapter13.Listings13;

public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Edible) {
                System.out.println(((Edible) objects[i]).howToEat());
            }
            if (objects[i] instanceof Animal) {
                System.out.println(((Animal) objects[i]).sound());
            }
        }

    }
}

abstract class Animal {
    public abstract String sound();
}

class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }
    @Override
    public String sound(){
        return "Chicken: cock-a-doodle-doo";
    }
}
    class Tiger extends Animal{
        @Override
        public String sound() {
            return "Tiger: RROOAARR";
        }
    }


abstract class Fruit implements Edible {
    public abstract String color();

    public abstract String flavour();
}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple: Make apple cider";
    }

    @Override
    public String color() {
        return "red";
    }

    @Override
    public String flavour() {
        return "sweet";
    }

    class Orange extends Fruit {
        @Override
        public String howToEat() {
            return "Orange: Make orange juice";
        }

        @Override
        public String color() {
            return "Orange";
        }

        @Override
        public String flavour() {
            return "sour";
        }
    }

}