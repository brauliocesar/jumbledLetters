package br.com.cesar.challenge;

/**
 * 2. Check words with jumbled letters :
 * Our brain can read texts even if letters are jumbled, like the following sentence:  “Yuo
 * cna porbalby raed tihs esaliy desptie teh msispeillgns.” Given two strings, write a
 * method to decide if one is a partial­permutation of the other. Consider a
 * partial­permutation only if:
 * ­ The first letter hasn’t changed place
 * ­ If word has more than 3 letters, up to 2/3 of the letters have changed place
 * Examples:
 * you, yuo ­> true
 * probably, porbalby ­> true
 * despite, desptie ­> true
 * moon, nmoo ­> false
 * misspellings, mpeissngslli ­> false
 */
public class Main {

    public static void main(String[] args) {


        final JumbledLetters mJumbledLetters = new JumbledLetters();
        final String szCorrectSentence = "you can probably read this easily despite the misspellings";
        final String szMisspellingsSentence = "yuo cna porbalby raed tihs esaliy desptie teh msispeillgns";
        final String aSzCorrectSentence[] = szCorrectSentence.split(" ");
        final String aSzMisspellingsSentence[] = szMisspellingsSentence.split(" ");

        try {
            System.out.println("you, yuo -> " + mJumbledLetters.verify("you", "yuo"));
            System.out.println("can, cna -> " + mJumbledLetters.verify("can", "cna"));
            System.out.println("read, raed -> " + mJumbledLetters.verify("read", "raed"));
            System.out.println("probably, porbalby -> " + mJumbledLetters.verify("probably", "porbalby"));
            System.out.println("this, tihs -> " + mJumbledLetters.verify("this", "tihs"));
            System.out.println("easily, esaliy -> " + mJumbledLetters.verify("easily", "esaliy"));
            System.out.println("despite, desptie -> " + mJumbledLetters.verify("despite", "desptie"));
            System.out.println("the, teh -> " + mJumbledLetters.verify("the", "teh"));
            System.out.println("misspellings, msispeillgns -> " + mJumbledLetters.verify("misspellings", "msispeillgns"));
            System.out.println("moon, nmoo -> " + mJumbledLetters.verify("moon", "nmoo"));
            System.out.println("misspellings, mpeissngslli -> " + mJumbledLetters.verify("misspellings", "mpeissngslli"));

            for (int iIndex = 0; iIndex < aSzCorrectSentence.length; iIndex++) {
                System.out.println("check: " + aSzCorrectSentence[iIndex] + ", " + aSzMisspellingsSentence[iIndex] +  " -> "
                        + mJumbledLetters.verify(aSzCorrectSentence[iIndex] , aSzMisspellingsSentence[iIndex]));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
