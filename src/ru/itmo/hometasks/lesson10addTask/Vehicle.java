package ru.itmo.hometasks.lesson10addTask;

abstract public class Vehicle implements ChangeColor {
    private String color;
    private String company;
    private int condition;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if (color==null||color.length()<=2){throw new IllegalArgumentException("Название цвета должно содержать минимум 2 символа");}
        this.color = color;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        if (company==null||company.length()<=2){throw new IllegalArgumentException("Название компании должно содержать минимум 2 символа");}
        this.company = company;
    }
    public int getCondition() {
        return condition;
    }
    public void setCondition(int condition) {
        if (condition<1||condition>10){throw new IllegalArgumentException("Cостояние машины должно быть целым числом от 1 до 10");}
        this.condition = condition;
    }

    public Vehicle(String color, String company, int condition) {
        setColor(color);
        setCompany(company);
        setCondition(condition);
    }

    @Override
    public void changecolor(String color) {
        this.color=color;
    }

    abstract public void repair();

}
