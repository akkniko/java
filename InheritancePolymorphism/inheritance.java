package InheritancePolymorphism;

public class inheritance {

    // 1,2:
    /*
     * this — обращение к текущему объекту класса
     * super — обращение к родительскому классу,нужен, чтобы вызвать конструктор
     * суперкласса
     */
    static class A {
        int a1 = 10;
        public int a2 = 20;
        protected int a3 = 30;
        private int a4 = 40;

        void method1() {
            System.out.println("A.method1");
        }

        public void method2() {
            System.out.println("A.method2");
        }

        protected void method3() {
            System.out.println("A.method3");
        }

        private void method4() {
            System.out.println("A.method4");
        }
    }

    static class B extends A {
        int a1 = 100;

        public void showB() {
            System.out.println(a1);
            System.out.println(this.a1);
            System.out.println(super.a1);
            System.out.println(a2);
            System.out.println(a3);
            method1();
            method2();
            method3();
        }

        @Override
        public void method2() {
            System.out.println("B.method2");
            super.method2();
        }
    }

    static class C extends B {
        public void showC() {
            System.out.println(a2);
            System.out.println(a3);
            method2();
            method3();
        }
    }

    public static class Main {
        public static void main(String[] args) {
            B b = new B();
            b.showB();
            System.out.println();
            C c = new C();
            c.showC();
        }
    }

}
