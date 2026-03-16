public class BT2 {
    class Animal {
        public void makeSound() {
            System.out.println("Animal make a sound!");
        }
    }

    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Dog barks!");
        }
    }

    class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Cat meows!");
        }
    }

    public static void main(String[] args) {
        BT2 bt2 = new BT2();
        Animal animal1 = bt2.new Dog();
        Animal animal2 = bt2.new Cat();

        animal1.makeSound();
        animal2.makeSound();
    }
}