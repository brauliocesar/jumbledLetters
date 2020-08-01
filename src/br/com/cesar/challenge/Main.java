package br.com.cesar.challenge;

public class Main {

    public static void main(String[] args) {
        final JumbledLetters jumbledLetters = new JumbledLetters();

        try {
            System.out.println("you, yuo -> " + jumbledLetters.verify("you", "yuo"));
            System.out.println("can, cna -> " + jumbledLetters.verify("can", "cna"));
            System.out.println("read, raed -> " + jumbledLetters.verify("read", "raed"));
            System.out.println("probably, porbalby -> " + jumbledLetters.verify("probably", "porbalby"));
            System.out.println("this, tihs -> " + jumbledLetters.verify("this", "tihs"));
            System.out.println("easily, esaliy -> " + jumbledLetters.verify("easily", "esaliy"));
            System.out.println("despite, desptie -> " + jumbledLetters.verify("despite", "desptie"));
            System.out.println("the, teh -> " + jumbledLetters.verify("the", "teh"));
            System.out.println("misspellings, msispeillgns -> " + jumbledLetters.verify("misspellings", "msispeillgns"));
            System.out.println("moon, nmoo -> " + jumbledLetters.verify("moon", "nmoo"));
            System.out.println("misspellings, mpeissngslli -> " + jumbledLetters.verify("misspellings", "mpeissngslli"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
