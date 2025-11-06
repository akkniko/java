package ClassesMethods;

public class logic {
    public static class A {
        {
            System.out.println("logic (1) id= " + this.id);
        }
        static {
            System.out.println("static logic");
        }
        private int id = 1;

        public A(int id) {
            this.id = id;
            System.out.println("ctor id= " + id);
        }

        {
            System.out.println("logic (2) id= " + id);
        }
    }

    public static class Main {
        public static void main(String[] args) {
            new A(100);
        }
    }
}

// вывод:
/*
 * static logic
 * logic (1) id= 1
 * logic (2) id= 1
 * ctor id= 100
 * порядок выполнения:
 * 1 Статический блок выполняется первым
 * 2 Инициализация поля id
 */
