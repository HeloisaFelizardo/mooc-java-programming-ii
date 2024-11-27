
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HELOISA
 */
public class Abbreviations {

    private HashMap<String, String> abbreviationMap;

    public Abbreviations() {
        abbreviationMap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviationMap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return abbreviationMap.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return abbreviationMap.get(abbreviation);
    }
}
