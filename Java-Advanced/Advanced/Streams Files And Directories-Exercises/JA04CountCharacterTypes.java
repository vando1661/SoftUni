package _8StreamsFilesAndDirectories_Exercises;

import java.io.*;

public class JA04CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        int countVowels = 0;
        int countConsonants = 0;
        int countPunctuation =0;
        String pathIn = "resources/Java-Advanced-Files-and-Streams/input.txt";
        String pathOut = "resources/Java-Advanced-Files-and-Streams/output.txt";
        BufferedReader bfr = new BufferedReader(new FileReader(pathIn));
        PrintWriter pw = new PrintWriter(pathOut);
        String line = bfr.readLine();
        while (line != null){
            char[] charactersLine = line.toCharArray();
            for (char character:charactersLine) {
                if(isVowel(character)){
                    countVowels++;
                }else if (isPunctuation(character)){
                    countPunctuation++;
               } else if (Character.isWhitespace(character)){
                    countConsonants++;
                }

            }

            line = bfr.readLine();
        }
        pw.println("Vowels: " + countVowels);
        pw.println("Consonants: " + countConsonants);
        pw.println("Punctuation: " + countPunctuation);



        bfr.close();
        pw.close();
    }

    private static boolean isPunctuation(char character) {
        return character == '!' || character == ',' || character == '.' || character == '?';
    }

    private static boolean isVowel(char character) {
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }
}
