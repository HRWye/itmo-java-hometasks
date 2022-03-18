package ru.itmo.hometasks.hw6.task1;
import ru.itmo.hometasks.hw6.task1.objmodels.Climber;
import ru.itmo.hometasks.hw6.task1.objmodels.Group;
import ru.itmo.hometasks.hw6.task1.objmodels.Mountain;
public class Application {
    public static void main(String[] args) {

      Climber climber1 = new Climber("Ivan", "Moscow");
      Climber climber2 = new Climber("Mike", "Texas");
      Climber climber3 = new Climber("Alexander", "Saint-Petersburg");
      Climber climber4 = new Climber("Dave", "Paris");
      Climber climber5 = new Climber("Duarte", "Maputo");
      Climber climber6 = new Climber("Robert", "Kazan");
      Climber climber7 = new Climber("Ramil", "Berlin");

      Mountain mountain1 = new Mountain("Everest", "Nepal", 8849);
      Mountain mountain2 = new Mountain("Chogori", "Pakistan", 8611);
      Mountain mountain3 = new Mountain("Elbrus", "Russia", 5642);

      Group group1 = new Group(mountain1);
      Group group2 = new Group(mountain2);
      Group group3 = new Group(mountain3);

      group1.addClimber(climber1,climber2,climber3);
      group2.addClimber(climber4,climber5);
      group3.addClimber(climber6,climber7);
    }
}
