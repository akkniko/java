// собственный класс исключения
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Person {
    private int age;

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Недопустимый возраст: " + age);
        }
        this.age = age;
    }
}

class Demo {
    public static void main(String[] args) {
        Person p = new Person();

        try {
            p.setAge(300); // здесь будет выброшено исключение
        } catch (InvalidAgeException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }
}
