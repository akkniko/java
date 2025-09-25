package polytech.introduction;

public class firstLab {
    public static class Transport {
        void move() {
            System.out.println("move");
        }
    }

    public static class car extends Transport {
        @Override
        void move() {
            System.out.println("car move");
            super.move();
        }
    }

    public static class bicycle extends Transport {
        @Override
        void move() {
            System.out.println("bicycle move");
            super.move();
        }
    }

    public static void main(String[] args) {
        bicycle b = new bicycle();
        b.move();
        car c = new car();
        c.move();
        //наследованные классы не вызвают исключений/не ломают контракт, тк они делают то же, что и 
        //родительский класс, но они расширяют поведение класса транспорт
    }
}
