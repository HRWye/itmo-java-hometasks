package ru.itmo.hometasks.hw6.task3;

public class Cat extends Mouse{
    private String name;
    private int weight;
    private Mouse[] trappedMice=new Mouse[100];

    public void setName(String name) {
        if (name==null||name.length()<3){throw new IllegalArgumentException("Имя кота должно состоять более чем из двух символов");}
        this.name = name;
    }
    public void setWeight(int weight) {
        if (weight<0){throw new IllegalArgumentException("Вес кота не может быть отрицательным числом");}
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }

    public Cat(String name, int speed, int weight) {
        super(speed);
        setName(name);
        setWeight(weight);
    }

    //метод, для ловли мышей.
    public void trapThisMouse(Mouse mouse) {
            if (mouse!=null&&getSpeed() >= mouse.getSpeed()) {
                System.out.println("Кот " + getName() + " поймал мышь");
                for (int i = 0; i < trappedMice.length; i++) {
                    if (trappedMice[i] == null) {
                        trappedMice[i] = mouse;
                        return;
                    }
                }
            } else if (mouse!=null&&getSpeed() < mouse.getSpeed()) {System.out.println("Мышь убежала, потому что быстрее чем кот " + getName());}
        }
    public void trapThisMouse(Mouse...trappedMice){
        for(Mouse mouse:trappedMice){
            trapThisMouse(mouse);
        }
    }

    //Метод, который позволяет победившему коту забрать мышей. Как я понял по задаче проигравший кот в любом случае остается без мышей, потому что, либо победитель ловит его мышей(если скорость их меньше)
    //либо они убегают(если скорость больше).
    public void mouseBarter(Cat cat) {
                for (int j = 0; j < cat.trappedMice.length; j++) {
                    if (cat.trappedMice[j] != null){
                    trapThisMouse(cat.trappedMice[j]);
                    cat.trappedMice[j] = null;}
                }
            }

    //Метод драки котов
    public void catFightsCat(Cat cat){
        if (getWeight()>cat.getWeight()){
            System.out.println(getName()+" победил и пытается забрать мышей у кота "+cat.getName());
                this.mouseBarter(cat);
            }
        else System.out.println(cat.getName()+" победил и пытается забрать мышей у кота "+getName());
                cat.mouseBarter(this);
    }
}
