package ep2;

public class ep2 {
    abstract class Vehice {
        protected String brand;

        public Vehice(String brand) {
            this.brand = brand;
        }

        public abstract void move();
    }

    class Car extends Vehice {
        public Car(String brand) {
            super(brand);
        }

        @Override
        public void move() {
            System.out.println(brand + "Cach di chuyen: Di chuyen tren duong bang dong co");
        }
    }

    class Bicycle extends Vehice {
        public Bicycle(String brand) {
            super(brand);
        }

        @Override
        public void move() {
            System.out.println(brand + "Cach di chuyen: Di chuyen tren duong bang suc nguoi");
        }
    }

    public static void ep2Main() {
        ep2 ep2 = new ep2();
        Car car = ep2.new Car("Toyota ");
        Bicycle bicycle = ep2.new Bicycle("Giant ");

        car.move();
        bicycle.move();
    }
}
