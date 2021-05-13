import java.util.ArrayList;
import java.util.HashMap;

public class Arrays {

    public void Array() {

        ArrayList<String> arrayList = new ArrayList<>(java.util.Arrays.asList());
        arrayList.add("Яблоко");
        arrayList.add("Апельсин");
        arrayList.add("Тыква");
        arrayList.add("Яблоко");
        arrayList.add("Манго");
        arrayList.add("Ананас");
        arrayList.add("Киви");
        arrayList.add("Яблоко");
        arrayList.add("Ананас");
        arrayList.add("Клубника");
        arrayList.add("Абрикос");
        arrayList.add("Груша");
        arrayList.add("Арбуз");
        arrayList.add("Груша");
        arrayList.add("Манго");
        arrayList.add("Виноград");
        arrayList.add("Груша");
        arrayList.add("Дыня");
        arrayList.add("Слива");
        arrayList.add("Машина");
        System.out.println(arrayList);

        HashMap<String, Integer> doub = new HashMap<>();
        ArrayList<String> uniqueArrayList = new ArrayList<>();
        HashMap<String, Integer> arrayMap = new HashMap<>();

        for (int i = 0; i < arrayList.size(); i++) {
            int n = 0;
            int a = 0;
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(j).equals(arrayList.get(i))) {
                    n += 1;
                }

            }
            if (n > 1) {

                doub.put(arrayList.get(i), n);

            } else {
                uniqueArrayList.add(arrayList.get(i));
                arrayMap.put(arrayList.get(i), n);
            }
        }
        System.out.println("Уникальные слова: " + "\n" + uniqueArrayList);

        System.out.println("Дубликаты: " + "\n" + doub);
        arrayMap.putAll(doub);
        System.out.println("Слова и сколько раз они повторяются " + "\n" + arrayMap);
    }


}
