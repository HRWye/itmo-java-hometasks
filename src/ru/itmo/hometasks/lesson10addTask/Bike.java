package ru.itmo.hometasks.lesson10addTask;

public class Bike extends Vehicle {
    private String type;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        if (type==null||type.length()<=2){throw new IllegalArgumentException("Тип велосипеда должен содержать более чем 2 символа");}
        this.type = type;
    }

    public Bike(String color, String company, int condition, String type) {
        super(color, company, condition);
        setType(type);
    }

    @Override
    public void repair() {
        if (getCondition()<=9){
        setCondition(getCondition()+1);}
        else System.out.println("Велосипед в идеальном состоянии и не требует починки");
    }
}
