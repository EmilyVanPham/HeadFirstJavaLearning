import java.util.Random;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"Red", "Orange", "White", "Blue"};
        String[] wordListTwo = {"Dog", "Cat", "Bear", "Chicken"};
        String[] wordListThree = {"Rose", "Violet", "Lilies", "Daffodils"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);
    }
}
