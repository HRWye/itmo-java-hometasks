package ru.itmo.hometasks.lesson10addTask;

public class Train extends Vehicle {
    private int van;

    public int getVan() {
        return van;
    }
    public void setVan(int van) {
        if (van<0){throw new IllegalArgumentException("Количество вагонов должно быть положительным числом");}
        this.van = van;
    }

    public Train(String color, String company, int condition, int van) {
        super(color, company, condition);
        setVan(van);
    }

    @Override
    public void repair() {
        System.out.println("Вы пытались починить поезд. Поезда чинить нельзя!");
    }
}
