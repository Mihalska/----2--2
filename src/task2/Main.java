package task2;

public class Main {
    public static void main(String[] args) {

    Car car1 = new Car() ;
    Car car2 = new Car(7);
    Car car3 = new Car(10, "blue");
        System.out.println("Age: " + car1.getAge() + "  Color: " + car1.getColor() );
        System.out.println("Age: " + car2.getAge() + "  Color: " + car2.getColor() );
        System.out.println("Age: " + car3.getAge() + "  Color: " + car3.getColor() );
    }
}
