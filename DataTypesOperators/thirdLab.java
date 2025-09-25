package polytech.DataTypesOperators;

public class thirdLab {
    public static void main(String args[]) {
        // 1
        byte b0 = 0;
        short sh = 0;
        int i = 5;
        long l = 10L;
        float f = 10.2f;
        double d = 2.4f;
        char c0 = 'd';
        boolean bl = true;
        // 2
        System.out.print('\u0410');
        System.out.print('\u0420');
        System.out.print('\u0422');
        System.out.print('\u0401');
        System.out.print('\u041C');
        // 3 Здесь будет ошибка из за ограничения области видимости - b не видна.
        // int a = 1;
        // {
        // int b = 2;
        // }
        // int c = a + b;

        ///4
        String s1 = "aa";
        String s2 = "bb";
        System.out.println('\n');
        System.out.println(s1 + s2); // результат аабб
        System.out.println("res: " + l);

        // 5
        // byte -> short -> int -> long -> float -> double
        System.out.println(i + f); // число будет с плавающей точкой, поскольку флоат выше по иерархии чем инт

        // 6
        int dd = (int) d; // d=2.4
        System.out.println(dd);

        // 7
        // int a1 = 120;
        // byte b1 = a1 + 10; //ошибка компиляции будет
        // byte c1 = (byte) (a1 + 10); 
        // byte d1 = a1 + 1;
        //8
        var numb = 10;
        var aaa = "aaa";
        System.out.println(numb + " " + aaa);
    }
}
