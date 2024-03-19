package xyz.solidnetwork.nested;

public class Main {

    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.iHaveThis();

        ConcreteClass concreteClass1 = new ConcreteClass() {
            @Override
            public void iHaveThis() {
                System.out.println("I have modified this");
            }
        };

        concreteClass1.iHaveThis();

    }


}
