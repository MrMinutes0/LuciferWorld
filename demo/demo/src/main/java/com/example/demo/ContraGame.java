package com.example.demo;
public class ContraGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Shoot and jump");
    }
    @Override
    public void down() {
        System.out.println("Sit Down");
    }
    @Override
    public void left() {
        System.out.println("Go Back");
    }
    @Override
    public void right() {
        System.out.println("Shoot");
    }
}
