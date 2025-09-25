package polytech;
// import java.io.IOException;
import java.util.Scanner;

public class secondLab {
    public static void main(String[] args) {
        // try{
        // System.in.read();
        // }
        // catch(IOException e){
        // } первый символ пропадает из за System.in.read(), поэтому без него
        System.out.println("Hi, enter your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.printf("Hello, %s!", name);
        scan.close();
    }
}
