package ep3;

public class ep3 {
    interface Swimmable {
        void swim();
    }

    interface Flyable {
        void fly();
    }

    abstract class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }
    }

    class Duck extends Animal implements Swimmable, Flyable {
        public Duck(String name) {
            super(name);
        }

        @Override
        public void swim() {
            System.out.println(name + " dang boi loi.");
        }

        @Override
        public void fly() {
            System.out.println(name + " dang bay.");
        }
    }

    class Fish extends Animal implements Swimmable {
        public Fish(String name) {
            super(name);
        }

        @Override
        public void swim() {
            System.out.println(name + " dang boi loi.");
        }
    }

    public static void ep3Main() {
        ep3 ep3 = new ep3();
        Duck duck = ep3.new Duck("Vịt");
        Fish fish = ep3.new Fish("Cá");

        duck.swim();
        duck.fly();
        fish.swim();
    }
}
