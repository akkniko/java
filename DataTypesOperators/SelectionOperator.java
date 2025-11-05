public class SelectionOperator {
    public static int main() {
        ////1
        int i = 0;
        byte value = 1;
        /*
         * поддерживаются следующие типы: 
         * short value = 100;
         * int value = 5;
         * char value = 'A';
         * Integer value = 10;
         * String value = "hello";
         * enum Day { MONDAY, TUESDAY, WEDNESDAY }
         * Day value = Day.MONDAY;
         * 
         */
        switch (value) {
            case 1:
                i = 1; // если value == 1
                break;
            case 2:
                i = 2; // если value == 2
                break;
            default:
                i = 3; // если value != 1 и value != 2
                break;
        }

        ///2
        /// произойдет Fall-through- 
        /// т.е. если нет break, выполнение не остановится на этом case,
        /// а продолжится дальше по следующим case до ближайшего break или конца switch 
        
        return 0;
    }
}