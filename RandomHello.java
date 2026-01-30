package hw0;

import java.util.Random;

/**
 * RandomHello selects a random greeting to display to the user.
 */
public class RandomHello {

    /**
     * Uses a RandomHello object to print a
     * random greeting to the console.
     */
    public static void main(String[] argv) {
        RandomHello randomHello = new RandomHello();
        System.out.println(randomHello.getGreeting());
    }

    /**
     * @return a random greeting from a list of five different greetings.
     */
    public String getGreeting() {
        String[] greetings = {
            "Hello, World",
            "Hola Mundo",
            "Bonjour, le Monde",
            "Hallo Welt",
            "Ciao Mondo"
        };

        Random randomGenerator = new Random();
        int idx = randomGenerator.nextInt(greetings.length); // 0..length-1
        return greetings[idx];
    }
}
