import java.util.*;

public class PhoneBook {

    private HashMap<Integer, String> phoneBook = new HashMap<>();

    void get(String searchName ) {
        Set<Integer> number = phoneBook.keySet();

            for (int num: number) {
                String[] split = phoneBook.get(num).split(" ");
              if (split[0].equals(searchName)) {
                  System.out.println(phoneBook.get(num) + " : " + num);
            }
        }
    }

        void add(int phone, String name ) {
        phoneBook.put(phone, name);
        }

    public HashMap<Integer, String> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(HashMap<Integer, String > phoneBook) {
        this.phoneBook = phoneBook;
    }



}
