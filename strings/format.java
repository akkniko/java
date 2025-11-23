
//1
class FormatSpecifiers {
    public static void main(String[] args) {
        System.out.println("5 СПЕЦИФИКАТОРОВ \n");
        
        // 1. %s - строка
        System.out.println("1. %s - Строковое представление");
        String name = "Java";
        System.out.printf("Язык программирования: %s%n", name);
        
        // 2. %d - целое число (десятичное)
        System.out.println("\n2. %d - Десятичное целое");
        int age = 25;
        System.out.printf("Возраст: %d лет%n", age);
        
        // 3. %f - число с плавающей точкой
        System.out.println("\n3. %f - Число с плавающей точкой");
        double price = 19.99;
        System.out.printf("Цена: %.2f$%n", price);
        
        // 4. %b - логическое значение (boolean)
        System.out.println("\n4. %b - Логическое значение");
        boolean isActive = true;
        System.out.printf("Активно: %b%n", isActive);
        
        // 5. %x - шестнадцатеричное число
        System.out.println("\n5. %x - Шестнадцатеричное число");
        int number = 255;
        System.out.printf("В шестнадцатеричном виде: %x%n", number);
        
        // Комбинированный пример
        System.out.println("\n=== Комбинированный пример ===");
        System.out.printf("Пользователь %s, %d лет, статус: %b, цена: %.2f$%n", 
                          name, age, isActive, price);
    }
}


//2

class DateTimeSpecifiers {
    public static void main(String[] args) {
        System.out.println("\n=== СПЕЦИФИКАТОРЫ ДАТЫ И ВРЕМЕНИ ===\n");
        
        java.util.Date now = new java.util.Date();
        
        // 1. %tH - час (00-23)
        System.out.println("1. %tH - Час (00-23)");
        System.out.printf("Час: %tH%n", now);
        
        // 2. %tM - минуты (00-59)
        System.out.println("\n2. %tM - Минуты (00-59)");
        System.out.printf("Минуты: %tM%n", now);

        
        // 3. %tS - секунды (00-59)
        System.out.println("\n3. %tS - Секунды (00-59)");
        System.out.printf("Секунды: %tS%n", now);
        
        // 4. %tY - год в 4-значном формате
        System.out.println("\n4. %tY - Год (4 цифры)");
        System.out.printf("Год: %tY%n", now);
        
        // 5. %tB - полное название месяца
        System.out.println("\n5. %tB - Месяц (полное название)");
        System.out.printf("Месяц: %tB%n", now);
        
        // 6. %tA - полное название дня недели
        System.out.println("\n6. %tA - День недели");
        System.out.printf("День недели: %tA%n", now);
        
        // Полное время и дата
        System.out.println("\n=== Полные дата и время ===");
        System.out.printf("Время: %tH:%tM:%tS%n", now, now, now);
        System.out.printf("Дата: %tA, %tB %td, %tY%n", now, now, now, now);
    }
}



/*
3 flush()

он очищает буфер вывода и отправляет все накопленные 
данные в пункт назначения (консоль, файл и тд)

Без flush() - данные могут оставаться в буфере и не выводиться.
С flush() - данные выводятся немедленно.

Полезно когда:
 Нужен вывод в реальном времени
 Программа зависит от вывода для отладки
*/
