package ru.itmo.hometasks.hw7;

public class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name==null||name.length()<=2){throw new IllegalArgumentException("Имя должно состоять более чем из 2 букв");}
        this.name = name;
    }


    public void setAge(int age) {
        if (age<=5){throw new IllegalArgumentException("Возраст должен быть числом не меньше 6");}
        this.age = age;
    }

    public Human(String name, int age) {
        setAge(age);
        setName(name);
    }
}
