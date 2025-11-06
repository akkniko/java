package InheritancePolymorphism;

public class redefStat {
    static class A {
        public static void method() {
            System.out.println("A.method()");
        }
    }

    static class B extends A {
        // oшибка компиляции: нельзя использовать @Override для static
        // @Override
        public static void method() {
            System.out.println("B.method()");
        }
    }

    public class Main {
        public static void main(String[] args) {
            A a = new B();
            a.method(); // выведет "A.method()", а не "B.method()"

            B b = new B();
            b.method(); // выведет "B.method()"

            A.method(); // "A.method()"
            B.method(); // "B.method()"
        }
    }

}
