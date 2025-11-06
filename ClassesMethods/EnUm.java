package ClassesMethods;

public class EnUm {

    // 1
    public class PizzaOrder {

        public static enum PizzaSize {
            SMALL(8, 150),
            MEDIUM(12, 250),
            LARGE(16, 350);

            private final int diameterInSm;
            private final int basePriceInRubles;

            PizzaSize(int diameterInSm, int basePriceInRubles) {
                this.diameterInSm = diameterInSm;
                this.basePriceInRubles = basePriceInRubles;
            }

            public int getDiameterInSm() {
                return diameterInSm;
            }

            public int getBasePriceInRubles() {
                return basePriceInRubles;
            }
        }

        public static void main(String[] args) {
            PizzaSize size = PizzaSize.MEDIUM;

            System.out.println("Выбранный размер: " + size);
            System.out.println("Диаметр такой : " + size.getDiameterInSm());
            System.out.println("цена в рублях: " + size.getBasePriceInRubles());
        }
    }
    //2
    public class OrderProcessor {

    public enum OrderStatus {
        PENDING_PAYMENT(10),
        PROCESSING(20),
        SHIPPED(30),
        DELIVERED(40),
        CANCELLED(99);

        private final int statusCode;

        OrderStatus(int statusCode) {
            this.statusCode = statusCode;
        }

        public int getStatusCode() {
            return statusCode;
        }

        public boolean isFinal() {
            return this == DELIVERED || this == CANCELLED;
        }
    }

    public static void main(String[] args) {
        OrderStatus status1 = OrderStatus.SHIPPED;
        OrderStatus status2 = OrderStatus.DELIVERED;

        System.out.println("Статус 1: " + status1 + ", Код: " + status1.getStatusCode());
        System.out.println("Статус 1 - Завершен? " + status1.isFinal());

        System.out.println("---");

        System.out.println("Статус 2: " + status2 + ", Код: " + status2.getStatusCode());
        System.out.println("Статус 2 - Завершен? " + status2.isFinal());
    }
}

}
