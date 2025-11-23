//  1: 10 МЕТОДОВ КЛАССА STRING

class StringMethods {
    public static void main(String[] args) {
        String text = "vscode Java";
        String email = "  user@mail.com  ";
        
        System.out.println("МЕТОДЫ КЛАССА STRING \n");
        
        // 1. length() - возвращает длину строки
        System.out.println("1. length()");
        System.out.println("Длина '" + text + "': " + text.length());
        
        // 2. charAt(index) - возвращает символ по индексу
        System.out.println("\n2. charAt(index)");
        System.out.println("Символ на позиции 6: " + text.charAt(6));
        
        // 3. substring(start, end) - вырезает часть строки
        System.out.println("\n3. substring(start, end)");
        System.out.println("Подстрока с 0 до 5: " + text.substring(0, 5));
        
        // 4. indexOf(str) - ищет первый индекс подстроки
        System.out.println("\n4. indexOf(str)");
        System.out.println("Индекс 'World': " + text.indexOf("World"));
        
        // 5. contains(str) - проверяет наличие подстроки
        System.out.println("\n5. contains(str)");
        System.out.println("Содержит 'Java': " + text.contains("Java"));
        
        // 6. toUpperCase() - преобразует в верхний регистр
        System.out.println("\n6. toUpperCase()");
        System.out.println("В верхнем регистре: " + text.toUpperCase());
        
        // 7. toLowerCase() - преобразует в нижний регистр
        System.out.println("\n7. toLowerCase()");
        System.out.println("В нижнем регистре: " + text.toLowerCase());
        
        // 8. trim() - удаляет пробелы в начале и конце
        System.out.println("\n8. trim()");
        System.out.println("До trim: '" + email + "'");
        System.out.println("После trim: '" + email.trim() + "'");
        
        // 9. replace(old, new) - заменяет все вхождения
        System.out.println("\n9. replace(old, new)");
        System.out.println("Замена 'Hello' на 'Hi': " + text.replace("Hello", "Hi"));
        
        // 10. split(regex) - разбивает строку на массив
        System.out.println("\n10. split(regex)");
        String[] words = text.split(" ");
        System.out.println("Слова:");
        for (String word : words) {
            System.out.println("  - " + word);
        }
    }
}


//2: StringJoiner

class StringJoinerExample {
    public static void main(String[] args) {
        System.out.println("\nStringJoiner\n");
        
        // Используется для объединения строк с разделителем
        java.util.StringJoiner sj = new java.util.StringJoiner(", ");
        
        System.out.println("1. Простое объединение:");
        sj.add("Java");
        sj.add("Python");
        sj.add("JS");
        System.out.println(sj.toString()); // Java, Python, JavaScript
        
        System.out.println("\n2. С префиксом и суффиксом:");
        java.util.StringJoiner sj2 = new java.util.StringJoiner(", ", "[", "]");
        sj2.add("Apple");
        sj2.add("Banana");
        sj2.add("Orange");
        System.out.println(sj2.toString()); 
        
        System.out.println("\n3. Объединение с делимитером и скобками:");
        java.util.StringJoiner sj3 = new java.util.StringJoiner(" | ", "{", "}");
        sj3.add("1");
        sj3.add("2");
        sj3.add("3");
        System.out.println(sj3.toString()); // {1 | 2 | 3}
        
        System.out.println("\n4. Из массива:");
        String[] names = {"Alice", "Bob", "Charlie"};
        java.util.StringJoiner sj4 = new java.util.StringJoiner(", ");
        for (String name : names) {
            sj4.add(name);
        }
        System.out.println("Имена: " + sj4.toString()); // Alice, Bob, Charlie
        
        System.out.println("\n5. Пустой StringJoiner:");
        java.util.StringJoiner sj5 = new java.util.StringJoiner(", ");
        System.out.println("Пустой: '" + sj5.toString() + "'"); // ''
    }
}


/*
Тройные кавычки нужны для
1 Читаемости - код выглядит чище
2  Многострочных текстов - HTML, JSON, SQL, XML
3 Экранирования - не нужны \n и +
4 Форматирования - сохраняет отступы
*/