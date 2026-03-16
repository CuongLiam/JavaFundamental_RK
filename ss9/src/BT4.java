public class BT4 {
    static class Animal {
        public void sound() {
            System.out.println("Animal sound");
        }
    }

    static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }

        public void wagTail() {
            System.out.println("Dog wags tail");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Dog();

        animal.sound();

        if (animal instanceof Dog dog) {
            dog.wagTail();
        }
    }
}