package ru.itmo.hometasks.lesson10addTask;

public class Car extends Vehicle {
    private String number;

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        if (number==null||number.length()<=2){throw new IllegalArgumentException("Номер машины должен содержать более чем два символа");}
        this.number = number;
    }

    public Car(String color, String company, int condition, String number) {
        super(color, company, condition);
        setNumber(number);
    }

    @Override
    public void repair() {
        if (getCondition()<=8){
        setCondition(getCondition()+2);}
        else if (getCondition()==9){
            setCondition(getCondition()+1);}
        else System.out.println("Машина в идеальном состоянии и не требует починки");
    }
}
