
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    // Adiciona o item de parâmetro à unidade de armazenamento que também é fornecida 
    //como parâmetro.
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    //retorna uma lista que contém todos os itens da unidade de armazenamento indicada 
    //pelo parâmetro. Se não existir tal unidade de armazenamento ou não contiver itens, 
    //o método deverá retornar uma lista vazia.
    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    //remove o item fornecido da unidade de armazenamento especificada. 
    //Atenção! Remove apenas um item — se houver vários itens com o mesmo nome, 
    //o restante ainda permanecerá. Se a unidade de armazenamento ficar vazia 
    //após a remoção, o método também remove a unidade
    public void remove(String storageUnit, String item) {
        if (!this.storage.containsKey(storageUnit)) {
            return;
        }
 
        this.storage.get(storageUnit).remove(item);
 
        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }

    //retorna os nomes das unidades de armazenamento como uma lista. 
    //Atenção! Somente as unidades que contêm itens são listadas
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit : this.storage.keySet()) {
            units.add(unit);
        }
 
        return units;
    }
}
