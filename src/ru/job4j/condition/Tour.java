package ru.job4j.condition;

public class Tour {

    public static void offer(boolean passport) {
    System.out.println("A client has foreigb passporn : " + passport);
    if (passport) {
        System.out.println("Tour abroad.");
        } else {
        System.out.println("tours in Russia.");
            }
}

    public static void main(String[] args) {
        Tour.offer(true);
        Tour.offer(false);
    }
}
