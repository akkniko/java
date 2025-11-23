class TryPractices {
    public static void main(String[] args) {

        //#1
        //Можно ли использовать следующую конструкцию (try без catch и finally)
        //
        // нет Такой коД не компилируется.
        // try {
        //     System.out.println("Это не скомпилируется");
        // }

        // #2
        // Можно ли использовать try только с finally
        //
        // Да, можно
        try {
            System.out.println("Работа в try-блоке №2");
        } finally {
            System.out.println("finally выполняется всегда (пример #2)");
        }

        // Практика #3
        // Можно ли использовать два finally подряд?
        //
        // нет, в конструкции try допускается:
        //    а)любое количество catch
        //    б)но только ОДИН finally
        //
        // try {
        //     System.out.println("Это тоже не скомпилируется");
        // } finally {
        //     System.out.println("Первый finally");
        // } finally {
        //     System.out.println("Второй finally — так нельзя");
        // }

    }
}
