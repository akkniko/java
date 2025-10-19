public class operators {
    public static class Transport {};
    public static class Car extends Transport{};
    public static class Step{};

    public static void main(String args[]){
        String a ="a";
        String b ="b";
        String ab = a+b;
        String aab = "a";
        aab +=ab;
        System.out.printf("ab: %s\naab: %s\n", ab, aab);
        float fl1 = 2.3f;
        float fl2 = 2.3f;
        float fl3 = 2.4f;
        int a1 = 5;
        int b1 = 2;
        System.out.println(fl1==fl2);
        System.out.println(fl1 > fl3);
        System.out.println(fl3 > fl2);
        System.out.println(a1 > b1);
        System.out.println(a1^b1);
        System.out.println(a1 | b1);
        System.out.println(a1 & b1);
        System.out.println(a1 >> b1);
        System.out.println(a1 >>> b1);
        System.out.println(a1 % b1);
        System.out.println(a1 * b1);
        System.out.println(a1 / b1);
       
        int x = 5;
        int y = 10;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        y--; 
        x++; 

        System.out.println("after x++ и y--:");
        System.out.println("x = " + x); // 6
        System.out.println("y = " + y); // 9

        ++x; 
        --y; 
        System.out.println("after ++x и --y:");
        System.out.println("x = " + x); // 7
        System.out.println("y = " + y); // 8

        int s = 5; //0000 0101
        int result = ~s; //1111 1010 = -6 в десятичном 
        System.out.println("~5 = " + result);

        boolean flag = true;
        System.out.println("!true = " + !flag); // false

        int res1 = 2 + 3 * 4;       
        int res2 = (2 + 3) * 4;     
        System.out.println("2 + 3 * 4 = " + res1);
        System.out.println("(2 + 3) * 4 = " + res2);

        int[] numbers = {10, 20, 30, 40};
        System.out.println("numbers[2] = " + numbers[2]);
        numbers[1] = 99; 
        System.out.println("NeW element numbers[1] = " + numbers[1]);
        int kk = 13;

        int del = 4;
        kk %= del;
        System.out.println(kk);
        kk /= del;
        System.out.println(kk);
        kk *= del;
        System.out.println(kk);

        Transport t = new Transport();
        Transport nll = null;
        Car c = new Car();
        Step st = new Step();
        System.out.println(c instanceof Transport);
        System.out.println(c instanceof Car);
        System.out.println(t instanceof Transport);
        System.out.println(st instanceof Step);
        System.out.println(t instanceof Car);
        System.out.println(nll instanceof Car);
        System.out.println(nll instanceof Transport);
    }
}
