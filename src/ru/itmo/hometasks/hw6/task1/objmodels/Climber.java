package ru.itmo.hometasks.hw6.task1.objmodels;
public class Climber {
    private String name;
    private String address;


    public void setName(String name) {
        if (name==null||name.length()<3){throw new IllegalArgumentException("Имя альпиниста должно содержать не менее 3 символов");}
        this.name = name;
    }
    public void setAddress(String address) {
        if (address==null||address.length()<5){throw new IllegalArgumentException("Адрес проживания альпиниста должен содержать не менее 5 символов");}
        this.address = address;
    }

    public Climber(String name, String address) {
        setName(name);
        setAddress(address);
    }

    public String getNameAndAddress(){
        return name + ", " + address;
    }
}
