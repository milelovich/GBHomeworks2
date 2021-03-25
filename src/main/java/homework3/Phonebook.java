package homework3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private static HashMap<String, String> phoneBook = new HashMap<String, String>(); // Телефонная книга на основе HashMap<String, String>
                                                                                      // ключ - номер телефона в виде строки, значение - фамилия

    //addPhoneBook - добавляет запись по номеру телефона и фамилии
    private static void addPhoneBook(String phone, String name) {
        phoneBook.put(phone, name);
    }


//    public static String[] FindNumberPhone(String surname){
//        List<String> result = new ArrayList<String>();
//        for (Map.Entry entry : phoneBook.entrySet()) {
//            if (surname.equalsIgnoreCase((String)entry.getValue())){
//                result.add((String)entry.getKey());
//            }
//        }
//        if (result.size() == 0) result.add("абонент с такой фамилией не найден");
//        return result.toArray(new String[0]);
//    }

    public static void main(String[] args) {
        addPhoneBook("111111", "Ivanov");
        addPhoneBook("222222", "Petrov");
        addPhoneBook("333333", "Petrov");
        addPhoneBook("444444", "Lebedev");
        System.out.println(phoneBook);

//      FindNumberPhone("Lebedev");
//      Не получается сделать рабочий метод ((

    }

}

