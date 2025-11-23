
//1
public class StringBuildersDemo {

    public static void main(String[] args) {
        // Создаем объекты для демонстрации
        StringBuilder sb = new StringBuilder("Привет ");
        StringBuffer sbf = new StringBuffer("Java");

        // 1. append(String str): Добавляет строку в конец
        sb.append("Мир!");
        System.out.println("append: " + sb); // Привет Мир!

        // 2. append(int i): Добавляет число в конец 
        sb.append(2025);
        System.out.println("append: " + sb); // Привет Мир!2025

        // 3. insert(int offset, String str): Вставляет строку по указанному индексу - сдвигает остальное
        sb.insert(7, "мой ");
        System.out.println("insert: " + sb); // Привет мой Мир!2025

        // 4. delete(int start, int end): Удаляет символы в диапазоне [start, end)
        // Удаляем " мой "
        sb.delete(6, 10);
        System.out.println("delete: " + sb); // ПриветМир!2025

        // 5. deleteCharAt(int index): Удаляет один символ по индексу
        // Удаляем '!' (индекс 7)
        sb.deleteCharAt(7);
        System.out.println("deleteCharAt: " + sb); // ПриветМир2025

        // 6. replace(int start, int end, String str): Заменяет символы в диапазоне [start, end) на новую строку
        // Заменяем "Мир" (индексы 6, 7, 8) на "Планета"
        sb.replace(6, 9, "Планета");
        System.out.println("replace: " + sb); // ПриветПланета2025

        // 7. reverse(): Переворачивает всю последовательность символов
        sbf.reverse();
        System.out.println("reverse: " + sbf); // avaJ

        // 8. length(): Возвращает фактическое количество символов в буфере/строителе
        System.out.println("length: " + sbf.length()); // 4

        // 9. charAt(int index): Возвращает символ по указанному индексу
        System.out.println("charAt(1): " + sbf.charAt(1)); // v

        // 10. setCharAt(int index, char ch): Заменяет символ по указанному индексу
        // Заменяем 'v' (индекс 1) на 'V'
        sbf.setCharAt(1, 'V');
        System.out.println("setCharAt: " + sbf); // aVaJ
    }
}

//2
class ConversionDemo {

    public static void main(String[] args) {
        // Исходные объекты
        String str = "Строка";
        StringBuffer sbf = new StringBuffer("Буфер");
        StringBuilder sb = new StringBuilder("Строитель");

//          новый буфер, передавая исходную строку в конструктор
        StringBuffer newSbf = new StringBuffer(str);
        System.out.println("String -> StringBuffer: " + newSbf); // Строка

        //  новый строитель, передавая исходную строку в конструктор
        StringBuilder newSb = new StringBuilder(str);
        System.out.println("String -> StringBuilder: " + newSb); // Строка

        // 2. Из StringBuffer/StringBuilder в String
        // Метод: toString() (StringBuffer -> String)
        // Преобразует содержимое буфера в неизменяемую String.
        String strFromSbf = sbf.toString();
        System.out.println("StringBuffer -> String: " + strFromSbf); // Буфер

        // Метод: toString() (StringBuilder -> String)
        // то же самое для StringBuilder - получаем неизменяемую String
        String strFromSb = sb.toString();
        System.out.println("StringBuilder -> String: " + strFromSb); // Строитель

        // 3. Из StringBuffer в StringBuilder и наоборот
        // Сначала преобразуем в String, потом используем эту String для создания StringBuilder
        StringBuilder sbFromSbf = new StringBuilder(sbf.toString());
        System.out.println("StringBuffer -> StringBuilder: " + sbFromSbf); // Буфер

        //преобразуем в String, а затем используем эту String для создания StringBuffer
        StringBuffer sbfFromSb = new StringBuffer(sb.toString());
        System.out.println("StringBuilder -> StringBuffer: " + sbfFromSb); // Строитель
    }
}
