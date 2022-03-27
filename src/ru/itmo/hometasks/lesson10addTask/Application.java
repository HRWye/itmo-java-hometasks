package ru.itmo.hometasks.lesson10addTask;

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car("белый","KIA",5,"A250");
        car1.changecolor("серый");
        Bike bike1 = new Bike("желтый", "Stels", 6,"дорожный");
        bike1.repair();
        Train train1 = new Train("красный", "РЖД", 2,10);

        WorkShop workShop = new WorkShop("У дяди Вани");

        workShop.addVehicle(car1,bike1,train1);

        workShop.repairAll();
        workShop.repairAll();
        workShop.repairAll();
        workShop.repairAll();
        workShop.changecolor("фиолетовый");

        workShop.printAll();
    }
}
