import java.util.Scanner;
public class ConditionalOperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = (a == 1) ? 1 : (a == 2) ? 2 : 3;
        scanner.close();
        System.out.println(i);
    }
}
