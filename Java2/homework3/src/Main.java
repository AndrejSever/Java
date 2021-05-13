public class Main {



    public static void main(String[] args) {
        //Задание №1
        Arrays words = new Arrays();
        words.Array();


        //Задание №2
        PhoneBook phoneBook1 = new PhoneBook();

        phoneBook1.add(2321321, "Иванов Иван Иванович");
        phoneBook1.add(131313, "Некрасов Фёдор Олегович");
        phoneBook1.add(6871144, "Жиган Пётр Ильич");
        phoneBook1.add(3454131, "Филатов Аркадий Иванович");
        phoneBook1.add(5555555, "Иванов Олег Игоревич");
        phoneBook1.add(880053535, "Миронов Андрей Александрович");
        phoneBook1.add(35132745, "Гагарин Юрий Алексеевич");
        phoneBook1.add(2435483, "Кондратенко Павел Игнатьевич");
        phoneBook1.add(3213443, "Жуков Андрей Николаевич");
        phoneBook1.add(312331, "Шепелев Кирил Владимироваич");
        phoneBook1.add(321354, "Перегудов Семён Викторович");
        phoneBook1.add(348641, "Журавлёв Сергей Михайлович");
        System.out.println("");
        System.out.println("Телефонная книга: "+ "\n" + phoneBook1.getPhoneBook());
        phoneBook1.get("Иванов");
        phoneBook1.get("Миронов");
        phoneBook1.get("Гагарин");

    }



}
