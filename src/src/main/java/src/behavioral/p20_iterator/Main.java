package src.behavioral.p20_iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Bez použití iterátoru
        System.out.println("Bez iterátoru:");

        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Markéta");
        names.add("Bedřich");
        names.add("David");
        names.add("Petr");

        int n = names.size();

        for (int i = 0; i < n; i++) {
           /* if (i == 2) {
                names.remove(i);
            }*/
            System.out.println("Name " + names.get(i));
        }

        System.out.println("S iterátoru:");
        CollectionOfNames collectionOfNames = new CollectionOfNames();

        for (Iterator iterator = collectionOfNames.getIterator(); iterator.hasNext();) {
            String name = iterator.next().toString();
            System.out.println("Name: " + name);
        }

        System.out.println("Reverse order:");
        for (Iterator iterator = collectionOfNames.getReverseIterator(); iterator.hasNext();) {
            String name = iterator.next().toString();
            System.out.println("Name: " + name);
        }
    }
}
