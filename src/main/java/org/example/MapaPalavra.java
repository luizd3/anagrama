package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapaPalavra {

    public static Map<Character, Integer> mapearPalavra(String palavra) {
        char[] vetorPalavra = palavra.toCharArray();
        int quantidadeLetra;
        HashMap<Character, Integer> mapaPalavra = new HashMap<>();
        for (char character : vetorPalavra) {
            if (mapaPalavra.get(character) == null) {
                mapaPalavra.put(character, 1);
            } else {
                quantidadeLetra = mapaPalavra.get(character) + 1;
                mapaPalavra.put(character, quantidadeLetra);
            }
        }
        return mapaPalavra;
    }
}
