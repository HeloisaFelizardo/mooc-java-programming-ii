
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }

    /*
    Atribui o proprietário que recebeu como parâmetro a um carro que corresponde 
    à placa recebida como parâmetro. 
    Se a placa não tiver proprietário, o método retornará verdadeiro. 
    Se a licença já tiver um proprietário anexado, o método retornará false e não fará nada.
     */
    public boolean add(LicensePlate licensePlate, String owner) {
        if (owners.containsKey(licensePlate)) {
            return false;
        }

        owners.put(licensePlate, owner);

        return true;
    }

    /*
    Retorna o proprietário do carro correspondente à placa recebida como parâmetro. 
    Se o carro não estiver no registro, o método retornará nulo.
     */
    public String get(LicensePlate licensePlate) {
        return owners.get(licensePlate);
    }

    /*
    Remove a placa do carro e os dados anexados do registro. 
    O método retorna verdadeiro se removido com sucesso e falso se a placa não estava no registro.
     */
    public boolean remove(LicensePlate licensePlate) {
        if (!owners.containsKey(licensePlate)) {
            return false;
        }

        owners.remove(licensePlate);

        return true;
    }

    /*
    Imprime as placas no registro.
     */
    public void printLicensePlates() {
        for (LicensePlate e : owners.keySet()) {
            System.out.println(e);
        }
    }

    /*
    Imprime os proprietários dos carros no registro. 
    Cada nome deve ser impresso apenas uma vez, 
    mesmo que uma determinada pessoa possua mais de um carro.
     */
    public void printOwners() {
        ArrayList<String> printed = new ArrayList<>();

        for (String owner : owners.values()) {
            if (printed.contains(owner)) {
                continue;
            }

            System.out.println(owner);
            printed.add(owner);
        }
    }
}
