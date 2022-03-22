package ru.itmo.hometasks.hw6.task1.objmodels;
import ru.itmo.hometasks.hw6.task1.objmodels.Climber;
import java.util.Arrays;
public class Group {
    private final Mountain mountain;
    int i;

    public Group(Mountain mountain) {
        this.mountain = mountain;
    }

    /*
    Группа альпинистов будет состоять из 3 человек. После заполнения массива группа закрывается и начинается восхождение на гору.
    Если группа не полная и открыта, программа попросит добавить альпинистов для начала восхождения.
    При добавлении в закрытую группу других альпинистов. Восхождение не начнется и программа попросит удалить лишних участников.
    */

    private final Climber[] climbers = new Climber[3];
    public void addClimber(Climber climber){
        for (i=0;i<climbers.length;i++){
            if (climbers[i]==null){
                climbers[i]=climber;
                System.out.print(climber.getNameAndAddress()+"; ");
                return;
            }}
        System.out.println("Набор закрыт, группа для восхождения на гору "+mountain.getTitle()+" полная. В группе максимальное количество мест: "+climbers.length+". Удалите необходимое количество участников, для начала восхождения.");
    }
    public void addClimber(Climber...climbers){
        System.out.print("Альпинисты: ");
        for (Climber climber:climbers){
            addClimber(climber);
        }
        if (i==(this.climbers.length-1)){System.out.println(" - группа закрыта и начинает восхождение на гору "+mountain.getTitle()+" в "+mountain.getCountry()+" высотой "+mountain.getHigh()+" м." );}
        else if (i<(this.climbers.length-1))System.out.println(" - группа восхождения на гору "+mountain.getTitle()+ " открыта. Чтобы начать восхождение, заполните группу до конца." );
    }
}
