package ClassesMethods;

public class staticMethods {
    public static class A {
    public static int a = 1;
    public static int b; 

    public static void printVars() {
        System.out.println("Значение a: " + a);
        System.out.println("Значение b: " + b);
        System.out.println("---");
    }

    public static void main(String[] args) {
        System.out.println("Вариант 1: Через имя класса");
        A.printVars();

        System.out.println("Вариант 2: Через экземпляр класса");
        A instanceA = new A();
        instanceA.printVars();

        System.out.println("Вариант 3: Прямой вызов (внутри того же класса)");
        printVars(); 
    }
}
}
