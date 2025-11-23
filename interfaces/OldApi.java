// @Override, @Deprecated, @SuppressWarnings

// 1. @Override
// переопределение метода из родителя, помогает компилятору находить ошибки в названии или параметрах

class Animal {
    public void sound() {
        System.out.println("Звук...");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Гав!");
    }
    
    // Без @Override - работает, но не видно, что это переопределение
}

interface Printer {
    void print();
}

class LaserPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Печать...");
    }
}


// 2. @Deprecated
//  значит код старый, не использовать его, среда подсветит, компилятор выдаст предупреждение

public class OldApi {
    
    @Deprecated
    public void oldWay() {
        System.out.println("Старый способ");
    }
    
    @Deprecated(since = "2.0", forRemoval = true)
    public void willBeRemoved() {
        System.out.println("Удалится в будущем");
    }
    
    // Новый способ
    public void newWay() {
        System.out.println("Используйте это вместо oldWay()");
    }
}

@Deprecated(since = "3.0")
class LegacyClass {
    // Весь класс устарел
}

class TestDeprecated {
    public static void main(String[] args) {
        OldApi api = new OldApi();
        
        //  вскод(ну среда любая) подчеркнёт и выдаст предупреждение
        api.oldWay();
        
        // но лучше использовать новый способ
        api.newWay();
    }
}


// 3. @SuppressWarnings
// Говорит компилятору, что тут предупреждение, но это норм

class WarningSupression {
    
    // Подавляем предупреждение об устаревшем коде
    @SuppressWarnings("deprecation")
    public void ignoreDeprecation() {
        OldApi api = new OldApi();
        api.oldWay(); // Предупреждение подавлено
    }
    
    // Подавляем предупреждение о небезопасных типах - generics
    @SuppressWarnings("unchecked")
    public void ignoreUnchecked() {
        java.util.List rawList = new java.util.ArrayList();
        java.util.List<String> safe = rawList; //здесь вот предупреждение подавлено
    }
    
    // Несколько предупреждений сразу
    @SuppressWarnings({"deprecation", "unchecked"})
    public void ignoreMany() {
        OldApi api = new OldApi();
        api.oldWay();
        
        java.util.List rawList = new java.util.ArrayList();
        java.util.List<String> safe = rawList;
    }
    
    @SuppressWarnings("all")
    static class VerboseClass {
        @Deprecated
        void method1() { }
    }
}
