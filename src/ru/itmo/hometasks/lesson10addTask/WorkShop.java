package ru.itmo.hometasks.lesson10addTask;

public class WorkShop implements ChangeColor {
    private Vehicle[] vehicles= new Vehicle[3];
    private String name;

    public void addVehicle(Vehicle vehicle){
        for (int i=0;i<vehicles.length;i++){
            if (vehicles[i]==null){
                vehicles[i]=vehicle;
                return;
            }
        }
        System.out.println("Больше нельзя добавить транспортное средство");
    }
    public void addVehicle(Vehicle...vehicles){
        for(Vehicle vehicle:vehicles){
            addVehicle(vehicle);
        }
    }

    public void repairAll(){//чинит все транспортные средства
        for(Vehicle vehicle:vehicles){
            vehicle.repair();
        }
    }

    @Override
    public void changecolor(String color) {//меняет цвет всех транспортных средств
        for(Vehicle vehicle:vehicles){
            vehicle.changecolor(color);
        }
    }

    public WorkShop(String name) {
        if (name==null||name.length()<=2){throw new IllegalArgumentException ("Название мастерской должно содержать более 2 символов");}
        this.name=name;
    }

    public void printAll(){
        for(Vehicle vehicle:vehicles){
            System.out.println("Транспортное средство от компании "+vehicle.getCompany()+" имеет цвет - "+vehicle.getColor()+" и его состояние: "+vehicle.getCondition());
        }
    }
}
