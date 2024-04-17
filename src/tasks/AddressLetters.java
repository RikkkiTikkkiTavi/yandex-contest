package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class AddressLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();


        List<Character> vowelList = new ArrayList<>();
        vowelList.add('a');
        vowelList.add('e');
        vowelList.add('i');
        vowelList.add('o');
        vowelList.add('u');
        vowelList.add('y');

        char[] letters = input.toCharArray();

        Character vowel = null;
        Character consonant = null;

        for (char name : letters) {
            if (vowel != null && consonant != null) {
                break;
            }
            if (vowelList.contains(name)) {
                if (vowel == null) {
                    vowel = name;
                }
            } else {
                if (consonant == null) {
                    consonant = name;
                }
            }
        }

        if (vowel == null) {
            System.out.println("Consonant");
        } else if (consonant == null){
            System.out.println("Vowel");
        } else {
            if (consonant.charValue() > vowel.charValue()) {
                System.out.println("Consonant");
            } else {
                System.out.println("Vowel");
            }
        }
    }
}
