package InnerClasses;

public class nested {

    // 1 ghbvth
    interface Vehicle {
        class Engine {
            public void start() {
                System.out.println("Двигатель запущен");
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            // cоздание вложенного класса через интерфейс
            Vehicle.Engine engine = new Vehicle.Engine();
            engine.start();
        }
    }

}
