package xyz.solidnetwork.abstracts;

public class TestConcrete extends TestClass {
    @Override
    public double calculateTax() {
        return 16;
    }

    @Override
    public void abstractFromAbstract() {
        System.out.println("This is mandatory");
    }
}
