//1

/*
основные классы исключений нужнычтобы упорядоченно сообщать об ошибках и проблемных ситуациях во время работы программы. 
Класс Throwable — корень всех исключений, от него идут Error и Exception.
Error применяется для серьёзных сбоев, которые программа обычно не должна пытаться обрабатывать, например ошибки виртуальной машины. 
Exception предназначен для обычных ошибок в логике или данных; его подкласс RuntimeException охватывает ошибки времени выполнения,
которые возникают из-за неверного кода, например деление на ноль или выход за границы массива. 
*/
class Demo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;   // возникнет ArithmeticException
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на ноль: " + e.getMessage());
        }

        System.out.println("Программа продолжила работу.");
    }
}


//2
class ExceptionExamples {
    public static void main(String[] args) {
        System.out.println("\nПРИМЕРЫ ИСКЛЮЧЕНИЙ\n");
        
        arithmeticExceptionExample();
        arrayIndexExample();
        illegalArgumentExample();
        classCastExample();
        nullPointerExample();
    }
    
    // 1. ArithmeticException
    static void arithmeticExceptionExample() {
        System.out.println("1. ArithmeticException - деление на ноль");
        try {
            int a = 10;
            int b = 0;
            int result = a / b; 
            System.out.println("Результат: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("    Поймали: " + e.getClass().getSimpleName());
            System.out.println("    Сообщение: " + e.getMessage());
        }
        
        System.out.println("\n   Генерирование вручную:");
        try {
            throw new ArithmeticException("Нельзя делить на ноль!");
        } catch (ArithmeticException e) {
            System.out.println("   " + e.getMessage());
        }
        System.out.println();
    }
    
    // 2. ArrayIndexOutOfBoundsException
    static void arrayIndexExample() {
        System.out.println("2. ArrayIndexOutOfBoundsException - индекс за границей");
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            int element = numbers[10]; 
            System.out.println("Элемент: " + element);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("   Поймали: " + e.getClass().getSimpleName());
            System.out.println("   Сообщение: " + e.getMessage());
        }
        
        System.out.println("\n   Генерирование вручную:");
        try {
            throw new ArrayIndexOutOfBoundsException("Индекс 100 за границами массива размером 5");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("    " + e.getMessage());
        }
        System.out.println();
    }
    
    // 3. IllegalArgumentException
    static void illegalArgumentExample() {
        System.out.println("3. IllegalArgumentException - неверный аргумент");
        
        try {
            int age = -5; 
            if (age < 0) {
                throw new IllegalArgumentException("Возраст не может быть отрицательным");
            }
            System.out.println("Возраст: " + age);
            
        } catch (IllegalArgumentException e) {
            System.out.println("   Поймали: " + e.getClass().getSimpleName());
            System.out.println("   Сообщение: " + e.getMessage());
        }
        
        System.out.println("\n   Валидация email:");
        try {
            validateEmail("invalid-email");
        } catch (IllegalArgumentException e) {
            System.out.println("    " + e.getMessage());
        }
        System.out.println();
    }
    
    static void validateEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email должен содержать @");
        }
        System.out.println("Email валиден: " + email);
    }
    
    // 4. ClassCastException
    static void classCastExample() {
        System.out.println("4. ClassCastException - ошибка приведения типа");
        try {
            Object obj = "Это строка";
            Integer number = (Integer) obj; 
            System.out.println("Число: " + number);
            
        } catch (ClassCastException e) {
            System.out.println("   Поймали: " + e.getClass().getSimpleName());
            System.out.println("   Сообщение: " + e.getMessage());
        }
        
        System.out.println("\n   Правильный способ с проверкой:");
        try {
            Object obj = "Текст";
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                System.out.println("Число: " + num);
            } else {
                System.out.println("   Объект не является Integer, избежали ошибки");
            }
        } catch (ClassCastException e) {
            System.out.println("   " + e.getMessage());
        }
        System.out.println();
    }
    
    // 5. NullPointerException
    static void nullPointerExample() {
        System.out.println("5. NullPointerException - обращение к null");
        try {
            String text = null;
            int length = text.length(); 
            System.out.println("Длина: " + length);
            
        } catch (NullPointerException e) {
            System.out.println("   Поймали: " + e.getClass().getSimpleName());
            System.out.println("   Сообщение: " + e.getMessage());
        }
        
        System.out.println("\n   Безопасный способ с проверкой:");
        try {
            String text = null;
            if (text != null) {
                int length = text.length();
                System.out.println("Длина: " + length);
            } else {
                System.out.println("   Строка null, избежали ошибки");
            }
        } catch (NullPointerException e) {
            System.out.println("   " + e.getMessage());
        }
        System.out.println();
    }
}
