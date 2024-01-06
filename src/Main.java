import practice.Lists;
import practice.Pig;
import practice.Practice;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static  void main (String[] args){
        Practice practice = new Practice(2024, "Hummer");

        practice.test();

        Pig porky = new Pig();
        porky.animalName();
        porky.animalSound();
        porky.animalSleep();

        Lists lists = new Lists();

        lists.elements();
    }
}