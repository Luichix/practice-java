// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello World");
        System.out.println("Start Learn Java");

        // This is a single comment, It is similar in how we make comments in javascript.

        /*
         * This is a multiline comment, It is equal to multiline comments in javascript.
         *
         * */

        /* Variables
         * String
         * int
         * float
         * char
         * boolean
         * */

        String myString = "String";
        int myInt = 1;
        float myFloat = 1.0f;
        char myChar = 'A';
        boolean myBoolean = true;

        final String myConstant = "The constants use the word final to preserve the same value";

        System.out.println(myString);
        System.out.println(myInt);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myConstant);

        // Multiple declaration variables

        int x = 1, y = 2, z = 3;
        System.out.println(x + y + z);
        int a, b, c;
        a = b = c = 10;
        System.out.println(a + b + c);

        // Primitive Data Type - Numbers

        byte myByte = 127;
        short myShort = 32767;
        int myNum = 2134567890;
        long myLong = 1234567890000000000L;

        float myDecimal = 123.4567f;
        double myDouble = 123456.987654d;

        float f1 = 35e3f;
        double d1 = 12E4d;

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myNum);
        System.out.println(myLong);

        System.out.println(myDecimal);
        System.out.println(myDouble);

        System.out.println(f1);
        System.out.println(d1);

        /* Java Type Casting
        * Widening Casting - Automatically
        * Narrowing Casting - Manually
        * */

        int numberToWidening = 10;
        double wideningNumber = numberToWidening + 0.10d;

        System.out.println(numberToWidening);
        System.out.println(wideningNumber);

        double numberToNarrowing = 100.10d;
        int narrowingNumber = (int) numberToNarrowing;

        System.out.println(numberToNarrowing);
        System.out.println(narrowingNumber);

        /*
        * int n;
        n  = 5;
        n += 3;
        n -= 3	;
        n *= 3;
        n /= 3;
        n %= 3;
        n &= 4;
        n |= 3;
        n ^= 6;
        n >>= 3;
        n <<= 3;
        */

        String greetings = "Hello";
        System.out.println("Hello contains the " + greetings.length() + " letters.");

        String world = " World";
        System.out.println(greetings.concat(world));

        int random = (int) (Math.random() * 101);

        if (random < 50){
            System.out.println("Random is less than 50");
        } else if (random < 75) {
            System.out.println("Random is less tan 75 and greater than 50");
        } else {
            System.out.println("Random is greater than 75");
        }

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 10; i++) {
            if(i == 3){
                continue;
            } else if (i == 6){
                break;
            }
            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        int loop = 0;
        do {
            System.out.println("Do While");
            loop++;
        }while (loop < 5);

        int loop2 = 0;

        while(loop2 < 5){
            System.out.println(loop2);
            loop2++;
        }


        switch (random){
            case 1:
                System.out.println("Random is 1");
                break;
            case 2:
                System.out.println("Random is 2");
                break;
            default:
                System.out.println("Random is greater tan 2");
        }


        String[] cars = {"Toyota", "Nissan", "Hummer"};

        for (String car: cars
             ) {
            System.out.println(car);
        }

    }
}