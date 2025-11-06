package InheritancePolymorphism;

public class superthis {
    //1Три варианта использования super
static class A {
    int value = 10;

    A() {
        System.out.println("A constructor");
    }

    void show() {
        System.out.println("A.show: " + value);
    }
}

static class B extends A {
    int value = 20;

    B() {
        super();           
    }

    void show() {
        System.out.println("B.show: " + this.value);
        System.out.println("Parent value: " + super.value);
        super.show();
    }
}


// 2:
// if method() вызвать у объекта класса C, будет использован метод из A,
// тк он не переопределён в B, а наследуется от A


//3класс A с использованием this()
static class A2 {
    int a;
    int b;
    int c;
    int z;

    public A2() {
        this(0);
    }

    public A2(int a) {
        this(a, 0);
    }

    public A2(int a, int b) {
        this(a, b, 0);
    }

    public A2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        z = 1;
    }
}

static class C extends B {
    @Override
    void show() {
        System.out.println("C.show");
        super.show();
    }

    void method() {
        System.out.println("C.method");
        int temp = super.value;
        super.show();
    }
}

public static class main {
    public static void main(String[] args) {
        B b = new B();
        b.show();

        C c = new C();
        c.method();
    }
}




}
