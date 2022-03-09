package com.company.chapterone.countduplicatecharacters;

 /* Counting duplicate characters:
  Write a program that counts duplicate characters from a given string.
  */

import java.util.Map;

public class Main{
        private static final String TEXT = """
                😍Turkey Java😍
                💕💕&$$$ Community💕💕
                🎼🎼🎼🎼🎼 Tip Kata 🎼🎼🎼🎼🎼""";
    public static void main(String[] args) {

        Map<String, Long> duplicateCharacterStream = Strings.countDuplicateCharactersStream(TEXT);
        System.out.println("Duplicate characters stream : " + duplicateCharacterStream);


    }
}
