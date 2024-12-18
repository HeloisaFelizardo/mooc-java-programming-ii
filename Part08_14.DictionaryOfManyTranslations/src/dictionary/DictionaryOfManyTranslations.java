package dictionary;


import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        // Inicializa o HashMap para armazenar as traduções.
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        // Adiciona a tradução para a palavra, preservando as traduções antigas.
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        this.dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        // Retorna uma lista das traduções adicionadas para a palavra.
        // Se a palavra não tiver traduções, retorna uma lista vazia.
        return this.dictionary.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        // Remove a palavra e todas as suas traduções do dicionário.
        this.dictionary.remove(word);
    }
}
