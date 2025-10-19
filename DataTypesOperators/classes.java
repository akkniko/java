public class classes {
    public static void main(String args[]){
        //1
        //строка в число просто преобразуется
        Integer a = Integer.decode("2354");
        Integer b = Integer.decode("0x2B");
        Integer c = Integer.decode("0143");
        System.out.println("a, b, c: " + a +" " + b + " "+ c);

        //2
        Boolean bb1 = Boolean.valueOf("True");
        Boolean b11 = Boolean.valueOf(false);
        boolean bb = true;
        Boolean BB = Boolean.TRUE;
        System.out.println("bb, BB: "+ bb + " "+ BB);
        Boolean n2 = Boolean.valueOf("False");
        System.out.println("bb1, b11, n2: " + bb1+ " " + b11 + " " + n2);
        Boolean kl = new Boolean(false);
        System.out.println(kl);

        //3
        // Integer jk = 2;
        // Integer x = null; -- NullPointerException
        // int y = x;

        //4
        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;
        System.out.println("a1==i1 " + (a1 == i1)); // true
        System.out.println("b1==i1 " + (b1 == i1)); // true
        System.out.println("a1==b1 " + (a1 == b1)); // false
        System.out.println("a1.equals(i1) -> " + a1.equals(i1)); // true
        System.out.println("b1.equals(i1) -> " + b1.equals(i1)); // true
        System.out.println("a1.equals(b1) -> " + a1.equals(b1)); // true

        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;
        System.out.println("a2==i2 " + (a2 == i2)); // true
        System.out.println("b2==i2 " + (b2 == i2)); // true
        System.out.println("a2==b2 " + (a2 == b2)); // true
        System.out.println("a2.equals(i2) -> " + a2.equals(i2)); // true
        System.out.println("b2.equals(i2) -> " + b2.equals(i2)); // true
        System.out.println("a2.equals(b2) -> " + a2.equals(b2)); // true
      
    }
}
