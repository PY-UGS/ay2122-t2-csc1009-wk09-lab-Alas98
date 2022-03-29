import java.util.Random;

public class RandomCharacter {

    public char getRandomLowerCaseLetter() {
        Random rdm = new Random();
        return (char) (rdm.nextInt(26) + 'a'); //prints out random lowercasecharacter from a-z
    }

    public char getRandomUpperCaseLetter() {
        Random rdm = new Random();
        return (char) (rdm.nextInt(26) + 'A'); //prints out random uppercasecharacter from A-Z
    }

    public int getRandomDigitCharacter() {
        Random rdm = new Random();
        return rdm.nextInt(0,9); //prints out random lowercasecharacter from a-z
    }

    public char getRandomCharacter() {
        Random rdm = new Random();
        int randomized = rdm.nextInt(0,1);
        if (randomized == 0 ){
            return getRandomUpperCaseLetter();
        }
        else{
            return getRandomLowerCaseLetter();
        }
    }

}