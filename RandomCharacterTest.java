import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomCharacterTest {
    private String randomCharacter;
    RandomCharacter RDC = new RandomCharacter();

    @Test
    public void testingLowerCaseLetter() {
        for (int i = 0; i < 15; i++) {
            randomCharacter = String.valueOf(RDC.getRandomLowerCaseLetter());
            assertTrue(randomCharacter == randomCharacter.toLowerCase()); //run 15 times to check if all are lower case
        }
    }

    @Test
    public void testingUpperCaseLetter() {
        for (int i = 0; i < 15; i++) {
            randomCharacter = String.valueOf(RDC.getRandomUpperCaseLetter());
            assertTrue(randomCharacter == randomCharacter.toUpperCase()); //run 15 times to check if all are upper case
        }
    }

    @Test
    void testingDigitCharacter() {
        for (int i = 0; i < 15; i++) {
            randomCharacter = String.valueOf(RDC.getRandomDigitCharacter());
            int intRandomCharacter = Integer.parseInt(randomCharacter);
            assertTrue(0 <= intRandomCharacter && intRandomCharacter <= 9); //run 15 times to check if all are digits
        }
    }

    @Test
    void testingPrime() {
        randomCharacter = String.valueOf(RDC.getRandomDigitCharacter());
        boolean testPrime = true;
        int intRandomCharacter = Integer.parseInt(randomCharacter);
        System.out.println("The number generated to test for Prime is " + intRandomCharacter);

        if (intRandomCharacter <= 1){
            testPrime = false;
        }
        else if (intRandomCharacter != 2 && intRandomCharacter % 2 == 0){
            testPrime = false;
        }
        else {
            testPrime = true;
        }
        assertTrue(testPrime);

    }
}