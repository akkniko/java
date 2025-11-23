


// 1 Неабстрактный и статический методы

public class frst {
// Интерфейс с неабстрактным методом и статическим методом

    interface Device {

        // Абстрактный метод 
        void turnOn();

        // Неабстрактный метод- может быть переопределён
        default void reset() {
            System.out.println("Перезагрузка устройства...");
        }

        // Статический метод - принадлежит интерфейсу, не классу
        static void printInfo() {
            System.out.println("Это информация об устройствах");
        }

        // Обычный default метод 
        default void getDescription() {
            System.out.println("Это устройство");
        }
    }

// Класс реализует интерфейс
    static class Laptop implements Device {

        @Override
        public void turnOn() {
            System.out.println("Ноутбук включается...");
        }


    }

    class Practice1 {

        public static void main(String[] args) {
            Laptop laptop = new Laptop();

            System.out.println("1: Через объект класса");
            laptop.turnOn();

            System.out.println("\n2: Через default ");
            laptop.reset();

            System.out.println("\n  3: Статический метод через интерфейс ");
            Device.printInfo();

            System.out.println("\n 4: Через ссылку интерфейса ");
            Device device = new Laptop();
            device.turnOn();
            device.reset();



            System.out.println("\n 5: Default вместо статического ");
            laptop.getDescription();
        }
    }

//  2: Конфликт методов в двух интерфейсах
// Два интерфейса с одинаковыми default методами
    interface InterfaceA {

        default void doWork() {
            System.out.println("Работа из интерфейса A");
        }
    }

    interface InterfaceB {

        default void doWork() {
            System.out.println("Работа из интерфейса B");
        }
    }

// Если просто реализовать оба - будет конфликт
// class Worker implements InterfaceA, InterfaceB {
//     // Компилятор не знает, какой doWork() использовать,
//     // будет ошибка     "Inherits unrelated defaults for doWork()"
// }
// надо просто  переопределить конфликтный метод
    static class Worker implements InterfaceA, InterfaceB {

        @Override
        public void doWork() {
            System.out.println("Решение 1: Собственная реализация");
        }
    }

// Альтернативное решение: вызвать метод нужного интерфейса явно
   static class WorkerWithChoice implements InterfaceA, InterfaceB {

        @Override
        public void doWork() {
            System.out.println("Решение 2: Выбираем метод одного интерфейса");
            InterfaceA.super.doWork(); // Явный вызов метода из A
        }
    }

// либо просто комбинировать оба метода
    static class WorkerCombined implements InterfaceA, InterfaceB {

        @Override
        public void doWork() {
            System.out.println("Решение 3: Комбинируем оба");
            InterfaceA.super.doWork();
            InterfaceB.super.doWork();
        }
    }

    class Practice2 {
 

        public static void main(String[] args) {
            System.out.println("1\n");
            Worker w1 = new Worker();
            w1.doWork();

            System.out.println("2\n");
            WorkerWithChoice w2 = new WorkerWithChoice();
            w2.doWork();

            System.out.println("\n3");
            WorkerCombined w3 = new WorkerCombined();
            w3.doWork();
        }
    }
}
