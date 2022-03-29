public class Main {

    public static void main(String[] args){
        RandomCharacter RDC = new RandomCharacter();

        for (int i = 0 ; i < 15 ; i ++){
            System.out.println(RDC.getRandomLowerCaseLetter());
            System.out.println(RDC.getRandomUpperCaseLetter());
            System.out.println(RDC.getRandomDigitCharacter());
            System.out.println(RDC.getRandomCharacter());
        }
    }
}