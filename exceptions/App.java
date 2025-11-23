public class App {
  final static int START_COUNTER;
  static {
    START_COUNTER = Integer.parseInt("Y-");
  }
  public static void main(String[] args) {
    System.out.println("Hello");
  }
}
/*
При выполнении данного кода произойдёт аварийное завершение программы из-за ошибки инициализации класса.
Класс App д.б. инициализирован перед вызовом метода main, и в процессе инициализации выполняется статический блок. 
В этом блоке код пытается преобразовать строку "Y-" в целое число с помощью метода Integer.parseInt().
Поскольку данная строка не корректное число - это действие вызывает исключение java.lang.NumberFormatException.
Тк это исключение происходит во время инициализации класса и не перехватывается,
Java Virtual Machine оборачивает его в java.lang.ExceptionInInitializerError и полностью останавливает выполнение программы.
Поэтому строка System.out.println("Hello"); выполнена не будет, и никакого вывода в консоли не появится.
*/
