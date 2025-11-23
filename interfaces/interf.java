public class interf {
// 1. без модификатора
// Видим только в одном пакете
// Это область видимости по умолчанию

    interface DefaultVisibilityInterface {

        void method1();
        // Можно использовать только внутри этого пакета
        // Из других пакетов доступ запрещён
    }

// 2. паблик -публичная обл видимости
// Видим из любого места в приложении
// Может быть реализован классами из других пакетов
    public interface PublicInterface {

        void method2();
        // Доступен всем из этого пакета, других пакетов, везде
    }

// 3. protected = защищенная обл видимости
// protected используется только для вложенных интерфейсов
// Вложенный protected интерфейс виден в одном пакете и подклассах
    public class OuterClass {
        protected interface ProtectedInterface {

            void method3();
            // Доступен:
            // - классам в том же пакете
            // - подклассам OuterClass (даже из других пакетов)
        }
    }

// 4. private = ПРИВАТНАЯ ОБЛАСТЬ ВИДИМОСТИ
// private используется только для вложенных интерфейсов
    public class ContainerClass {
        private interface PrivateInterface {

            void method4();
            // Доступен только внутри ContainerClass, те полностью скрыт от других классов
        }

        private class InnerImplementation implements PrivateInterface {

            @Override
            public void method4() {
                System.out.println("Реализация приватного интерфейса");
            }
        }
    }

    public class VisibilityExample {

        //виден везде
        public interface NestedPublic {

            void doSomething();
        }

        // видимость ограничена
        protected interface NestedProtected {

            void doProtected();
        }

        //  видимость только в этом классе
        private interface NestedPrivate {

            void doPrivate();
        }

        //private интерфейс
        private static class PrivateImpl implements NestedPrivate {

            @Override
            public void doPrivate() {
                System.out.println("Это приватная реализация");
            }
        }

        public static void main(String[] args) {
            NestedPrivate privateImpl = new PrivateImpl();
            privateImpl.doPrivate();
        }
    }
}
