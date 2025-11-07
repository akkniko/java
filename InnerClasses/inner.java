package InnerClasses;

public class inner {
    // 1
    public class BankAccount {

        private double balance = 1500.0;

        // приватный внутренний класс — внешний кодне увидит его
        private class TransactionLogger {
            void log(String msg) {
                System.out.println("[LOG]: " + msg + ", баланс: " + balance);
            }
        }

        // публичный внутренний класс доступен снаружи
        public class Card {
            private String cardNumber = "1234-5678";

            public void pay(double amount) {
                balance -= amount;
                new TransactionLogger().log("Оплата картой на " + amount);
            }
        }
    }

    // 2
    public class SmartHome {

        private boolean alarmEnabled = true;

        private void toggleAlarm() {
            alarmEnabled = !alarmEnabled;
            System.out.println("Сигнализация: " + (alarmEnabled ? "ВКЛ" : "ВЫКЛ"));
        }

        public class SecuritySystem {

            public void breakInDetected() {
                // внутренний класс имеет полный доступ к приватным полям и методам внешнего
                // класса
                if (alarmEnabled) { // доступ к private полю
                    toggleAlarm(); //  и методу
                    System.out.println("Тревога!");
                }
            }
        }
    }
    // Внутренний класс SecuritySystem видит все private элементы SmartHome без
    // ограничений.
    // спецификаторы внешнего класса на доступ из inner-класса не влияют

    // 3
    public class University {

        public void process() {
            Student st = new Student();
            System.out.println(st.id); // поле public => доступно
            // System.out.println(st.gpa); // не доступно тк private 
            st.showId(); // public метод доступен извне
        }

        public class Student {
            public int id = 123;
            private double gpa = 4.8;

            public void showId() {
                System.out.println("ID: " + id);
            }

            private void showGpa() {
                System.out.println("GPA: " + gpa);
            }
        }
    }
    // внешний класс может обращаться к внутреннему, НО только через его объект
    // А доступ зависит от спецификаторов: private поля inner-класса скрыты

}
