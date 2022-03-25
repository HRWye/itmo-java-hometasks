package ru.itmo.hometasks.hw6.task3;

public class Mouse {
    private int speed;

    public void setSpeed(int speed) {
        if (speed<0){throw new IllegalArgumentException("Скорость должна быть положительным числом");}
        this.speed = speed;
    }

    public Mouse(int speed) {
        setSpeed(speed);
    }
    public int getSpeed() {
        return speed;
    }
}
