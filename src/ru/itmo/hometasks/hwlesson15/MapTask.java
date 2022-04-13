package ru.itmo.hometasks.hwlesson15;
import java.util.*;

public class MapTask {

    // TODO:: написать статический метод, который принимает на вход мапу (firstTaskMap) и город (city)
    //  и формирует список (List) логинов, которые соответствуют переданному городу
    public static List<String> listFromCityFormer(HashMap<String, String> someMap, String someCity){
        List<String> loginsOfCity = new ArrayList<>();
        for (Map.Entry<String, String> pair : someMap.entrySet()) {
            if (pair.getValue().equalsIgnoreCase(someCity)){
                      loginsOfCity.add(pair.getKey());
            }
        }
        return loginsOfCity;
    }

    // TODO:: дан список слов (words).
    //  Написать статический метод, который будет возвращать количество одинаковых слов
    //  в списке вида Map<String, Integer>, где String - слово и Integer - количество повторений
    public static HashMap<String, Integer> repeatWordsMapFormer(List<String> someList) {
        //int count = repeatWordsMapFormer.getOrDefault ("may", 0) ...
        HashMap<String, Integer> repeatWordsMap = new HashMap<>();
        for (String word : someList) {
            if (!repeatWordsMap.containsKey(word)) {
                repeatWordsMap.put(word, Collections.frequency(someList, word));
            }
        }
        return repeatWordsMap;
    }

    // TODO:: дана мапа (customerMap).
    //  Написать статический метод, который принимает на вход аргументы int from и int to и возвращает
    //  новую мапу, в которую войдут все покупатели, возраст которых находится в диапазоне [from, to)
    public static HashMap<String, Customer> ageCustomerMapFormer (HashMap<String, Customer> someMap, int from, int to){
        HashMap<String, Customer> ageCustomerMap = new HashMap<>();
        for (Map.Entry<String, Customer> customer : someMap.entrySet()) {
            if (customer.getValue().getAge()>=from&&customer.getValue().getAge()<to){
                ageCustomerMap.put(customer.getKey(),customer.getValue());
            }
        }
        return ageCustomerMap;
    }

    // TODO:: Задания по тексту (text). На каждый пункт - минимум один метод (можно статический):
    /*1*/
    public static int frequencyOfSomeWordInSomeText(String someText, String someWord){
        List<String> listOfWords = new ArrayList<>(Arrays.asList(someText.split(" ")));
        return Collections.frequency(listOfWords, someWord);
    }

    /*2*/
    public static void wordGroupsByLengthFormer (String someText){
        List<String> listOfWords = new ArrayList<>(Arrays.asList(someText.split(" ")));
        for (int i =1; i<36; i++){
            List<String> specificListOfWords = new ArrayList<>();
            for (String word : listOfWords) {
                if (word.length()==i&&!specificListOfWords.contains(word)){
                    specificListOfWords.add(word);
                }
            }
            if (specificListOfWords.isEmpty()) continue;
            System.out.println("Список слов содержащих букв в количестве "+i+": "+specificListOfWords);
            specificListOfWords.clear();
        }
    }

    /*3*/ //не доделана
    public static void top10MostRepeatedWords (String someText){
        List<String> listOfWords = new ArrayList<>(Arrays.asList(someText.split(" ")));
        Map<Integer, String> sortedWords = new TreeMap<>();
        for (String word : listOfWords) {
            if (!sortedWords.containsValue(word)) {
                sortedWords.put(Collections.frequency(listOfWords, word), word);
            }
        }
        System.out.println(sortedWords);
    }


    public static void main(String[] args) {
        // TODO:: написать статический метод, который принимает на вход мапу (firstTaskMap) и город (city)
        //  и формирует список (List) логинов, которые соответствуют переданному городу

        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");

        String city = "Тверь";

        System.out.println("1 задача:\n"+listFromCityFormer(firstTaskMap, city)+"\n");

        // TODO:: дан список слов (words).
        //  Написать статический метод, который будет возвращать количество одинаковых слов
        //  в списке вида Map<String, Integer>, где String - слово и Integer - количество повторений

        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");

        System.out.println("2 задача:\n"+repeatWordsMapFormer(words)+"\n");


        // TODO:: дана мапа (customerMap).
        //  Написать статический метод, который принимает на вход аргументы int from и int to и возвращает
        //  новую мапу, в которую войдут все покупатели, возраст которых находится в диапазоне [from, to)

        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", "1", 23));
        customerMap.put("2", new Customer("Олег", "2", 17));
        customerMap.put("3", new Customer("Максим", "3", 48));
        customerMap.put("4", new Customer("Евгения", "4", 67));

        System.out.println("3 задача:\n"+ageCustomerMapFormer(customerMap, 17,50)+"\n");

        // в тексте содержатся только буквы и пробельные символы
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";
        // TODO:: Задания по тексту (text). На каждый пункт - минимум один метод (можно статический):
        //  1. написать метод, принимающий на вход слово и возвращающий частоту
        //  встречаемости данного слова в тексте

        System.out.println("4 задача, 1 пункт: "+frequencyOfSomeWordInSomeText(text,"a")+"\n");

        // TODO:: 2. написать метод, который собирает все слова в группы
        //  по количеству букв:
        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]

        System.out.println("4 задача, 2 пункт:");
        wordGroupsByLengthFormer(text);

        // TODO:: 3. написать метод, который выводит в консоль топ 10 самых частых слов

        System.out.println("4 задача, 3 пункт: ");
        top10MostRepeatedWords(text);

    }
}
