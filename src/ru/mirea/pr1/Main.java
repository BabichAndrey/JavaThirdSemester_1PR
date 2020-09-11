package ru.mirea.pr1;

public class Main {
    public static void main(String[] args) {
        Ball ball1 = new Ball(100,100);
        System.out.println(ball1);
        ball1.move(0,15);
        System.out.println(ball1);
    }
}
