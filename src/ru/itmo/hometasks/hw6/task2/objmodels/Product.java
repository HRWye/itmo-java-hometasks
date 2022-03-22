package ru.itmo.hometasks.hw6.task2.objmodels;

public class Product {
    private String name;
    private int protein;
    private int fat;
    private int carbo;
    private int cal;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name==null||name.length()<3){throw new IllegalArgumentException("Имя продукта должно содержать не менее 3 символов");}
        this.name = name;
    }

    public int getProtein() {
        return protein;
    }
    public void setProtein(int protein) {
        if(protein<1){throw new IllegalArgumentException("Содержание компонента не менее 1");}
        this.protein = protein;
    }

    public int getFat() {
        return fat;
    }
    public void setFat(int fat) {
        if(fat<0){throw new IllegalArgumentException("Содержание компонента не менее 0");}
        this.fat = fat;
    }

    public int getCarbo() {
        return carbo;
    }
    public void setCarbo(int carbo) {
        if(carbo<10){throw new IllegalArgumentException("Содержание компонента не менее 10");}
        this.carbo = carbo;
    }

    public int getCal() {
        return cal;
    }
    public void setCal(int cal) {
        if(cal<50){throw new IllegalArgumentException("Содержание компонента не менее 50");}
        this.cal = cal;
    }

    public Product(String name, int protein, int fat, int carbo, int cal) {
        setName(name);
        setProtein(protein);
        setFat(fat);
        setCarbo(carbo);
        setCal(cal);
    }
    public Product(String name) {
        setName(name);
    }
    public Product(int protein, int fat, int carbo) {
        setProtein(protein);
        setFat(fat);
        setCarbo(carbo);
    }
}
