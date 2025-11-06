package InheritancePolymorphism;

public class methodsFinal {
    //1: Нельзя переопределить final-метод суперкласса
   public static class A {
    public final void method() {
        System.out.println("A");
    }
}

public static class B extends A {
    @Override
    public void method() {
        System.out.println("B");
    }
}
//Cannot override the final method from methodsFinal.A


//2:Нельзя наследоваться от final-класса
final class K {};
class D extends K {};

//The type D cannot subclass the final class methodsFinal.K

}
