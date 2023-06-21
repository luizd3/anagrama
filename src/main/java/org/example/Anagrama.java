package org.example;

import java.util.Map;

public class Anagrama {

    public static boolean ehAnagrama(String palavra1, String palavra2) {

        Map<Character, Integer> mapaPalavra1 = MapaPalavra.mapearPalavra(palavra1);
        Map<Character, Integer> mapaPalavra2 = MapaPalavra.mapearPalavra(palavra2);

        for (char character : mapaPalavra1.keySet()) {
                if (mapaPalavra1.get(character) != mapaPalavra2.get(character)) {
                    return false;
                }
            }
        return true;
    }
}

