
//1
// Ex1 > Ex2 > Ex3
class Ex1 extends Exception {

    public Ex1(String message) {
        super(message);
    }
}

class Ex2 extends Ex1 {

    public Ex2(String message) {
        super(message);
    }
}

class Ex3 extends Ex2 {

    public Ex3(String message) {
        super(message);
    }
}

class IdenticalHandling {

    public static void demo() {
        try {
            // Может быть разное исключение
            int choice = 2;
            if (choice == 1) {
                throw new NumberFormatException("Ошибка парсинга");
            } else if (choice == 2) {
                throw new IllegalArgumentException("Неверный аргумент");
            } else {
                throw new ClassCastException("Ошибка преобразования");
            }

        } catch (NumberFormatException | IllegalArgumentException | ClassCastException e) {
            // Все три обрабатываются одинаково
            System.out.println("Поймали ошибку: " + e.getClass().getSimpleName());
            System.out.println("Сообщение: " + e.getMessage());
            System.out.println("Логируем и продолжаем...\n");
        }
    }
}

//2 ситуация
class HierarchyHandling {

    // Методы которые выбрасывают разные исключения
    static void throwEx1() throws Ex1 {
        throw new Ex1("Это исключение Ex1");
    }

    static void throwEx2() throws Ex2 {
        throw new Ex2("Это исключение Ex2");
    }

    static void throwEx3() throws Ex3 {
        throw new Ex3("Это исключение Ex3");
    }

    public static void demo() {
        System.out.println("=== ИЕРАРХИЯ ИСКЛЮЧЕНИЙ ===\n");
        System.out.println("Иерархия: Ex1 <- Ex2 <- Ex3\n");

        // 1: Отдельные catch для каждого уровня
        System.out.println("Способ 1: Отдельные catch блоки");
        try {
            throwEx3(); // Выбрасываем самое специфичное

        } catch (Ex3 e) {
            System.out.println("Поймали Ex3: " + e.getMessage());
        } catch (Ex2 e) {
            System.out.println("Поймали Ex2: " + e.getMessage());
        } catch (Ex1 e) {
            System.out.println("Поймали Ex1: " + e.getMessage());
        }

        //2: Ловим только родительский класс
        System.out.println("\nСпособ 2: Ловим только Ex1");
        try {
            throwEx3(); // Выбрасываем Ex3

        } catch (Ex1 e) {
            // Ex1 ловит Ex1, Ex2, Ex3 
            System.out.println("Поймали: " + e.getClass().getSimpleName());
            System.out.println("Сообщение: " + e.getMessage());
        }

        // Способ 3: Правильный порядок - от специфичного к общему
        System.out.println("\nСпособ 3: Порядок от специфичного к общему");
        try {
            int choice = 2;
            if (choice == 1) {
                throwEx1(); 
            }else if (choice == 2) {
                throwEx2(); 
            }else {
                throwEx3();
            }

        } catch (Ex3 e) {
            System.out.println("Специфичный: поймали Ex3");
        } catch (Ex2 e) {
            System.out.println("Средний: поймали Ex2");
        } catch (Ex1 e) {
            System.out.println("Общий: поймали Ex1");
        }

        // Способ 4: Неправильный порядок - работать не будет
        System.out.println("\nСпособ 4: НЕПРАВИЛЬНЫЙ порядок");
        try {
            throwEx3();

            // catch (Ex1 e) { }    // Это поймает все
            // catch (Ex3 e) { }    // Это никогда не выполнится!
        } catch (Ex3 e) {
            System.out.println("Поймали Ex3");
        } catch (Ex2 e) {
            System.out.println("Поймали Ex2");
        } catch (Ex1 e) {
            System.out.println("Поймали Ex1");
        }
    }
}

//2 zadanie:
class FinalInCatch {

    public static void demo() {

        // С final - переменная e не может быть переназначена
        try {
            throw new Exception("Первое исключение");

        } catch (final Exception e) {
            System.out.println("Поймали: " + e.getMessage());

            // e = new Exception("Новое значение"); // Ошибка
            System.out.println("Класс: " + e.getClass().getSimpleName());
        }

        System.out.println("\nБез final - можно переназначить:");
        try {
            throw new Exception("Первое исключение");

        } catch (Exception e) {
            System.out.println("Поймали: " + e.getMessage());

            // Можно переназначить без final
            e = new RuntimeException("Новое исключение");
            System.out.println("После переназначения: " + e.getMessage());
        }

        System.out.println("\nЗачем final в catch?");
        System.out.println("1. Защита от случайного переназначения");
        System.out.println("2. Явно показывает намерение - не менять исключение");
        System.out.println("3. Помощь компилятору при оптимизации");
    }
}

class ExceptionsPractice {

    public static void main(String[] args) {
        IdenticalHandling.demo();
        System.out.println("─".repeat(50));

        HierarchyHandling.demo();
        System.out.println("─".repeat(50));

        FinalInCatch.demo();
    }
}
