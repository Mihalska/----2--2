package task4;

public class Car {
    private int age;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this (10);

    }

    public Car(int age) {
        this (12, 209);
    }

    public Car(int age, double speed) {
        this.age = age;
        this.speed = speed ;

    }

    public Car(int age, double speed, int weight) {
        this (15,230,900, "blue");
    }

    public Car(int age, double speed, int weight, String color) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
