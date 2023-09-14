package model;

public class Bird implements Flyer {
    @Override
    public void takeOff() {
        System.out.println("Flap Flap Flap");
    }

    @Override
    public void fly() {
        System.out.println("Glide Glide Flap");
    }

    @Override
    public void land() {
        System.out.println("Flap hop run run");
    }
}
