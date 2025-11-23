
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        
        // Пример 1: Базовое чтение файла построчно
        System.out.println("Пример 1: Чтение файла построчно\n");
        readFileLines("data.txt");
        
        // Пример 2: Чтение отдельных слов
        System.out.println("\n\nПример 2: Чтение отдельных слов\n");
        readFileWords("data.txt");
        
        // Пример 3: Чтение чисел
        System.out.println("\n\nПример 3: Чтение чисел\n");
        readFileNumbers("numbers.txt");
        
        // Пример 4: Чтение с разделителем
        System.out.println("\n\nПример 4: Чтение CSV\n");
        readFileCSV("data.csv");
    }
    
    // Чтение построчно
    static void readFileLines(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            
            int lineNumber = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
            
            scanner.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
    
    // Чтение отдельных слов
    static void readFileWords(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            
            while (scanner.hasNext()) {
                String word = scanner.next();
                System.out.println("Слово: " + word);
            }
            
            scanner.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
    
    // Чтение чисел
    static void readFileNumbers(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println("Число: " + number);
            }
            
            scanner.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
    
    // Чтение CSV (разделитель запятая)
    static void readFileCSV(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            scanner.useDelimiter(",|\\n");
            
            while (scanner.hasNext()) {
                String value = scanner.next().trim();
                System.out.println("Значение: " + value);
            }
            
            scanner.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}

