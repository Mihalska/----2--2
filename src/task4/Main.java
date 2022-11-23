package task4;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car( 2);
        Car car3 = new Car(4, 200);
        Car car4 = new Car(5, 220, 500);
        Car car5 = new Car(7,250,600,"red");
        System.out.println("Age: " + car1.getAge()  + " Speed: " + car1.getSpeed() );
        System.out.println("Age: " + car2.getAge() + " Speed: " + car2.getSpeed());
        System.out.println("Age: " + car3.getAge() + " Speed: " + car3.getSpeed());
        System.out.println("Age: " + car4.getAge() + " Speed: " + car4.getSpeed() + " Weight: " + car4.getWeight() + " Color: " + car4.getColor());
        System.out.println("Age: " + car5.getAge() + " Speed: " + car5.getSpeed() + " Weight: " + car5.getWeight() + " Color: " + car5.getColor());
    }
}
