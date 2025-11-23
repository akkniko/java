
//1
import java.io.*;

public class Inputt{
    static void demoRead() throws IOException {
        byte[] data = "He11o_W0rld!".getBytes();  
        InputStream in = new ByteArrayInputStream(data);

        StringBuilder sb = new StringBuilder();
        int b;

        while ((b = in.read()) != -1) {     // читаем по одному байту
            if (Character.isLetter(b)) {    // берём только буквы
                sb.append((char) b);
            }
        }

        System.out.println("Результат фильтрации: " + sb);
    }
}

//2
class OutputDemo {
    static void demoWrite() throws IOException {
        OutputStream out = new FileOutputStream("encoded.txt");

        String msg = "Test123!";
        for (byte b : msg.getBytes()) {
            out.write(b + 1);  // шифруем каждый байт
        }

        out.close();
        System.out.println("Файл encoded.txt создан с преобразованными байтами");
    }
}



//3
//Если есть иерархия байтовых потоков ввода-вывода, 
//основанная на абстрактных классах InputStream и OutputStream,
//то зачем дополнительные иерархии, основанные на абстрактных классах Reader и Writer?

//Байтовые потоки работают с байтами — они не знают ничего о символах, кодировках и Unicode.
//символы в джаве это мультибайтовые последовательности в UTF-8.
/*
Reader и Writer появились ,чтобы правильно работать с символами, а не байтами и поддерживать кодировки
*/


//4
//AutoCloseable позволяет объекту закрываться автоматически в блоке try-with-resources.
class LoggingResource implements AutoCloseable {
    private final String name;

    LoggingResource(String name) {
        this.name = name;
        System.out.println("Открыт ресурс: " + name);
    }

    public void use() {
        System.out.println("Используем ресурс: " + name);
    }

    @Override
    public void close() {
        System.out.println("Закрыт ресурс: " + name);
    }
}

class AutoCloseDemo {
    static void demoAutoClose() {
        try (LoggingResource res = new LoggingResource("R1")) {
            res.use();
        }
    }
}
