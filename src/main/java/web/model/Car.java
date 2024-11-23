package web.model;

import java.util.Objects;

public class Car {
    private String name;
    private int hp;
    private String color;

    public Car(String name, int hp, String color) {
        this.name = name;
        this.hp = hp;
        this.color = color;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return hp == car.hp && Objects.equals(name, car.name) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hp, color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", color='" + color + '\'' +
                '}';
    }
}
