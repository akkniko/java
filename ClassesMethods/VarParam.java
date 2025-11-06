package ClassesMethods;

public class VarParam {
    public static class VarargsOverloading {

        // метод без параметров
        public void print() {
            System.out.println("Нет параметров");
        }

        // метод с 1 параметром
        public void print(String message) {
            System.out.println("Один параметр: " + message);
        }

        // метод с 2 фиксированными параметрами
        public void print(String msg1, String msg2) {
            System.out.println("Два параметра: " + msg1 + ", " + msg2);
        }

        //  varargs
        public void print(String... messages) {
            System.out.println("Varargs: " + messages.length + " параметров");
            for (String msg : messages) {
                System.out.println("  - " + msg);
            }
        }

        public static void main(String[] args) {
            VarargsOverloading obj = new VarargsOverloading();

            obj.print(); 
            obj.print("Привет"); 
            obj.print("Привет", "!"); 
            obj.print("а", "б", "в"); 
            obj.print("а", "б", "в", "г", "д"); 
        }
    }
}
