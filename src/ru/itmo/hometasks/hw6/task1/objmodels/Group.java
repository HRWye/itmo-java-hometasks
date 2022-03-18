package ru.itmo.hometasks.hw6.task1.objmodels;
import ru.itmo.hometasks.hw6.task1.objmodels.Climber;
import java.util.Arrays;
public class Group {

    private Mountain mountain;
    public Mountain getMountain() {
        return mountain;
    }
    public void setMountain(Mountain mountain) {
        this.mountain = mountain;
    }

    private Climber[] climbers = new Climber[3];
    public void addClimber(Climber climber){
        for (int i=0;i<climbers.length;i++){
            if (climbers[i]==null){
                climbers[i]=climber;
                return;
            }
        }
        System.out.println("Мест нет, группа для восхождения на гору "+mountain.getTitle()+" полная");
    }
    public void addClimber(Climber...climbers){
        System.out.print("Альпинисты: ");
        for (Climber climber:climbers){
            addClimber(climber);
            System.out.print(climber.getNameAndAddress()+"; ");
        }
        System.out.print(" - восходят на гору "+mountain.getTitle()+" в "+mountain.getCountry()+" высотой "+mountain.getHigh()+" м.\n" );
    }

    public Group(Mountain mountain) {
        this.mountain = mountain;
    }
}
