package lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {

    Map<String, ArrayList<String>> phoneDirectory = new HashMap<String, ArrayList<String>>();

    public void add(String firstName, String numberPhone) {
        ArrayList<String> phoneNumbers = phoneDirectory.get(firstName);
        if (phoneNumbers == null) phoneNumbers = new ArrayList<String>();
        phoneNumbers.add(numberPhone);
        phoneDirectory.put(firstName, phoneNumbers);
    }

    public ArrayList<String> get(String firstName) {
        return phoneDirectory.get(firstName);
    }

    @Override
    public String toString() {
        return "Телефонный справочник: " +
                phoneDirectory;
    }
}

