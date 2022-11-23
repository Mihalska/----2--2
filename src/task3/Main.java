package task3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(4);
        Car car3 = new Car(6,350);
        Car car4 = new Car(8, 180, 800);
        Car car5 = new Car(9,220,900, "white");
        System.out.println("Age: " + car1.getAge() + " Speed: " + car1.getSpeed() + " Weight: " + car1.getWeight() + " Colour: " + car1.getColor());
        System.out.println("Age: " + car2.getAge() + " Speed: " + car2.getSpeed() + " Weight: " + car2.getWeight() + " Colour: " + car2.getColor());
        System.out.println("Age: " + car3.getAge() + " Speed: " + car3.getSpeed() + " Weight: " + car3.getWeight() + " Colour: " + car3.getColor());
        System.out.println("Age: " + car4.getAge() + " Speed: " + car4.getSpeed() + " Weight: " + car4.getWeight() + " Colour: " + car4.getColor());
        System.out.println("Age: " + car5.getAge() + " Speed: " + car5.getSpeed() + " Weight: " + car5.getWeight() + " Colour: " + car5.getColor());
    }
}
