package ClassesMethods;

public class Ffinal {
    public static class A {
    public final int a;

    //1 в конструкторе
    public A(int initialValue) {
        this.a = initialValue; 
    }

    /*//2
    // объявление при инициализации 
    public final int a = 30000;
    public A(){}

    //3 - в блоке инициализации экземпляра
    public final int a;

    { 
        int temp = 5 * 2;
        this.a = temp; 
    }

    public A() {
        // Здесь a уже инициализировано значением 10
    }*/

    
    public static void main(String[] args) {
        A obj1 = new A(10); 
        A obj2 = new A(25);
        System.out.println("a для obj1: " + obj1.a); // 10
        System.out.println("a для obj2: " + obj2.a); // 25
    }
}
    
}
