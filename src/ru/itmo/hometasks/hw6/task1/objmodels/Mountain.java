package ru.itmo.hometasks.hw6.task1.objmodels;
public class Mountain {
    private String title;
    private String country;
    private int high;


    public void setTitle(String title) {
        if (title == null || title.length() < 4) {
            throw new IllegalArgumentException("Название горы должно содержать не менее 4 символов");
        }
        this.title = title;
    }
    public String getTitle() {
        return title;
    }


    public void setCountry(String country) {
        if (country == null || country.length() < 4) {
            throw new IllegalArgumentException("Название страны должно содержать не менее 4 символов");
        }
        this.country = country;
    }
    public String getCountry() {
        return country;
    }


    public void setHigh(int high) {
        if (high < 100) {
            throw new IllegalArgumentException("Высота горы должна быть не менее 100 метров");
        }
        this.high = high;}

    public int getHigh() {
        return high;
    }


    public Mountain(String title, String country, int high) {
        setTitle(title);
        setCountry(country);
        setHigh(high);
    }
}