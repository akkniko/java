package ClassesMethods;

public class OverloadMethods {

    public static class A {
        public void printNum(Integer i) {
            System.out.printf("Integer = %d%n", i);
        }

        public void printNum(int i) {
            System.out.printf("int = %d%n", i);
        }

        public void printNum(Float f) {
            System.out.printf("Float = %.4f%n", f);
        }

        public void printNum(Number n) {
            System.out.println("Number=" + n);
        }
    }

    public static class Main {
        public static void main(String[] args) {
            A a = new A();
            Number[] num = { new Integer(1), 11, 1.11f, 11.11 };
            // цикл for (1)
            for (Number n : num) {
                a.printNum(n);
            }
            // (2)
            a.printNum(new Integer(1));
            a.printNum(11);
            a.printNum(1.11f);
            a.printNum(11.11);
        }
    }
}
/*
 * Number=1
 * Number=11
 * Number=1.11
 * Number=11.11
 * Integer = 1
 * int = 11
 * Float = 1.1100
 * Number=11.11
 * 
 * 
 * 
 * в 1 цикле n объявлена как Number,
 * => компилятор выбирает метод printNum(Number n) для всех элементов массива.
 * во 2: компилятор выбирает наиболее подходящий метод для каждого аргумента,
 * те:
 * 1 new Integer(1) -> printNum(Integer i) = точное совпадение
 * 2 11-> printNum(int i) = точное совпадение
 * 3 1.11f -> printNum(Float f) float -> Float
 * 4 11.11 -> printNum(Number n) double -> Double, а Double является Number
 * 
 * 
 */
