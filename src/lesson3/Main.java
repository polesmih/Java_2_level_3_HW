package lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        arrayWords();
        usePhoneDirectory();
    }

    // task 1
    public static void arrayWords() {
        List<String> words = new ArrayList<>(Arrays.asList("book", "table", "mouse", "book", "computer",
                "shelf", "watch", "chair", "book", "computer", "paper", "mouse",
                "calendar", "door", "pencil", "computer", "book"));

        Set<String> uniq = new LinkedHashSet<>(words);
        System.out.println("Уникальные слова: " + uniq + ", ");

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        Integer val;

        for (String countWords : words) {
            val = hm.get(countWords);
            if (val == null) hm.put(countWords, 1);
            else
                hm.put(countWords, val + 1);
        }

        System.out.print("Количество упоминаний каждого слова массива: ");
        System.out.println(hm);
    }

    // task 2
    static void usePhoneDirectory() {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Иванов", "123");
        phoneDirectory.add("Петров", "456");
        phoneDirectory.add("Иванов", "789");
        phoneDirectory.add("Жданов", "987");
        phoneDirectory.add("Суворов", "654");
        phoneDirectory.add("Петров", "321");
        phoneDirectory.add("Попов", "159");
        phoneDirectory.add("Лавров", "357");

        System.out.println(phoneDirectory);
        System.out.println(phoneDirectory.get("Иванов"));
    }
}
