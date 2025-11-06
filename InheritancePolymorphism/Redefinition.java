package InheritancePolymorphism;

public class Redefinition {
    //1: Перегрузка методов
static class TemperatureConverter {
    double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    double toCelsius(double fahrenheit, int precision) {
        double value = (fahrenheit - 32) * 5 / 9;
        double factor = Math.pow(10, precision);
        return Math.round(value * factor) / factor;
    }

    int toCelsius(int fahrenheit) {
        return (int)((fahrenheit - 32) * 5 / 9);
    }
}


//2: Переопределение метода
static class Animal {
    public String voice() {
        return "Some sound";
    }
}

static class Cat extends Animal {
    @Override
    public String voice() {
        return "Meow";
    }
}


//2: будет ошибка, если  у переопределенного и переопределяемого (из суперкласса) методов не будет совпадать тип возвращаемого значения.
static class Dog extends Animal {
    // тип int не совместим с типом String из метода суперкласса - вот такая ошибка
    // @Override
    // public int voice() {
    //     return 5;
    // }

    // разрешено: Covariant return type — возвращаем более конкретный тип
    @Override
    public String voice() {
        return "Woof";
    }
}


// Когда @Override помогает
static class Robot {
    public void start() {
        System.out.println("Robot started");
    }
}

static class SuperRobot extends Robot {
    // здесь ошибка следующая: метод не переопределяется из-за опечатки, соответсвенно вылезет ошибка 
    //а как раз таки без оверрайда ошибки не было бы
    @Override
    public void strart() { 
        System.out.println("SuperRobot");
    }
}


public static class Main {
    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        System.out.println(tc.toCelsius(212));
        System.out.println(tc.toCelsius(212, 3));
        System.out.println(tc.toCelsius(212.0));

        Animal a = new Animal();
        Animal c = new Cat();
        System.out.println(a.voice());
        System.out.println(c.voice());
    }
}

}
