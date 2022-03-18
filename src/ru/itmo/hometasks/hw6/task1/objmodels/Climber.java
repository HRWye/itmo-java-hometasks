package ru.itmo.hometasks.hw6.task1.objmodels;
public class Climber {
    public String name;
    public String address;


    public void setName(String name) {
        if (name==null||name.length()<3){throw new IllegalArgumentException("Имя альпиниста должно содержать не менее 3 символов");}
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setAddress(String address) {
        if (address==null||address.length()<5){throw new IllegalArgumentException("Адрес проживания альпиниста должен содержать не менее 5 символов");}
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public Climber(String name, String address) {
        setName(name);
        this.name = name;
        setAddress(address);
        this.address = address;
    }

    public void printNameAndAddress(){
        System.out.println(name + ", " + address);
    }

    public String getNameAndAddress(){
        return name + ", " + address;
    }
}
