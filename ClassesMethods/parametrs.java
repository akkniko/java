package ClassesMethods;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class parametrs {
    public class InstanceOfExample {
        public static void main(String[] args) {
            List<String> stringList = new ArrayList<>();
            List<Integer> intList = new ArrayList<>();
            ArrayList<String> arrayList = new ArrayList<>();

            // 1

            System.out.println(stringList instanceof List); // true
            System.out.println(stringList instanceof ArrayList); // true
            System.out.println(intList instanceof List); // true
            System.out.println(arrayList instanceof ArrayList); // true

            System.out.println(stringList instanceof List); // true
            System.out.println(intList instanceof List); // true
        }
    }

    // 2
    static class Animal {
    }

    static class Dog extends Animal {
    }

    static class Cat extends Animal {
    }

    public static class GenericInstanceOf {
        public static void main(String[] args) {
            List<Dog> dogs = new ArrayList<>();
            dogs.add(new Dog());

            List<Cat> cats = new LinkedList<>();
            cats.add(new Cat());

            checkCollection(dogs);
            checkCollection(cats);

            checkElements(dogs);
            checkElements(cats);
        }

        static void checkCollection(Object obj) {
            if (obj instanceof ArrayList) {
                System.out.println("Это ArrayList");
            } else if (obj instanceof LinkedList) {
                System.out.println("Это LinkedList");
            } else if (obj instanceof List) {
                System.out.println("Это List");
            }
        }

        static void checkElements(List<?> list) {
            for (Object element : list) {
                if (element instanceof Dog) {
                    System.out.println("Элемент - Dog");
                } else if (element instanceof Cat) {
                    System.out.println("Элемент - Cat");
                } else if (element instanceof Animal) {
                    System.out.println("Элемент - Animal");
                }
            }
        }
    }
}
