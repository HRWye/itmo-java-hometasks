package ru.itmo.hometasks.hwlesson14;
import java.util.*;
public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритета
        //  Ответ в консоль
        int countLow = 0, countMedium = 0, countHigh = 0, countUrgent = 0;
        for (Message message : messageList) {
            if (message.getPriority()==MessagePriority.LOW){
                countLow++;
            } else if (message.getPriority()==MessagePriority.MEDIUM){
                countMedium++;
            } else if (message.getPriority()==MessagePriority.HIGH){
                countHigh++;
            } else countUrgent++;
        }
        System.out.println("\nКоличество сообщений для каждого приоритета:\nLOW - "+countLow+
                ", MEDIUM - "+countMedium+
                ", HIGH - "+countHigh+
                ", URGENT - "+countUrgent+"\n");
    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        int[] counts = {0,0,0,0,0,0,0,0,0,0};
        for (Message message : messageList) {
            switch (message.getCode()) {
                case 0 -> counts[0]++;
                case 1 -> counts[1]++;
                case 2 -> counts[2]++;
                case 3 -> counts[3]++;
                case 4 -> counts[4]++;
                case 5 -> counts[5]++;
                case 6 -> counts[6]++;
                case 7 -> counts[7]++;
                case 8 -> counts[8]++;
                case 9 -> counts[9]++;
            }
        }
        System.out.println("\nКоличество сообщений для каждого кода сообщений:\n"+"для 0 - "+counts[0]+"; "
                +"для 1 - "+counts[1]+"; "
                +"для 2 - "+counts[2]+"; "
                +"для 3 - "+counts[3]+"; "
                +"для 4 - "+counts[4]+"; "
                +"для 5 - "+counts[5]+"; "
                +"для 6 - "+counts[6]+"; "
                +"для 7 - "+counts[7]+"; "
                +"для 8 - "+counts[8]+"; "
                +"для 9 - "+counts[9]+"\n");
    }

    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        System.out.println("\nКоличество уникальных сообщений - "+MessageTask.uniqueMessagesInOriginalOrder(messageList).size()+"\n");
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        List<Message> listOfUniqueMessages = new ArrayList<>();
        for (Message message : messageList) {
            if(!listOfUniqueMessages.contains(new Message(message.getCode(), message.getPriority()))){
                listOfUniqueMessages.add(message);
            }
        }
        return listOfUniqueMessages;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
        System.out.println("\nСписок до удаления элементов с приоритетом "+priority+"\n"+messageList);
        messageList.removeIf(message -> message.getPriority() == priority);
        /*Среда предложила сделать замену, до этого было:
        Iterator<Message> iterator =messageList.listIterator();
        while (iterator.hasNext()){
            if (iterator.next().getPriority()==priority){
                iterator.remove();
            }
        }*/
        System.out.println("Список после удаления элементов с приоритетом "+priority+":\n"+messageList+"\n");
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
        System.out.println("\nСписок до удаления элементов с приоритетом не равным "+priority+"\n"+messageList);
        messageList.removeIf(message -> message.getPriority() != priority);
        /*Среда предложила сделать замену, до этого было:
        Iterator<Message> iterator =messageList.listIterator();
        while (iterator.hasNext()){
            if (iterator.next().getPriority()!=priority){
                iterator.remove();
            }
        }*/
        System.out.println("Список после удаления элементов с приоритетом не равным "+priority+":\n"+messageList+"\n");
    }
}
