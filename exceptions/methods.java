class DualExceptionsDemo {
    static int parseValue(String s) throws NumberFormatException {
        return Integer.parseInt(s);   // может выбросить NumberFormatException
    }

    static void unsafeArrayAccess() {
        int[] data = { 1, 2, 3 };
        System.out.println(data[10]); // выбрасывает ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        try {
            int value = parseValue("abc123"); // здесь будет исключение
            System.out.println("Parsed value: " + value);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки: " + e.getMessage());
        }

        // это исключение уже не перехватывается
        unsafeArrayAccess();

        System.out.println("Эта строка никогда не будет напечатана.");
    }
}
