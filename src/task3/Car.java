package task3;

public class Car {
    private int age;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this.age  = 2;
        this.speed = 250.5;
        this.weight = 500;
        this.color = "red";

    }

    public Car(int age) {
        this.age = age;
        this.speed = 300;
        this.weight = 600;
        this.color = "orange";

    }

    public Car(int age, double speed) {
        this.age = age;
        this.speed = speed;
        this.weight = 700;
        this.color = "black";
    }

    public Car(int age, double speed, int weight) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = "blue";
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
