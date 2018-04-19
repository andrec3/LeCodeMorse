package com.example.andre.tp3codemorse;

/**
 * Created by andre on 16/04/2018.
 */

public class MainCodeMorse implements TraducteurMorse {
    @Override
    public String toAlpha(String morse) {
        char[] caracteres = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
                'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' ' };

        String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----.", "-----","/"};

        String[] codeToChange = {""};
        String newText = "";
        codeToChange = morse.split(" ");


        for (int i = 0; i < codeToChange.length; i++) {
            for (int j = 0; j < 37; j++) {
                if (codeToChange[i].equals(morseCode[j])) {
                    newText += caracteres[j];
                }
            }
        }

        return newText;
    }

    @Override
    public String toMorse(String alpha) {
        char[] caracteres = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
                'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' ' };

        String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----.", "-----","/"};

        String textToChange = "";
        String newText = "";
        textToChange = alpha;

        textToChange = textToChange.toLowerCase();

        for (int i = 0; i < textToChange.length(); i++) {
            for (short j = 0; j < 37; j++) {
                if (textToChange.charAt(i) == caracteres[j]) {
                    newText += morseCode[j];
                    newText += " ";
                }
            }
        }

        return newText;
    }

    @Override
    public String nettoyerAlpha(String alpha) {
        return null;
    }

    @Override
    public String getNomProgrammeurs() {
        String backProgrammeur = "Andre Cruz";

        return backProgrammeur;
    }
}
