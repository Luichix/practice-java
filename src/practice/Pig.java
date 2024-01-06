package practice;

public class Pig implements Animal{

    @Override
    public void animalName() {
        System.out.println("The animal is Porky");
    }

    @Override
    public void animalSound() {
        System.out.println("Wee Wee...");
    }

    @Override
    public void animalSleep() {
        System.out.println("Zzz");
    }
}
