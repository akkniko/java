package ClassesMethods;

public class accessRestriction {

public class AccessExample {
    public int publicField = 1;          // доступен везде
    int defaultField = 3;                // доступен только в пакете 
    protected int protectedField = 2;    // доступен в пакете и подклассах
    private int privateField = 4;        // доступен только в этом классе
    
    public void publicMethod() {
        System.out.println("Public метод");
    }
    
    protected void protectedMethod() {
        System.out.println("Protected метод");
    }
    
    void defaultMethod() {
        System.out.println("Default метод");
    }
    
    private void privateMethod() {
        System.out.println("Private метод");
    }
    
    public void accessAllFields() {
        System.out.println("Внутри класса доступны все поля:");
        System.out.println("public: " + publicField);
        System.out.println("protected: " + protectedField);
        System.out.println("default: " + defaultField);
        System.out.println("private: " + privateField);
        privateMethod(); 
    }
}
    public static void main(){
        
    }
}
