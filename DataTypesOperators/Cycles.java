public class Cycles {
    public static void main(String[] args) {
        // 1
        // бесклнечный цикл:
        while (true) {
            System.out.println("это бесконечный цикл while");
        }
        // 2:
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; 
            }
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // пропускаем i = 5
            }
            System.out.println(i);
        }

    }
}
