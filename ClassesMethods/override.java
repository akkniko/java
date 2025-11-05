package ClassesMethods;

public class override {
    public static class AreaCalculator {
        // overloading
        public double calculateArea(double radius) {
            System.out.print("Расчет площади круга: ");
            return Math.PI * radius * radius;
        }

        public int calculateArea(int length, int width) {
            System.out.print("Расчет площади прямоугольника: ");
            return length * width;
        }

        public double calculateArea(double base, int height) {
            System.out.print("Расчет площади треугольника: ");
            return 0.5 * base * height;
        }

        public static void main(String[] args) {
            AreaCalculator calculator = new AreaCalculator();
            System.out.println(calculator.calculateArea(5.0));
            System.out.println(calculator.calculateArea(4, 6));
            System.out.println(calculator.calculateArea(10.0, 5));
        }
    }

    // overriding
    class Animal {
        public void makeSound() {
            System.out.println("Животное издаёт звук");
        }

        public void sleep() {
            System.out.println("Животное спит");
        }

        public void info() {
            System.out.println("Это животное");
        }
    }

    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Гав-гав!");
        }

        @Override
        public void info() {
            System.out.println("Это собака");
        }
    }

    class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Мяу-мяу!");
        }

        @Override
        public void info() {
            System.out.println("Это кошка");
        }
    }
}